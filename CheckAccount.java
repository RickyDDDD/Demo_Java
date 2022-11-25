package com.atguigu.java;

public class CheckAccount extends Account{
	
	private double overdraft;
	public CheckAccount(int id , double balance , double annuallnterestRate , double overdraft) {
		super(id,balance,annuallnterestRate);
		this.overdraft = overdraft;
		
	}
	
	public double getOverdraft() {
		return overdraft;
	}
	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}
	
	public void withdraw(double amount) {
		if(amount <= getBalance()) {//余额足够
			System.out.println("可以直接取款");
			//方式1
			setBalance(getBalance() - amount);
			//方式2
//			super.withdraw(amount);
			
		}else if(overdraft >= amount - getBalance()) {
			
			overdraft -= (amount - getBalance());
			setBalance(0);
			}else {
				System.out.println("超过可透支限额");
		}
	}
}
