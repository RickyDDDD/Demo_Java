package com.atguigu.java;

public class ChectAccountTest {
	
	public static void main(String[] args) {
		
		CheckAccount ck = new CheckAccount(1122,20000,0.045,5000);
		
		ck.withdraw(5000);
		System.out.println("账户余额为：" + ck.getBalance() + "可透支余额为：" + ck.getOverdraft());
		
		ck.withdraw(18000);
		System.out.println("账户余额为：" + ck.getBalance() + "可透支余额为：" + ck.getOverdraft());
		
		ck.withdraw(3000);
		System.out.println("账户余额为：" + ck.getBalance() + "可透支余额为：" + ck.getOverdraft());		
	}

}
