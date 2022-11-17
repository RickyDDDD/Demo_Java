package com.atguigu.java;

public class ValueTrans {
	
	public static void main(String[] args) {
		date num = new date();
		num.m = 10 ;
		num.n = 20 ;
		
		System.out.println("m = " + num.m + ", n = " + num.n);
		
		ValueTrans test = new ValueTrans();
		test.sort(num);
		System.out.println("m = " + num.m + ", n = " + num.n);
	}
	public void sort(date nu){
		int temp = nu.m;
		nu.m = nu.n;
		nu.n = temp;
	}
	
}

class date{
	int m ;
	int n ;
}