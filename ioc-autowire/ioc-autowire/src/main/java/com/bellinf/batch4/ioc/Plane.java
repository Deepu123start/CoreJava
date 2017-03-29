package com.bellinf.batch4.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Plane {

	@Qualifier(value="e2")
	@Autowired
	private Engine engine;
	
	public void setEngine(Engine engine){
		this.engine = engine;
	}
	
	public Engine getEngine(){
		return engine;
	}
	
	
}
