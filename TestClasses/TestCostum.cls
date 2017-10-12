@isTest
public class TestCostum 
{
   static Opportunity opp1;
   static Opportunity opp2;
   static OpportunityLineItem oppLine1;
   static OpportunityLineItem oppLine2;
   static OpportunityLineItem oppLine3;
   @testSetup static void setup()
   {
       Product2 prod = new Product2(Name = 'Laptop X200', Family = 'Hardware');
       insert prod;
       
       Id pricebookId = Test.getStandardPricebookId();
       
       PricebookEntry standardPrice = new PricebookEntry(Pricebook2Id = pricebookId, Product2Id = prod.Id, UnitPrice = 10000, IsActive = true);
       insert standardPrice;
       
       Pricebook2 customPB = new Pricebook2(Name='Custom Pricebook', isActive=true);
       insert customPB;
       
       PricebookEntry customPrice = new PricebookEntry(Pricebook2Id = customPB.Id, Product2Id = prod.Id, UnitPrice = 12000, IsActive = true);
       insert customPrice;
       
       Account acc = new Account(Name='TestAccount',AccountNumber='1');
       insert acc;
       
       opp1 = new Opportunity(Name='TestOpportunity1',AccountId=acc.Id, CloseDate=Date.newInstance(2016, 02, 03), StageName='Suspect', CustomStatus__c='New', Pricebook2Id=customPB.Id);
       opp2 = new Opportunity(Name='TestOpportunity2', AccountId=acc.Id, CloseDate=Date.newInstance(2016, 02, 03), StageName='Closed Won', CustomStatus__c='Reset', Pricebook2Id=customPB.Id);
       insert opp1;
       insert opp2;
       
       OpportunityLineItem oppLine1 = new OpportunityLineItem(OpportunityId = opp1.Id, Quantity = 4, PricebookEntryId = customPrice.Id, TotalPrice = 500);
       OpportunityLineItem oppLine2 = new OpportunityLineItem(OpportunityId = opp2.Id, Quantity = 3, PricebookEntryId = customPrice.Id, TotalPrice = 500);
       List<OpportunityLineItem> opLines = new List<OpportunityLineItem>();
       opLines.add(oppLine1);
       opLines.add(oppLine2);
       insert opLines;
   }
   //As Status Change to Reset the value of OppLineItem Must be get 0
   static testmethod void testOppCustomStatus()
   {
       List<Opportunity> opps = [Select Id, Name, StageName, CloseDate, CustomStatus__c From Opportunity];
       test.startTest();
       
       for(Opportunity opp: opps)
       {
           opp.CustomStatus__c = 'Reset';
           update opp;
       }
       test.stopTest();
       System.assertEquals(0,opps[0].OpportunityLineItems.Size());
       System.assertEquals(new List<OpportunityLineItem>(), opps[0].OpportunityLineItems);
   }
   
}
