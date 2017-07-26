package oop3;

import java.util.ArrayList;

public class OrderPromotion {
	private String promotionType;
	private String discount;
	private String threshold;
	
	// getters and setters fpr all fields of order promotion
	public String getPromotionType(){
		return promotionType;
	}
	public void setPromotionType(String promotionType){
		this.promotionType = promotionType;
	}
	public String getDiscount(){
		return discount;
	}
	public void setDiscount(String discount){
		this.discount = discount;
	}
	public String getThreshold(){
		return threshold;
	}
	public void setThreshold(String threshold){
		this.threshold = threshold;
	}
	
	// calculates discount on order
	public float orderDiscount(OrderPromotion[] orderObj, float subTotal, ArrayList<String> report) {
		float discount = 0;
		int threshold = 0;
		
		// checks for all order promotions
		for (int i = 0; i < orderObj.length; i++) {
			
			// checks if threshold of promotion is less than total of order
			if (Float.parseFloat(orderObj[i].getThreshold()) <= subTotal) {
				boolean flagForThres = false;
				float temp;
				// calculates discount for each type
				if (orderObj[i].getPromotionType().equalsIgnoreCase(
						"OrderFixedPercentPromotion")) {
					temp = (subTotal * Float.parseFloat(orderObj[i]
							.getDiscount())) / 100;
					flagForThres = true;
				} 
				else
				{
					temp = Float.parseFloat(orderObj[i].getDiscount());
					flagForThres = true;
				}
				if(flagForThres)
					threshold = i;
				if (temp > discount)
					discount = temp;
			}
		}
		
		// add promotion to report
		if(orderObj[threshold].getPromotionType().equalsIgnoreCase("OrderFixedPercentPromotion"))
			report.add("Promotion :" + orderObj[threshold].getDiscount() + "% off on orders above " + orderObj[threshold].getThreshold());
		else
			report.add("Promotion :" + orderObj[threshold].getDiscount() + " off on orders above " + orderObj[threshold].getThreshold());
		
		report.add("Discount : " + discount);
		report.add("\n");
		return discount;
	}
}
