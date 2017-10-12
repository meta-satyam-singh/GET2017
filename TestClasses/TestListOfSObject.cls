@isTest
public class TestListOfSObject 
{
    @isTest 
    static void testListobjects()
    {
        List<String> listOfSObj =new AllSObjects().showAllObjects();
        System.assertEquals(400, listOfSObj.size());
    }
}