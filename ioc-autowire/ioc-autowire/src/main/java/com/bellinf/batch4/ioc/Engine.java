package com.bellinf.batch4.ioc;

import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	private String engineType;
	public void setEngineType(String engineType){
		this.engineType = engineType;
	}

	public void display(){
		System.out.println(engineType);
	}
	
}
