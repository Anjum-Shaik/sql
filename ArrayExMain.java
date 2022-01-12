package com.cognizant;


import java.util.ArrayList;
import java.util.Collection;

public class ArrayExMain {

	public static void main(String[] args) {
		ArrayListEx ex1 = new ArrayListEx();
		System.out.println(ex1.getcountryList("India","Australia","England","South Africa","New Zealand"));
		ArrayList numlist=ex1.get1To10();
		System.out.println(numlist);
		Collection ArrayList = null;
		System.out.println(ex1.get1To15(ArrayList));

	}

}
