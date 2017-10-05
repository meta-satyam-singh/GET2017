@isTest
public class TestJson 
{
    @isTest
    public static void testJson()
    {
        String soql = 'SELECT Name FROM Account LIMIT 10';
        List<Account> acct = Database.Query(soql); 
        String expected = JSON.serializePretty(acct);
        String output = new ConvertJsonController().parseJson();
        system.assertEquals(expected,output);
    }
}