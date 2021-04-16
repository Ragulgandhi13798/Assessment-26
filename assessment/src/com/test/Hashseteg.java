package com.test;

import java.util.HashSet;

public class Hashseteg {

	public static void main(String[] args) {
		HashSet<String> h1 = new HashSet<String>();
		h1.add("curran");
		h1.add("sam");
		h1.add("david");
		
		System.out.println(h1);
		
		//add element
		//no order
		
		h1.add("karthi");
		System.out.println(h1);
		
	}

}
