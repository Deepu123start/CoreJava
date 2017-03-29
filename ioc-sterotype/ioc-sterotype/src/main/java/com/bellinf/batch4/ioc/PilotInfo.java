package com.bellinf.batch4.ioc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.*;

@Component
public class PilotInfo {
	
	@Value("${plane.pilot.name}")
	String pilotName;
	
	public void displayPilotDetails(){
		System.out.println(pilotName);
		
	}
	
	@PostConstruct
	public void afterLoading(){
		System.out.println("This is a post PIlotInfo instance creation. And before accessign the PilotINfo Class");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("This will be called when container trigger destroy");
	}

}
