{!REQUIRESCRIPT("/soap/ajax/19.0/connection.js")}
var url = parent.location.href;
var records = {!GETRECORDIDS($ObjectType.Student__c)};
var updateRecords = [];
if (records[0] == null) 
{
	alert("Please select at least one record to delete.");
} 
else 
{
	window.location = 'apex/DeleteStudents?recs='+records.join(',')+'&retURL='+url;
}