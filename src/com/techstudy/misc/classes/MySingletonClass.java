package com.techstudy.misc.classes;

public class MySingletonClass {
	
	private static volatile MySingletonClass instance;
	
	private MySingletonClass() {

	}
	
	public static MySingletonClass getInstance() {
		if(instance == null) {
			synchronized(instance) {
				if(instance == null) {
					instance = new MySingletonClass();
				}
			}
		}
		return instance;
	}
	

}
