package com10Oct;

public class Letter extends Alphanumeric implements Alphabet,Numeric {
	Letter()
	{
		System.out.println("Simple Constructor");
	}
	Letter(int a)
	{
		System.out.println("Constructor Overloading through int argument");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Letter L1 = new Letter();//Simple object creation
		Letter L2 = new Letter(4);
		Alphanumeric A1 = new Alphanumeric();
		L1.show();
		L1.show1();
		L2.show2();
		L1.add(5, 6);
		A1.mul(2,8);
		
	}
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Functional Interface");
	}
	@Override
	public void show1() {
		// TODO Auto-generated method stub
		System.out.println("Normal Interface through 1st object");
	}
	@Override
	public void show2() {
		// TODO Auto-generated method stub
		System.out.println("Normal Interface through 2nd object");
	}

}
