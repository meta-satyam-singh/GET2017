package oop3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Store 
{
	private ReadFile readFileProduct, readFileProductPromotion,
			readFileOrderPromotion;
	private String[] product;		// string array for all the products
	private String[] productPromo;	// string array for all the product promotions	
	private String[] orderPromo;    // string array for all the order promotions
	private int numOfProd;			// stores no. of products user want to buy
	static float totalDiscount = 0; // stores total discount on all the products 
	private static float subTotal = 0; // stores price without discount
	Scanner scan;
	Cart[] cart;
	ProductPromotion[] productPromoObj;
	static Product[] productObj;
	static OrderPromotion[] orderObj;
	ArrayList<String> report = new ArrayList<String>(); // array list to create the report
		
	// do nothing constructor
	public Store() 
	{

	}
	
	// constructor initializing product and promotions file
	public Store(String productPath, String productPromotionPath, String orderPromotionPath) 
	{
		readFileProduct = new ReadFile(productPath);
		readFileProductPromotion = new ReadFile(productPromotionPath);
		readFileOrderPromotion = new ReadFile(orderPromotionPath);
		displayDetails();	// display details from all the files

	}
	
	// displays details from product and promotions and files
	private void displayDetails() 
	{
		try 
		{
			System.out.println("List of Products");
			product = readFileProduct.readLines(); // gets all the lines from the file
			productObj = new Product[product.length];
			
			// splits and stores in product array
			for (int i = 0; i < product.length; i++) 
			{
				productObj[i] = new Product();
				System.out.println(product[i]);
				String[] temp = product[i].split(",");	// splits by ','
				productObj[i].setProductCode(temp[0]);	// stores product code 
				productObj[i].setProductName(temp[1]);	// stores product name
				productObj[i].setPrice(temp[2]);		// stores product price
			}
			System.out.println("Product Promotions");
			productPromo = readFileProductPromotion.readLines(); // gets all lines from product prom file
			productPromoObj = new ProductPromotion[productPromo.length];
			
			// splits and stores in product prom array
			for (int i = 0; i < productPromo.length; i++) 
			{
				productPromoObj[i] = new ProductPromotion();
				System.out.println(productPromo[i]);
				String[] temp = productPromo[i].split(",");
				productPromoObj[i].setPromotionType(temp[0]);
				productPromoObj[i].setDiscount(temp[1]);
				productPromoObj[i].setProducts(temp[2]);
			}

			System.out.println("Order Promotion");
			orderPromo = readFileOrderPromotion.readLines();	// geta all lines from order prom file
			orderObj = new OrderPromotion[orderPromo.length];
			for (int i = 0; i < orderPromo.length; i++) 
			{
				orderObj[i] = new OrderPromotion();
				System.out.println(orderPromo[i]);
				String[] temp = orderPromo[i].split(",");
				orderObj[i].setPromotionType(temp[0]);
				orderObj[i].setDiscount(temp[1]);
				orderObj[i].setThreshold(temp[2]);
			}

		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	// calculates total price of products and takes code and quantity entered by user
	public String calculatePrice(int quantity, String code) 
	{
		// checks in all the products
		for (int i = 0; i < productObj.length; i++) 
		{
			if (productObj[i].getProductCode().equalsIgnoreCase(code)) 
			{
				float price = Float.parseFloat(productObj[i].getPrice());
				float amount = quantity * price;			// calculate the net amount for each prod.
				subTotal += amount;							// add that amount to subtotal
				return (amount + "( " + quantity + " x " + price + " )"); // returns the net amount
			}
		}
		return null;   			// if product not found return null
	}
	
	// adds the order of user to the report
	public void createPurchaseReport() 
	{
		// for all objects in the cart
		for (int i = 0; i < cart.length; i++) 
		{
			report.add("PRODUCTS : " + cart[i].getCode() + " - "+ productName(cart[i].getCode()));  // add product to the report
			report.add("COST : "+ calculatePrice(cart[i].getQuantity(),cart[i].getCode()) + "\n");  // add net amount of that product
			report.add("\n");
		}
		// calculate promotion discount on all the objects in the cart
		new ProductPromotion().calculatePromotionDiscount(cart,productPromoObj, report);
	}

	// returns product name corresponding to the code
	public String productName(String code) 
	{
		for (int i = 0; i < productObj.length; i++) 
		{
			if (productObj[i].getProductCode().equalsIgnoreCase(code)) 
				return productObj[i].getProductName();
		}
		return null;
	}
	
	// returns product price corresponding to the code
	public float productPrice(String code) 
	{
		for (int i = 0; i < productObj.length; i++) 
		{
			if (productObj[i].getProductCode().equalsIgnoreCase(code)) 
				return Float.parseFloat(productObj[i].getPrice())
		}
		return -1;
	}
	// adds the amount to the total discount
	public void totalDiscount(float amount) 
	{
		totalDiscount += amount;
	}

	// method to take input from user and create order
	public void createOrder() 
	{
		scan = new Scanner(System.in);
		System.out.println("Enter number of Products you wanna buy");
		numOfProd = scan.nextInt();
		scan.nextLine();
		cart = new Cart[numOfProd];			//array of cart of size equal to no. of products
		
		// scans input from user and create obj of type cart
		for (int i = 0; i < numOfProd; i++) 
		{
			cart[i] = new Cart();
			do 
			{
				System.out.println("Enter Product Code " + (i + 1) + " :");
				String code = scan.nextLine();
				
				//validates if code is present in list of products
				if (new Validation().validateCode(code, productObj)) 
				{
					cart[i].setCode(code);
					break;
				} 
				else
					System.out.println("Enter Valid Code ");
			}
			while (true);
			do
			{
				System.out.println("Enter Quantity of " + cart[i].getCode()+ " :");
				String checkQuantity = scan.nextLine();
				
				// validates if given quantity is number
				int quantity = new Validation()
						.validateAnswerNumber(checkQuantity);
				if (quantity > 0) 
				{
					cart[i].setQuantity(quantity);
					break;
				}
			} 
			while (true);
		}
	}

	
	public void fillReport() 
	{
		report.add("##################################################### ");
		report.add("YOUR ORDER :");
		report.add("#####################################################");
		report.add("\n");
		createOrder();
		createPurchaseReport();
		float sub_total = subTotal;
		subTotal -= totalDiscount;
		float oderLevelDiscount = new OrderPromotion().orderDiscount(orderObj,subTotal,report);
		report.add("Subtotal = " + sub_total);		// adds total without discount
		report.add("Product Level Discount = " + totalDiscount);	// adds product level discount
		report.add("Order Level Discount = " + oderLevelDiscount);	// adds order level discount
		totalDiscount += oderLevelDiscount;
		report.add("TotalDiscount = " + totalDiscount);	// adds total discount
		float total = sub_total - totalDiscount;
		report.add("Total = " + total);
		for (int i = 0; i < report.size(); i++)
			System.out.println(report.get(i));
		CreateReport createReport = new CreateReport("local_resources/Report.txt");		// creates report
		createReport.saveResult(report);
	}

	public static void main(String[] args) 
	{
		
		Store store = new Store("local_resources/ProductList.csv", "local_resources/ProductPromo.csv",				
				"local_resources/OrderPromo.csv");
		store.fillReport();
	}

}
