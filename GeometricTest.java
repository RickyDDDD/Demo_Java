package exer1;

public class GeometricTest {
	
	public static void main(String[] args) {
		
		GeometricTest test = new GeometricTest();
		
		Circle c1 = new Circle("red", 2, 3);
		test.displayGeometricObject(c1);
		
		Circle c2 = new Circle("red", 3, 3);
		test.displayGeometricObject(c2); 
		
		System.out.println("c1 和 c2 的面积相等：" + test.equalsArea(c1, c2));
		
	}
	 
	public void displayGeometricObject(GeometricObject o) {
		System.out.println("面积为：" + o.findArea());
	}
	public boolean equalsArea(GeometricObject o1 , GeometricObject o2) {
		return o1.findArea() == o2.findArea();
	}
}
