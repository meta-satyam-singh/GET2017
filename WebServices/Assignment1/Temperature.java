
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Temperature 
{

	@WebMethod
	public static double convertFahrenheitToCelsius(double temperatureInFahrenheit)
	{

		double temperatureInCelsius = 0;

		try
		{

			temperatureInCelsius = ((temperatureInFahrenheit - 32)*5.0)/9.0;
		}
		catch(Exception e)
		{

			e.printStackTrace();
		}

		return temperatureInCelsius;
	}

}

