package com.nsgglobal.test;

import java.util.HashMap;

public class HashMapClass {
	
	public static void main(String args[]) {
		
	HashMap<String, Integer> hmapListObj = new HashMap<>();
	hmapListObj.put("Hello",10);
	hmapListObj.put("Hello", 20);
	
	System.out.println("hmapListObj:\t" + hmapListObj.get("Hello"));
	}
	

}