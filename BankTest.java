package com.atguigu.exer5;

public class BankTest {
	
	public static void main(String[] args) {
		
		Bank bank = new Bank();
		bank.addCustomer("tom", "smith");
		
		bank.getCustomer(0).setAccount(new Account(20000));
		
		bank.getCustomer(0).getAccount().withdraw(5000);
		
		double balance = bank.getCustomer(0).getAccount().getBalance();
		
		System.out.println("客户：" + bank.getCustomer(0).getFirstName() + "的账户余额为：" + balance);
		
		bank.addCustomer("yang", "hui");
		System.out.println("客户人数为：" + bank.getNumberOfCustomer());
		
	}

}
