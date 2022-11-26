package Java2;

import org.junit.Test;

public class WrapperTest {
	
	@Test
	public void test5() {
		String str1 = "123";
		int num2 = Integer.parseInt(str1);
		System.out.println(num2 + 100);
		
	}
	
	
	@Test
	public void test4() {
		
		int num1 = 10;
		//方式一
		String str1 = num1 + "";
		//方式二
		float f1 = 12.3f;
		String str2 = String.valueOf(f1);
		
	}
	
	@Test
	public void test3() {
//		int num1 = 10;
//		method(num1);
		//自动装箱
		int num2 = 10;
		Integer in1 = num2;
		
		boolean b1 = true;
		Boolean b2 = b1;
		
		//自动拆箱
		System.out.println(in1.toString());
		int num3 = in1;
		
	}
	
	public void method(Object obj) {
		System.out.println(obj);
	}
	
	
	
	
	
	
	
	
	
	//包装类--->基本数据类型
	@Test
	public void test2() {
		Integer in1 = new Integer(12);
		
		int i1 = in1.intValue();
		System.out.println(i1 + 2);
		
		Float f1 = new Float(12.6);
		float f2 = f1.floatValue();
		System.out.println(f2);
		
	}
	
	
	
	//基本数据类型--》包装类：调用包装类的构造器
	@Test
	public  void test1() {
		int num1 = 10;
		Integer in1 = new Integer(num1);
		System.out.println(in1.toString());
		
		Integer in2 = new Integer("123");
		System.out.println(in2.toString());
		
		Float f1 = new Float(12.3);
		Float f2 = new Float("123");
		System.out.println(f1);
		System.out.println(f2);
		
		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean(false);
		System.out.println(b1);
		
		
	}

}
