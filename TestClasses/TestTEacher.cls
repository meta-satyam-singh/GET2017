@isTest
public class TestTEacher 
{
 static testMethod void testInsertTeacher()
 {
        Contact newTeacher = new Contact();
        Id recordTypeId = Schema.SObjectType.Contact.getRecordTypeInfosByName()
                  .get('TGT').getRecordTypeId();
        newTeacher.RecordTypeId = recordTypeId;
        newTeacher.LastName = 'singh';
        newTeacher.Subjects__c = 'Hindi';
        try
        {
           	insert newTeacher;
            System.assert(false, 'Can\'t update teacher teaching Hindi ');
        }
        catch(Exception e)
        {
            System.assert(e.getMessage().contains('Can\'t insert teacher teaching Hindi '));
        }
    }
}