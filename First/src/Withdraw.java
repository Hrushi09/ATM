
public class Withdraw

{
	int t[] = new int[30];
	int count =0 ,i = 0;
	int a=500000;
	
	
	public void transaction()
	{
		for(i=0;i<count;i++)
			{
				System.out.println(t[i]);
			}
	}
	public int withdraw(int c)
	{
		
		
		if(c>a)
		{
			System.out.println("Account balance low");
			System.out.println(a);
			return a;
		}
		
		else
		{
			a -= c;
			System.out.println("Cash Withdrawn");
			System.out.println("Account balance is: " +a);
			//a = a-c;
			count++;
			t[i] = -c;
			i++;
			return a;
			
	
		}
		
		
		}
	
	

	public int deposit(int c) 
	{
		// TODO Auto-generated method stub
		
		System.out.println("You have deposited an amount of:"+c);
		
		a += c;
		
		System.out.println("Your Current balance is:"+a);
		
		t[i] = c;
		count++;
		i++;
		return a;
	}
	
	public int transfer(int c)
	{
		a -= c;
		System.out.println("Cash has been transfered\n");
		System.out.println("New Account balance is: " +a);
		
		t[i] = -c;
		count++;
		i++;
		return a;
	}
}
