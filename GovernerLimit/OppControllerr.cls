public class OppControllerr 
{
    public List<OppWrapper> myList = new List<OppWrapper>();
    public Id selectedAcc{get;set;}
    public Decimal sum{get;set;}
    public List<SelectOption> accs{get
    {
        List<SelectOption> opps = new List<SelectOption>();
        for(Account a : [SELECT Id, name from Account limit 10])
        {
            opps.add(new SelectOption(a.Id, a.Name));
        }
        return opps;
    }}
    public PageReference refresh()
    {	
        sum = 0.00;
        myList.clear();
        System.debug('in refresh'+selectedAcc);
        for(Account a : [select id, name, (select name, Amount from opportunities) from Account where Id = :selectedAcc])
        {
            for(Opportunity opp : a.Opportunities)
            {
                sum += opp.Amount;
                myList.add(new OppWrapper(false, opp));
            }
        }
        return null;
    }
    
    public List<OppWrapper> getMyList()
    {
        System.debug('count'+myList.size());
        return myList;
    }
}