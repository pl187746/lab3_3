package edu.iis.mto.time;

import org.junit.Test;

public class OrderTest {
	
	private static long HOUR = 60 * 60 * 1000;

	@Test(expected = OrderExpiredException.class)
	public void poUplywiePonadDobyOrderConfirmRzucaWyjatek() {
		Order order = new Order();
		order.submit();
		SysTime.bias += 25 * HOUR;
		order.confirm();
	}
	
}
