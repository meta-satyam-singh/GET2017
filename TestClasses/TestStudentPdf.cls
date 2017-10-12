@isTest
public class TestStudentPdf 
{
     public static testMethod void testMyController() 
     {
         Student__c student = new Student__c();
         student.Name = 'Satyam';
         student.LastName__c = 'Singh';
         student.Class__c = 'a017F0000052eHM';
		 insert(student);         
         Test.StartTest();         
         PageReference testPage = new pagereference('/apex/StudentPdf');
         ApexPages.currentPage().getParameters().put('id', student.id );        
         Test.setCurrentPage(testPage);        
         StudentPdfController controller = new StudentPdfController(new Apexpages.StandardController(student));
         controller.attach();
         List<Attachment> attachment = new List<Attachment>();
         attachment=  [SELECT Id, Name, Body, ContentType FROM Attachment WHERE Parentid =:student.Id];
         System.assertEquals(1,attachment.size());
         Test.stopTest();
     }
	
}