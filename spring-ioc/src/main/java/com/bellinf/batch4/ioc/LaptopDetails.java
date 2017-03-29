package com.bellinf.batch4.ioc;

public class LaptopDetails {
	
	String brand;
	int price;
	
	public LaptopDetails(String brand, int price){
		this.brand = brand;
		this.price = price;
	}
	
	public String getLaptopDetails(){
		return "brand "+brand +" price "+price;
	}
	

}
