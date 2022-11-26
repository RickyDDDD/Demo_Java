package Exer3;

public class CircleTest {
	
	public static void main(String[] args) {
		
		Circle c1 = new Circle("yello",2.0,3.0);
		Circle c2 = new Circle("red",2.0,3.0);
		
		System.out.println("颜色相等：" + c1.getColor().equals(c2.getColor()));
		System.out.println("半径相等：" + c1.equals(c2));
		System.out.println("半径为：" + c1.toString());
	}

}
