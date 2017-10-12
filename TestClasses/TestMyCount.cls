@isTest
public class TestMyCount 
{
	
    static testmethod void testMyCount()
    {
        
        Class__c newClass = new Class__c();
        newClass.Name =  'testClass';
        newClass.Name__c =  'testClass';
        newClass.MaxSize__c = 3;
        insert newClass;
        
        Student__c newStudent1 = new Student__c();
        newStudent1.LastName__c = 'testLName1';
        newStudent1.Class__c = newClass.Id;
        newStudent1.Sex__c = 'Female';
        
        Student__c newStudent2 = new Student__c();
        newStudent2.LastName__c = 'testLName2';
        newStudent2.Class__c = newClass.Id;
        newStudent2.Sex__c = 'Female';
	    
	List<Student__c> students = new List<Student__c>();
        students.add(newStudent1);
        students.add(newStudent2);
        insert students;
        List<Class__c> counts = [select MyCount__c from Class__c where id =: newClass.Id];
        Double count1 = (Double)counts.get(0).MyCount__c;
        System.assertEquals(2.0, count1);
    }
}
