@IsTest
public class TestNumOfWorkingDays 
{
   // when date1<date2
   public static testmethod void testMethod1()
   {
       date d1 = date.newInstance(2017, 8, 1);
       date d2 = date.newInstance(2017, 8, 20);
       Integer expected = 13;
       Integer result = WorkingDays.numOfWorkingDays(d1,d2);
       System.assertEquals(expected,result);
   }
   // when date1>date2
   public static testmethod void testMethod2()
   {
       date d1 = date.newInstance(2017, 8, 1);
       date d2 = date.newInstance(2017, 7, 20);
       Integer expected = -1;
       Integer result = WorkingDays.numOfWorkingDays(d1,d2);
       System.assertEquals(expected,result);
   }
}