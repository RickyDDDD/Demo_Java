package com.atguigu.exer;

public class CheckAccountTest {
	
	public static void main(String[] args) {
		
		CheckAccount acct = new CheckAccount(1122,20000,0.045,5000);
		
		acct.withdraw(5000);
		System.out.println("账户余额为：" + acct.getBalance() + "可透支额为：" + acct.getOverdraft());
		acct.withdraw(18000);
		System.out.println("账户余额为：" + acct.getBalance() + "可透支额为：" + acct.getOverdraft());
		acct.withdraw(3000);
		System.out.println("账户余额为：" + acct.getBalance() + "可透支额为：" + acct.getOverdraft());
	}

}
