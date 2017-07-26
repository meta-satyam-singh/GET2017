package oop3;

import java.util.ArrayList;

public class ProductPromotion {
	
	private String promotionType;
	private String discount;
	private String products;
	
	// getters and setters for all fields
	public String getPromotionType() {
		return promotionType;
	}
	public void setPromotionType(String promotionType) {
		this.promotionType = promotionType;
	}
	public String getDiscount() {
		return discount;
	}
	public void setDiscount(String discount) {
		this.discount = discount;
	}
	public String getProducts() {
		return products;
	}
	public void setProducts(String products) {
		this.products = products;
	}
	
	// calculate product discount for all prod in cart
	public void calculatePromotionDiscount(Cart[] cart, ProductPromotion[] productPromoObj, ArrayList<String> report) {
		for (int i = 0, j = 0; i < cart.length; i++, j++) {
			String[] temp = productPromoFun(cart[i].getCode(), productPromoObj).split(","); // gets promotion in which code is
			report.add("Promotion :" + temp[0]);	// adds promotion to report
			j = j + 1;
			new Store().totalDiscount(cart[i].getQuantity()* Float.parseFloat(temp[1]));	// adds discount to total discount
			report.add("Discount :" + cart[i].getQuantity()* Float.parseFloat(temp[1]));// add discount to report
			
		report.add("\n");
		}
	}

	public String productPromoFun(String code, ProductPromotion[] productPromoObj) {
		boolean productFound = false;
		float price = new Store().productPrice(code);// gets price of prod for given code
		// checks if code is present in which promotion 
		for (int i = 0; i < productPromoObj.length; i++) {
			String[] temp = productPromoObj[i].getProducts().split(";");
			
			// checks for all codes in a promotion
			for (int j = 0; j < temp.length; j++) {
				if (temp[j].equalsIgnoreCase(code)) {
					productFound = true;
					break;
				}
			}
			if (productFound) {
				String disc = "";
				if (productPromoObj[i].getPromotionType().equalsIgnoreCase("ProductFixedAmountPromotion"))
					disc = productPromoObj[i].getDiscount();
				else
					disc = ""+ price* Float.parseFloat(productPromoObj[i].getDiscount())/ 100;
				String productNameAndCode = "";
				for (int j = 0; j < temp.length; j++) {
					productNameAndCode += ""+ new Store().productName(temp[j]) + "[ code:"+ temp[j] + " ]";
				}
				return (productPromoObj[i].getDiscount() + " off on "+ productNameAndCode + "," + disc);
			}
		}
		return null;
	}
}
