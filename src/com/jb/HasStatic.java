package com.jb;

public class HasStatic {
	/*private static int x=100;
	public static void main(String[] args) {
		HasStatic hs1=new HasStatic();
		hs1.x++;
		System.out.println(x);
		HasStatic hs2=new HasStatic();
		hs2.x++;
		System.out.println(x);
		hs1=new HasStatic();
		hs1.x++;
		System.out.println(x);
		HasStatic.x--;
		System.out.println("x="+x);
	}*/
	/*public static void main(String[] args) {
		String A,B,C;
		A="a";
		B="b";
		C=A+B;
		StringBuffer D=new StringBuffer("abc");
		D=D.append("56");
		System.out.println(D);
	}*/
	public static void main(String[] args) {
		String s1="hello";
		if(s1=="hello"){
			System.out.println("s1 = \"hello\"");
		}else{
			System.out.println("s1 !=hello");
		}
		
		
	}
	private class MyClass{
		float f=-5;
		float e=0x0687;
	//	float d=7.8f
	//	float t=1.0;
	}
}

abstract class MyClass1 implements MyCat,MyCatw{
	
}
