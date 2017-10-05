@isTest
public class TestStageChangeDomain 
{
	
    static testmethod void testStageChangeDomain()
    {
        Opportunity testOpp = new Opportunity();
        testOpp.Name = 'testOppName';
        testOpp.StageName = 'Prospecting';
        testOpp.CloseDate = System.today().addDays(-2);
        insert testOpp;
        
        testOpp.StageName = 'Closed Won';
        update testOpp;
        List<Opportunity> list1 = [select CloseDate , StageName from Opportunity where id =: testOpp.id];
        System.assertEquals('Closed Won', list1.get(0).StageName);
        System.assertEquals(System.today(), list1.get(0).CloseDate);
        
    }
}