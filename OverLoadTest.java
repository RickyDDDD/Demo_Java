package com.atguigu.java;

public class OverLoadTest {
	
	public static void main(String[] args) {
		
		OverLoadTest test = new OverLoadTest();
		test.getSum(1, 2);
		
	}
	
	
	//如下的四个方法构成了重载
	public void getSum(int i ,int j){
		System.out.println("1");
	}
	
	public void getSum(double d1 ,double d2) {
		System.out.println("2");
	}
	
	public void getSum(String s ,int i ) {
		System.out.println("3");
	}
	
	public void getSum(int i , String s ) {
		System.out.println("4");
	}
	
//	public void getSum(int i . int j) {
//		return 0;
//	}
//	public void getSum(int n .int m) {
//		
//	}

}
