package com.bellinfo.batch4.dp.mvc;

public class MVCDemo {
//Model(Business logic/Data logic) View(display ) Controller (Data controller)
	public static void main(String[] args) {
	  
		Register model = extractRegistrationDetails();
		RegisterView view = new RegisterView();
		//Model data will get reflected in View through Controller
		RegisterController rc = new RegisterController(model, view);
		rc.updateView();
		
	}
	
	
	private static Register extractRegistrationDetails(){
		Register reg = new Register();
		reg.setId(1);
		reg.setName("Siva");;
		return reg;
	}

}
