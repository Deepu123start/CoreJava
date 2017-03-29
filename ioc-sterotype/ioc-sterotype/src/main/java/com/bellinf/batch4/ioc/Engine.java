package com.bellinf.batch4.ioc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	
	@Value("${plane.engine.type}")
	String engineType;
	
	public void displayEngineDetails(){
		System.out.println(engineType);
	}

}
