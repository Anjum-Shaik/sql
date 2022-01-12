package com.cognizant;


import java.util.ArrayList;
import java.util.Collection;

public class ArrayListEx {
	
	public ArrayList getcountryList(String c1, String c2,String c3,
			String c4, String c5){
		
		ArrayList countryList = new ArrayList();
		countryList.add(c1);
		countryList.add(c2);
		countryList.add(c3);
		countryList.add(c4);
		countryList.add(c5);
		return countryList;
		
	}

	public ArrayList get1To10()  {
		ArrayList numlist = new ArrayList();
		for(int i=1;i<=10;i++)
		{
			numlist.add(i);
			
			
		}
	return numlist;
	}
	
	public ArrayList get1To15(Collection numlist) {
		ArrayList numlist2 = new ArrayList();
		numlist2.addAll(numlist);
		for(int i=11; i<=15;i++) {
			numlist2.add(i);
			
		}
		return numlist2;
	}
	
}
