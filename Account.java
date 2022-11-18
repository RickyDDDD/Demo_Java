package com.atguigu.exer5;

public class Account {
	
	private double balance;
	
	public Account(double init_balance) {
		this.balance = init_balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(double amt) {//存款
		if(amt > 0) {
			balance += amt;
			System.out.println("存钱成功");
		}
	}
	
	public void withdraw(double amt) {//取款
		if(amt >0 && amt <= balance) {
			balance -= amt;
			System.out.println("取款成功");
		}else {
			System.out.println("余额不足,取款失败");
		}
	}

}
