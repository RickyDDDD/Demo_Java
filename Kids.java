package com.atguigu.java1;

public class Kids extends ManKind{
	
	private int yearsOld;
	
	public void printAge() {
		System.out.println("I am " + yearsOld + "years old.");
	}

	public int getYearsOld() {
		return yearsOld;
	}

	public void setYearsOld(int yearsOld) {
		this.yearsOld = yearsOld;
	}

	public Kids(int yearsOld) {

		this.yearsOld = yearsOld;
	}

	public Kids() {
	}
	
	
}
