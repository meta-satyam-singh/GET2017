@isTest
public class TestRecordType 
{
    @isTest
    public static void testRecordTypeOfClass()
    {
        Contact con = new Contact();
        con.LastName = 'Singh';
        Id recordTypeId = Schema.SObjectType.Contact.getRecordTypeInfosByName().get('PGT').getRecordTypeId();
        con.RecordTypeId = recordTypeId;
        con.Subjects__c = 'English';
        insert(con);
        Test.StartTest();         
        PageReference testPage = new pagereference('/apex/MyTest');
        ApexPages.currentPage().getParameters().put('id', con.id );        
        Test.setCurrentPage(testPage);        
        myTest controller = new myTest(new Apexpages.StandardController(con));
        System.assertEquals(recordTypeId, controller.con.RecordType.Id);
        Test.stopTest();
    }
}
