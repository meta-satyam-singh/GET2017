@isTest
public class TestController 
{
    @isTest
    public static void testAccount()
    {
        Account ac = new Account() ;
        ac.Name = 'testing new account' ;
        ac.AccountNumber = '99999999999999999' ; 
        insert ac ;        
        
        Test.StartTest();         
        PageReference testPage = new pagereference('/apex/AccountPage');
        ApexPages.currentPage().getParameters().put('id', ac.id );        
        Test.setCurrentPage(testPage);        
        AccountFilterController scc = new AccountFilterController() ;
        scc.getBillingCityString= 'A' ;
        scc.getBillingStateString='B';
        scc.getBillingCountryString='C';
        scc.searchRecords();
        String query = 'SELECT id,name,billingcity,billingCountry,billingState FROM Account where billingcity' +' LIKE \'%'+scc.getBillingCitystring+'%\' AND '+' billingcountry  LIKE  \'%'+scc.getBillingCountrystring+'%\' AND '+' billingstate LIKE  \'%'+scc.getBillingStatestring+'%\'';
        List<Account> expected= Database.query(Query);
        System.assertEquals(expected,scc.createAccountList);        
        Test.StopTest();
    }
}