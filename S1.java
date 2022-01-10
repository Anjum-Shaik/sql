package S1;

import java.util.*;
public class MenuList 
{
	//static String a = "abc";
	//public static System.out.println("a");
	static Scanner sc = new Scanner(System.in);
  public static void main(String[] args)
	{
		  System.out.println("Welocme to our hotel XYZ");
	      int select;
	      RandomClass.menu();
	      select = sc.nextInt();
	      switch (select)
	      {
	      case 1:
        	  System.out.println("Please enter your details");
        	  sc.nextLine();
        	  RandomClass.register();
              break;
          case 2:
        	  System.out.println("Welcome to room booking process");
        	  sc.nextLine();
        	  RandomClass.roomBooking();
        	 // RandomClass.date();
        	  RandomClass.quit();
        	  break;
         case 3:
              System.out.println("Fetching the data of all available rooms...");
              sc.nextLine();
              RandomClass.roomDetails();
              break;
         case 4:
        	  System.out.println("Welcome to Phone NUmber updation process");
        	  sc.nextLine();
        	  RandomClass.emailUpdation();
        	  break;
         case 5:
              System.out.println("Fetching the data of all customers...");
              sc.nextLine();
              RandomClass.allCustomers();
              break;
         case 6:
              System.out.println("Quitting Process...");
              sc.nextLine();
              RandomClass.quit();
             // RandomClass.convertStringToDate(null);
              break;
         default:
              System.out.println("Invalid Option");
              break;
	      }
	}
}



package S1;
import java.util.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
public class RandomClass 
{
	         //Scanner sc = new Scanner(System.in);
		static List<String>companyName = new ArrayList<String>();
		static List<String>employeeName = new ArrayList<String>();
		static List<Integer>employeeID = new ArrayList<Integer>();
		static List<Long>phoneNumber = new ArrayList<Long>();
		static List<String>email_ID = new ArrayList<String>();
		
		static int maxroom = 100;
		static int regcount = 0;
		static int roomcount = 0;
		
		static void menu()
		{
		      System.out.println(" Welcome");
		      System.out.println("1. Registeration Process - To make a new registration");
		      System.out.println("2. Room Details - Book a room, check room status and availabilities");
		      System.out.println("3. All booking details of the rooms in the hotel");
		      System.out.println("4. Email change or updation");
		      System.out.println("5. All Customers");
		      System.out.println("6. Quit");
		      System.out.println("Select an option");
		}
		
		static void register()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter your Company name : ");
			companyName.add(sc.nextLine());
			System.out.println("Please enter your name : ");
			employeeName.add(sc.nextLine());
			System.out.println("Please enter your Employee ID : ");
			employeeID.add(sc.nextInt());
			System.out.println("Please enter your Phone number : ");
			phoneNumber.add(sc.nextLong());
			System.out.println("Please enter your email ID : ");
			email_ID.add(sc.next());
			sc.nextLine();
			System.out.println("Please enter the date : ");
			LocalDate l_date = LocalDate.now();        
		    System.out.println("Date : " + l_date);
			System.out.println(companyName.toString());
			System.out.println(employeeName.toString());
			System.out.println(employeeID.toString());
			System.out.println(phoneNumber.toString());
			System.out.println(email_ID.toString());
			//System.out.println("Current date: " + l_date);
			regcount++; //regcount = regcount+1
			
