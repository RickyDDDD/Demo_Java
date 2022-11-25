package com.atguigu.java;

public class Account {
	
	private int id ;
	private double balance;
	private double annuallnterestRate;//年利率
	
	public Account() {
		
	}
	public Account(int id, double balance, double annuallnterestRate) {
		this.id = id;
		this.balance = balance;
		this.annuallnterestRate = annuallnterestRate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnuallnterestRate() {
		return annuallnterestRate;
	}
	public void setAnnuallnterestRate(double annuallnterestRate) {
		this.annuallnterestRate = annuallnterestRate;
	}
	
	public double getMonthlyInterest(){
		return annuallnterestRate/12;
	}
	
	public void withdraw(double amount) {//取款
		if(amount > 0 && amount <= this.balance ) {
			balance -= amount;
			System.out.println("取款成功,余额剩: " + balance);
		}else {
			System.out.println("输入有误！！");
		}
	}
	
	public void deposit(double amount) {
		balance += amount;
		System.out.println("当前余额为：" + balance);
		}
	}
	
