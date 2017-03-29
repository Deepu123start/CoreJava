package com.bellinf.batch4.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Plane {
	
	@Autowired
	Engine engine;
	
     @Autowired
     PilotInfo pilotInfo;

}
