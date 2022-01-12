package com.cognizant;

public class ArrayDemo {
	
	int[] numbers;
	
      public void  StoreNumbers() {
    	  numbers = new int [101];
    	  for(int i=0; i<=100; i++){
    		  numbers[i] = i;
    	  }
		
	}
      
      public void printEvenNumber() {
    	  System.out.println("the even numbers between 0 and 100 are");
      for(int i= 0; i< numbers.length;i++) {
    	  if ((numbers[i] %2)==0) {
    		  System.out.println(numbers[i]);
    	  }
      }
      
      }
      
      public void printOddNumber() {
    	  System.out.println("the odd numbers between 0 and 100 are");
    	  for (int i=0; i <numbers.length; i++) {
    		  if((numbers[i]%2)==1) {
    			  System.out.println(numbers[i]);
    		  }
    	  }
      }
      

	public static void main(String[] args) {
		ArrayDemo arrayDemo = new ArrayDemo();
		arrayDemo.StoreNumbers();
		arrayDemo.printEvenNumber();
	    arrayDemo.printOddNumber();

	}

}
