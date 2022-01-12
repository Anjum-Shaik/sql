package com.cognizant;

public class childclass {
	 
	class  A{
		
		public void methodA() 
		{
			System.out.println("class A");
		}
	}
	class B extends A{
		 public void methodB()
		 {
			 System.out.println("class B");
		 }
	}
	
	class C extends A{
		
		public void methodC()
		{
			System.out.println("class C");
		}
	}
}

	