			sc.nextLine();
			System.out.println("Please select an option");
			System.out.println("0. I want to register a new person");
			System.out.println("1. Quit");
			int reg = sc.nextInt();
			if(reg == 0)
			{
				register();
			}
			else 
			{
				System.out.println("Thankyou");
			}
			sc.nextLine();
			System.out.println("Please select an option");
			System.out.println("0. I would like to book a room");
			System.out.println("1. I would like to open menu");
			System.out.println("2. Quit");
			int check = sc.nextInt();
			if(check == 0)
			{
				roomBooking();
			}
			else if(check == 1)
			{
				MenuList.main(null);
			}
			else
			{
				System.out.println("Thankyou");
			}
		}
		
		static void roomBooking()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Please select an option");
			System.out.println("0. Continue Booking");
			System.out.println("1. Menu");
			int x = sc.nextInt();
			if(x == 0)
			{
				int n;
				System.out.println("Please enter the number of rooms");
				n = sc.nextInt();
				for(int i=1;i<=n;i++)
				{
					System.out.println("You are allocated with the room number : "+ i);
					roomcount++;
				}
				date();
				System.out.println("Thankyou, your booking is been confirmed");
				System.out.println("Vacant rooms count : " + (maxroom-roomcount));
				quit();
			}
			else 
			{
				MenuList.main(null);
			}
		}
		static void roomDetails()
		{
		    register();
			Scanner sc = new Scanner(System.in);
			System.out.println("Please select an option");
			System.out.println("0. Continue checking the room details");
			System.out.println("1. Menu");
			int y = sc.nextInt();
			if(y == 0)
			{
				for(int i=1;i<=roomcount;i++)
				{
					System.out.println("Room number " + i + " Occupied");
				}
				System.out.println("Vacant rooms count : " + (maxroom-roomcount));
				quit();
			}
			else
			{
				MenuList.main(null);
			}
		}	
		static void emailUpdation()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Please select an option");
			System.out.println("0. Continue with email updation");
			System.out.println("1. Menu");
			int z = sc.nextInt();
			if(z == 0)
			{
				register();
				System.out.println("Please enter your new email : ");
				int index = email_ID.indexOf(email_ID.set(0,sc.next()));
				System.out.println("Your company name : " + companyName.toString());
				System.out.println("Your name : " + employeeName.toString());
				System.out.println("Your Employee ID : " + employeeID.toString());
				System.out.println("Your mobile number : " + phoneNumber.toString());
				System.out.println("Your updated email_ID : " + email_ID.toString());
				quit();
			}
			else
			{
				MenuList.main(null);
			}
		}
		static void allCustomers()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Please select an option");
			System.out.println("0. Continue to fetch the details of all customers");
			System.out.println("1. Menu");
			int a = sc.nextInt();
			if(a == 0)
			{
				register();
				System.out.println("Your company name : " + companyName.toString());
				System.out.println("Your name : " + employeeName.toString());
				System.out.println("Your Employee ID : " + employeeID.toString());
				System.out.println("Your mobile number : " + phoneNumber.toString());
				quit();
			}
			else
			{
				MenuList.main(null);
			}
		}
		static void quit()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Please select an option");
			System.out.println("0. Continue with Quitting Process");
			System.out.println("1. Menu");
			int b = sc.nextInt();
			if(b == 0)
			{
				System.out.println(" Thankyou for using our application");
		    	System.out.println(" HAVE A GOOD DAY ! ");
			}
			else
			{
				MenuList.main(null);
			}
		}
		static void date()
		{
		     System.out.println("enter check out date");
		     Scanner sc=new Scanner(System.in);
		     String s1=sc.next();
		     LocalDate todaysDate = LocalDate.now();
		     System.out.println("current date is "+todaysDate);
		     LocalDate entered_date = LocalDate.parse(s1);
		     System.out.println("entered date is "+entered_date);
		     LocalDate l_date = LocalDate.now();        

		     if(todaysDate.compareTo(entered_date)>0)
		     {
		         System.out.println("Room not found");
		     }
		     if(todaysDate.compareTo(entered_date)<0)
		     {
		         System.out.println("Rooms available");
		     }
		}
		static void roomDetailsDate()
		{
			 System.out.println("Please enter the date to check the availability : ");
		     Scanner sc=new Scanner(System.in);
		     String s1=sc.next();
		     LocalDate todaysDate = LocalDate.now();
		     System.out.println("current date is "+todaysDate);
		     LocalDate entered_date = LocalDate.parse(s1);
		     System.out.println("entered date is "+entered_date);
		     LocalDate l_date = LocalDate.now();
		     if(todaysDate.compareTo(entered_date)>0)
		     {
		         System.out.println("Rooms");
		     }
		     if(todaysDate.compareTo(entered_date)<0)
		     {
		         System.out.println("Rooms available");
		     }
		}
}

