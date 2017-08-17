package DefaultNamespace;

import java.util.Scanner;

public class TemperatureClient 
{
	public static void main(String[] args) 
	{
		TemperatureServiceLocator locatorObject = new TemperatureServiceLocator();
		locatorObject.setTemperatureEndpointAddress("http://localhost:8080/WSo1/services/Temperature");
		boolean flag;
		Scanner scan = new Scanner(System.in );
		double temperature;
		String repeat;
		do
		{
			flag = false;
			try
			{
				Temperature temperatureObject = locatorObject.getTemperature();
				System.out.println("Enter temperature in Fahrenheit: ");
				temperature = scan.nextDouble();
				System.out.println("Temperature in celsius is: " + temperatureObject.convertFahrenheitToCelsius(temperature));
				System.out.println("Check another temperature: (y/n)");
				repeat = scan.next();
				switch (repeat) 
				{
					case "y":
					case "Y":
						main(args);	
						break;
					default:
						System.out.println("Thank You.");
						System.exit(0);
						break;
				}
			}
			catch (Exception exception) 
			{
				System.out.println(exception.getMessage());
			}
			finally
			{
				scan.close();
			}
		} 
		while (flag);
	}
}
