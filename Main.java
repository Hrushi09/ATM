import java.util.*;
public class Main {
	
	public static void main(String[] args) 
	{
		//int a= 500000;
		int b,c,e;
		Scanner sc= new Scanner(System.in);
		//Transaction t = new Transaction();
		Withdraw w = new Withdraw();
		//Transfer tf = new Transfer();
		
		System.out.println("Welcome to Cegep ATM Bank \n");
		
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
		
		System.out.println("Thank you for using the ATM");
	}

}
