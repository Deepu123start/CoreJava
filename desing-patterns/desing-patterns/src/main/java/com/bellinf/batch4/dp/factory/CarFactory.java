package com.bellinf.batch4.dp.factory;

public class CarFactory {

	public Car getCar(String brand){
		Car car = null;
		if("bmw".equals(brand)){
			car = new Bmw();
		}else if("audi".equals(brand)){
			car = new Audi();
		}else if("honda".equals(brand)){
			car = new Honda();
		}
		
		return car;
	}
	
	
}
