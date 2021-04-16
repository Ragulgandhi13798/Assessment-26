package com.test;

import java.util.HashMap;
import java.util.Map;

public class Hasheg {

	public static void main(String[] args) {
		HashMap<Integer, String> h = new HashMap<Integer,String>();
		h.put(11,"ragul");
		h.put(12,"vijay");
		h.put(13,"ajith");
		h.put(14,"karthi");
		 
		for(Map.Entry<Integer, String> m : h.entrySet());
		System.out.println(h);

	}

}
