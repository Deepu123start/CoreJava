package com.bellinf.batch4.dp.singleton;

public class BasicSingleton {
    private static BasicSingleton basicSingleton = null;
	public int a =10;
	private BasicSingleton(){
		
	}
	
	public static BasicSingleton getInstance(){
		if(basicSingleton==null){
			basicSingleton = new BasicSingleton();
		}
		return basicSingleton;	
	}
	
}
