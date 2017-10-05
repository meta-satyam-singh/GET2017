@isTest
public class TestMyStack 
{
    
    /*
     * test method for method 'push()' 
     */
    @isTest static void testPush()
    {
        StackClass mystack = new StackClass();
        mystack.push(new Account(Name='abc'));
        Account TestAcc = (Account)mystack.top();
        system.assertEquals('abc',TestAcc.Name);
    }
    
    /*
     * test method for method 'pop()' 
     */
    @isTest static void testPop()
    {
        StackClass mystack = new StackClass();
        mystack.push(new Account(Name='abc'));
        mystack.push(new Account(Name='xyz'));
        Account TestAcc = (Account)mystack.pop();
        system.assertEquals('xyz',TestAcc.Name);
    }
    
    /*
     * test method for method 'pop()' : underflow condition
     */
    @isTest static void testPopUnderflow()
    {
        StackClass mystack = new StackClass();
        Account TestAcc = (Account)mystack.pop();
        system.assertEquals(null,TestAcc);
    }
    
    /*
     * test method for method 'top()' : underflow condition
     */
    @isTest static void testTopUnderflow()
    {
        StackClass mystack = new StackClass();
        Account TestAcc = (Account)mystack.top();
        system.assertEquals(null,TestAcc);
    }
    
    @isTest static void testIsEmpty()
    {
        StackClass mystack = new StackClass();
        system.assertEquals(true, mystack.isEmpty());
        mystack.push(new Account(Name='abc'));
        system.assertEquals(false, mystack.isEmpty());
        
    }
}