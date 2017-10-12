@isTest
public class TestJson 
{
    @isTest
    public static void testJson()
    {
        List<Account> acc = new List<Account>();
        for(integer i =0 ; i<10; i++)
        {
        	Account a1 = new Account(Name = 'Test'+i);
            acc.add(a1);
        }
        String expected = JSON.serializePretty(acc);
        String output = new ConvertJsonController().parseJson();
        system.assertEquals(expected,output);
    }
}
