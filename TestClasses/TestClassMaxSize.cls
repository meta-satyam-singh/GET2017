@isTest
public class TestClassMaxSize 
{
    static testmethod void testClassMaxSize()
    {
        Class__c newClass = new Class__c();
        newClass.Name =  'testClass';
        newClass.Name__c =  'testClass';
        newClass.MaxSize__c = 1;
        insert newClass;
        
        Student__c newStudent1 = new Student__c();
        newStudent1.LastName__c = 'testLName1';
        newStudent1.Class__c = newClass.Id;
        newStudent1.Sex__c = 'Female';
        
        Student__c newStudent2 = new Student__c();
        newStudent2.LastName__c = 'testLName2';
        newStudent2.Class__c = newClass.Id;
        newStudent2.Sex__c = 'Female';
        
        insert newStudent1;
        try
        {
          
        	insert newStudent2;
            System.assert(false, 'should not have been inserted');
        }
        catch(Exception e)
        {
            System.assert(e.getMessage().contains('Entries full in class '+newClass.Name));
        }

    }
}