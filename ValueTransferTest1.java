package com.atguigu.java;

public class ValueTransferTest1 {
	
	public static void main(String[] args) {
		
		int m =10;
		int n =20;
		
		System.out.println("m = " + m + ", n = " + n);
		
//		int temp = m;
//		m = n ;
//		n = temp;
		
		ValueTransferTest1 test = new ValueTransferTest1();
		test.swap(m, n);
		
				
	}
	
	public void swap(int m ,int n){
		int temp = m;
		m = n ;
		n = temp;
		System.out.println("m = " + m + ", n = " + n);

	}

}


