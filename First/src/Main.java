import java.util.*;

/* Created by Hrushikesh Reddy
 * Anmoldeep Singh 2091617
 * Manpreet Kaur
 * Shamli Sampla
 * 
 * Program on ATM Interface
 */

//We are creating a class Main

public class Main {
	
	public static void main(String[] args) 
	{
		
		int b,c;
		Scanner sc= new Scanner(System.in);
		HashMap<String,String> h = new HashMap<String,String>();
		
		
		h.put("Mark63", "123456");
		h.put("Neo09", "qwerty");
		h.put("Lionel8", "asdfgh");
		h.put("ABD360", "safrica");
		
		Withdraw w = new Withdraw();
		
		System.out.println("Welcome to Cegep ATM Bank \n");
		
		System.out.println("Please Enter your USER ID: \n");
		String u = sc.nextLine();
		System.out.println("Please Enter your Password \n");
		String uu = sc.nextLine();
		
		String s = h.get(u);
		
		try
		{
			if(s.equals(uu))
		{		
		
		System.out.println("Please choose your option below");
		
		System.out.println("\n 1) Transaction History \n");
		System.out.println("2) Withdraw \n");
		System.out.println("3) Deposit \n");
		System.out.println("4) Transfer \n");
		System.out.println("5) Quit \n");
		
		int x;
		do
		{
			
		x = sc.nextInt();
	
		//int count = x;
		
		switch(x)
		
		{
		
		case 1: 
			System.out.println("Your Transaction History is: \n");
			
			
			w.transaction();
		break;
		
		
		
		case 2: 
			System.out.println("\n Please enter your Withdrawal Amount \n");
			System.out.println("Maximum withdrawal 20000 \n");
			
			c = sc.nextInt();
			if(c>20000)
			{
				System.out.println("Withdrawal Amount exceeded \n");
				
			}
			else
			{
				w.withdraw(c);
			}
		break;
		
		
		
		
		case 3: 
			System.out.println("Please enter the amount you want to Deposit \n");
			c=sc.nextInt();
			w.deposit(c);
		break;
			
			
			
			
		case 4: 
			
			System.out.println("Enter the amount you want to transfer");
			int d=sc.nextInt();
			w.transfer(d);
		break;
		
		
		
		
		case 5: System.out.println("You have quit your account \n ");
		break;
		
		default: System.out.println("Please enter a valid input");
		break;
		
		}
		
		}while(x != 5);
		
		}
			
			else
				System.out.println("Wrong Password");
		
		}catch (Exception e)
		{
			System.out.println("Invalid User ID");
		}
		
		System.out.println("Thank you for using the ATM");
	}

}
