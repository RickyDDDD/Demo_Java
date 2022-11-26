package Exer3;

import java.util.Objects;

public class Circle extends GeometricObject{
	
	private double radius;

	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle(String color, double weight, double radius) {
		super(color, weight);
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double findArea() {
		return Math.PI * radius * radius;
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Circle other = (Circle) obj;
//		return Double.doubleToLongBits(radius) == Double.doubleToLongBits(other.radius);
//	}
	
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj instanceof Circle) {
			Circle circle = (Circle)obj;
			
			return this.radius == circle.radius ;
		}
		return false;
		
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
