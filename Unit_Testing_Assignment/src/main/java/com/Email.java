package com;

public class Email {
	public boolean emailContains(String email) {
		if(email.contains("@")) {
			return true;
		}
		else
			return false;
	}
}
