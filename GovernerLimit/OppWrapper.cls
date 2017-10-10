public class OppWrapper 
{
   public Boolean selected{get;set;}
   public Opportunity opp{get;set;}
   public OppWrapper(Boolean selected1, Opportunity opp1)
   {
       selected = selected1;
       opp = opp1;
   }

}