package com.bellinf.batch4.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext ctx = new ClassPathXmlApplicationContext("sterotype-config.xml");
       
       Plane p = ctx.getBean(Plane.class);
       p.engine.displayEngineDetails();
       p.pilotInfo.displayPilotDetails();
    	
    }
}
