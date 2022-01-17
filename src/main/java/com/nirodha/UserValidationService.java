package com.nirodha;

public class UserValidationService {

	public boolean isUserValid (String name, String password) {
		
		if(name.equals("Nirodha") && password.equals("123")) {
			return true;
		}
		else {
			return false;
		}
	
	}
}
