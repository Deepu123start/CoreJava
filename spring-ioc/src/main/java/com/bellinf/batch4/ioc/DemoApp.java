package com.bellinf.batch4.ioc;

import java.util.ArrayList;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class DemoApp 
{
    public static void main( String[] args )
    {
      // LaptopDetails lp = new LaptopDetails();
    	// BeanFactory - Core Containter
    	
       ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
       LaptopDetails lp = ctx.getBean("lapDetails", LaptopDetails.class);
       String result = lp.getLaptopDetails();
       System.out.println(result);
       
       
       Netflix netflix = ctx.getBean("netflix", Netflix.class);
       ArrayList<String> list = netflix.movieList("thriller");
      if(list!=null){ 
      for(String movie:list){
    	  System.out.println(movie);
      }
      }else{
    	  System.out.println("Sorry, requested genre not avaliable. please revist");
      }
    }
}
