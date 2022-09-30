package com;

public class Order {
	String a;
	int Password = 341541;
	//int code=341541;
	String SecurityCode, OrderStatus, OrderTime;
	double aadhar(double aa)
	{
		return aa;
	}
	int code(char ch)
	{
		return ch;
	}
	int password(int pass)
	{
		return pass;
	}

	/*
	 * void setSecurityCode(String a) { this.SecurityCode = a;
	 */
		public String isValid(String a)
		{
			this.a = a;
			//Order O1 = Order.isValid("Sakshu@3");
			if(a == "Sakshu@3")
			{
				return a;
			}
			return "false";
		}
	//}
	void setOrderStatus(String b)
	{
		this.OrderStatus = b;
	}
	void setOrderTime(String c)
	{
		this.OrderTime = c;
	}
}
