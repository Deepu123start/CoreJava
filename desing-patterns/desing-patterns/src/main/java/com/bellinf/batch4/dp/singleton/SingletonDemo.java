package com.bellinf.batch4.dp.singleton;

/**
 * Hello world!
 *
 */
public class SingletonDemo 
{
    public static void main( String[] args )
    {
       //BasicSingleton bs = new BasicSingleton();
    	BasicSingleton bs1 =  BasicSingleton.getInstance();
    	System.out.println(bs1);
    	System.out.println(bs1.a);
    	BasicSingleton bs2 = BasicSingleton.getInstance();
    	System.out.println(bs2);
    	bs2.a++;
    	System.out.println(bs2.a);
    	System.out.println(bs1.a);
    	
    }
    
}
