package com;

public class Palindrome {
	//int a=345;
	int rev(int a)
	{
		int rev_num = 0;
		while(a>0)
		{
			rev_num = rev_num * 10 + a % 10;
			a = a / 10;
		}
		return rev_num;
	}
	
	int pal(int n)
	{
		int rev_n = rev(n);
		if(rev_n == n)
			return 1;
		else
			return 0;
	}

}
