package com.cognizant;


  public  static CastingDemo(); {
	
	
	private static void implicitCasting() {
		
	
		
		NRIAccount o1 = new NRIAccount();
		// No explicit casting required 
		BankAccount V1;
		V1 = o1;
		V1.applyFixedDeposit();
	}
 private static void explicitCasitng() {
	 
	 BankAccount o1 = new NRIAccount();
	 NRIAccount V1;
	 // Explicit casting is required
	 o1.depositAmount = 3500;
	 V1 = (NRIAccount)  o1;
	 V1.depositMoney();	
}
 
 private static void tryInstanceOF () {
	 
	 BankAccount o1 = new NRIAccount();
	 BankAccount o2 = new NRIAccount();
	 BankAccount o3 = new SeniorCitizenAccount();
	 
	if (o1 instanceof NRIAccount)  {
		System.out.println("Can typecast o1 to NRIAccount");
	o1 = o2;
	}
	else {
		System.out.println("Cannot typecast o1 to NRIAccount");
	}
	if (o3 instanceof NRIAccount) {
		System.out.println("Can typecast o3 to NRIAccount");
		o3 = o2;	
		}
	else{
		System.out.println("Cannot typecast o3 to NRIAccount");
		
	}
 }
public static void main(String[] args){
	
	System.out.println("implicitcasting");
     System.out.println("explicitCasting");
	System.out.println("tryInstanceOf");
}
}


