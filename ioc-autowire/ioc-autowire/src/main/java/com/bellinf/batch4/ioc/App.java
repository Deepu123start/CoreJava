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
    	
        ApplicationContext ctx = new ClassPathXmlApplicationContext("autowire-config.xml");
        Plane p = ctx.getBean("plane", Plane.class);
        p.getEngine().display();
        

    }
}
