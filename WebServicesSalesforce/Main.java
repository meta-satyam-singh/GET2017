package webServices;
import com.sforce.soap.enterprise.Connector;
import com.sforce.soap.enterprise.EnterpriseConnection;
import com.sforce.soap.enterprise.QueryResult;
import com.sforce.soap.enterprise.SaveResult;
import com.sforce.soap.enterprise.sobject.Contact;
import com.sforce.soap.enterprise.sobject.Student__c;
import com.sforce.ws.ConnectionException;
import com.sforce.ws.ConnectorConfig;

public class Main 
{
	static final String USERNAME = "satyam1@metacube.com";
	static final String PASSWORD = "#skyline@123HJMceFzG84lrd6PbyTt7aemj";
	static EnterpriseConnection connection;
	public static void main(String[] args) 
	{
		ConnectorConfig config = new ConnectorConfig();
		config.setUsername(USERNAME);
		config.setPassword(PASSWORD);
		try 
		{
			connection = Connector.newConnection(config);
			System.out.println("Auth EndPoint: " + config.getAuthEndpoint());
			System.out.println("Service EndPoint: " + config.getServiceEndpoint());
			System.out.println("Username: " + config.getUsername());
			System.out.println("SessionId: " + config.getSessionId());
		}
		catch (ConnectionException e1) 
		{
			e1.printStackTrace();
		}
		queryContacts();
		createStudents();
	}

	private static void queryContacts() 
	{
		System.out.println("Querying for the 5 newest Contacts...");
		try 
		{

			// query for the 5 newest contacts

			QueryResult queryResults = connection.query("SELECT Id, FirstName, LastName, Account.Name " +
					"FROM Contact WHERE AccountId != NULL ORDER BY CreatedDate DESC LIMIT 5");
			if (queryResults.getSize() > 0) 
			{
				for (int i = 0; i < queryResults.getRecords().length; i++) 
				{
					// cast the SObject to a strongly-typed Contact

					Contact cont = (Contact) queryResults.getRecords()[i];
					System.out.println("Id: " + cont.getId() + " - Name: " + cont.getFirstName() + " " +
						cont.getLastName() + " - Account: " + cont.getAccount().getName());
				}
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

	// create 5 test Accounts

	private static void createStudents() 
	{
		System.out.println("Creating 5 new test Students...");
		Student__c[] records = new Student__c[5];
		try 
		{
			// create 5 test students

			for (int i = 0; i < 5; i++) 
			{
				Student__c student = new Student__c();
				student.setLastName__c("Test Student " + (i + 10));
				student.setClass__c("a017F0000054Nvb");
				records[i] = student;
			}

			// create the records in Salesforce.com

			SaveResult[] saveResults = connection.create(records);

			// check the returned results for any errors

			for (int i = 0; i < saveResults.length; i++) 
			{
				if (saveResults[i].isSuccess()) 
				{
					System.out.println(i + ". Successfully created student record - Id: " + saveResults[i].getId());
				} 
				else 
				{
					com.sforce.soap.enterprise.Error[] errors = saveResults[i].getErrors();
					for (int j = 0; j < errors.length; j++) 
					{
						System.out.println("ERROR creating student record: " + errors[j].getMessage());
					}
				}
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
