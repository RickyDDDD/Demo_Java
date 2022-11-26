package Java2;

public class MyDateTest {
	
	 public static void main(String[] args) {
		
		 MyDate d1 = new MyDate(2002,12,1);
		 MyDate d2 = new MyDate(2002,12,1);
		 System.out.println(d1.equals(d2));
		 
	}

}

class MyDate{
	int year;
	int month;
	int day;
	
	
	
	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o instanceof MyDate) {
			MyDate date = (MyDate)o;
			
			return this.day == date.day && this.month == date.month && this.year == date.year;
		}
		return false;
	}
	
}
