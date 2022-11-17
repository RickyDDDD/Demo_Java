package com.atguigu.java;

public class OverloadExer {
	//如下构成方法重载
	public void mOL(int i ) {
		System.out.println(i*i);
	}
	
	public void mOL(int i ,int j) {
		System.out.println(i*j);
	}
	
	public void mOL(String s) {
		System.out.println(s);
	}
	
	//
	public int max(int i ,int j) {
		return (i>j?i:j);
	}
	
	public double max(double d1,double d2) {
		return (d1>d2)?d1:d2;
	}

}
