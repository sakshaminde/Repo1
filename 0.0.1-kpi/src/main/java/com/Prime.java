package com;

public class Prime {
	int i, a=0, flag=0;
	int n;
	int prime(int n)
	{
		a=n/2;
		if(n==0 || n==1)
		{
			System.out.println("Number is not prime");
		}
		else
		{
			for(i=2;i<=a;i++)
			{
				if(n%i==0)
				{
					System.out.println("Number is not prime");
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println("Number is prime");
			}
		}
		return n;
	}

}
