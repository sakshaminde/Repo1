package com10Oct;

public class Alphanumeric {
	void add(int a, int b)
	{
		System.out.println("Addition is(Called through child class object): "+ (a+b));
	}
	void mul(int a, int b)
	{
		System.out.println("Multiplication is(Called through itself object): "+ (a*b));
	}

}
