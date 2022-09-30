package com;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class OrderTest {
	
	@Test
	public void show()
	{
		Order O1 = new Order();
		O1.Password=455;
		O1.aadhar(45678.78987);
		O1.isValid("Sakshu@3");
		O1.code('S');
		O1.password(341541);
		O1.setOrderStatus("Issued");
		O1.setOrderTime("9:00AM");
		//O1.setSecurityCode("ASDFGH");
		
	}

}
