public class Accounts extends fflib_SObjectDomain
{
	//override onafterupdate onafterinsert and onbeforedelete function from fflib_SObjectDomain virtual class
	//
	 public Accounts(List<Account> sObjectList)
	{
		// Domain classes are initialised with lists to enforce bulkification throughout
		super(sObjectList);
	}
 
    public override void onAfterInsert()
    {	
        updateChildCountField();
	}
	
	public override void onAfterUpdate(map<id, SObject> existingRecords) 
    {
        updateChildCountField();
    }
    
    public override void onAfterDelete()
    {
        Map<Id, Integer> accountsWithChildCount = new Map<Id, Integer>();
        for(Account acc: [Select Id, Name, ChildCount__c From Account])
        {
            if(acc.ChildCount__c == null)
            {
            	accountsWithChildCount.put(acc.Id, 0);
            }
            else
            {
                accountsWithChildCount.put(acc.Id, (Integer)acc.ChildCount__c);
            }
        }
        
        List<Account> accounts = [Select Id, Name, ParentAccount__c, ChildCount__c From Account Where Id In :accountsWithChildCount.keySet()];
		for(Account account : (List<Account>) Records)
		{
            if(account.ParentAccount__c != null)
            {
                accountsWithChildCount.put(account.ParentAccount__c, accountsWithChildCount.get(account.ParentAccount__c)-1);
            }
		}
        List<Account> accountsToUpdate = new List<Account>();
        for(Account acc: accounts)
        {
            acc.ChildCount__c = (Decimal)accountsWithChildCount.get(acc.Id);
            accountsToUpdate.add(acc);
        }
        update accountsToUpdate;
    }
    
    private void updateChildCountField()
    {
        Map<Id, Integer> accountsWithChildCount = new Map<Id, Integer>();
        
        for(Account acc: [Select Id, Name, ChildCount__c From Account])
        {
            if(acc.ChildCount__c == null)
            {
            	accountsWithChildCount.put(acc.Id, 0);
            }
            else
            {
                accountsWithChildCount.put(acc.Id, (Integer)acc.ChildCount__c);
            }
        }
        
        List<Account> accounts = [Select Id, Name, ParentAccount__c, ChildCount__c From Account Where Id In :accountsWithChildCount.keySet()];
		for(Account account : (List<Account>) Records)
		{
            if(account.ParentAccount__c != null)
            {
                accountsWithChildCount.put(account.ParentAccount__c, accountsWithChildCount.get(account.ParentAccount__c)+1);
            }
		}
        List<Account> accountsToUpdate = new List<Account>();
        for(Account acc: accounts)
        {
            acc.ChildCount__c = (Decimal)accountsWithChildCount.get(acc.Id);
            accountsToUpdate.add(acc);
        }
        update accountsToUpdate;
    }
    
    public class Constructor implements fflib_SObjectDomain.IConstructable
	{
		public fflib_SObjectDomain construct(List<SObject> sObjectList)
		{
			return new Teachers(sObjectList);
		}
	}
    
}