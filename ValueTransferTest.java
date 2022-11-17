package com.atguigu.java;

public class ValueTransferTest {
	public static void main(String[] args) {	
		Order o1 = new Order() ;	
		o1.orderId = 1001 ;	
		Order o2 = o1 ;
		System.out.println("o1.orderId = " + o1.orderId + ",o2.orderId = " + o2.orderId );
		
		o2.orderId = 1002;
		System.out.println("o1.orderId = " + o1.orderId + ",o2.orderId = " + o2.orderId );
	}
}
class Order{
	int orderId;
}