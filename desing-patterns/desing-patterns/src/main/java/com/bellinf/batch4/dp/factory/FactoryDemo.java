package com.bellinf.batch4.dp.factory;

public class FactoryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarFactory carFactory = new CarFactory();
		Car car = carFactory.getCar("honda");
		car.modals();

	}

}
