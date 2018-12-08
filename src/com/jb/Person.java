package com.jb;

public class Person {
	long length;
	public Person(long l){
		length=1;
	}
	public static void main(String[] args) {
		Person s1,s2,s3;
		s1=new Person(21L);
		s2=new Person(21L);
		s3=s2;
		System.out.println(s1==s2);
		System.out.println(s1.equals(s3));
		System.out.println("s2:"+s2);
		System.out.println("s3:"+s3);
		System.out.println(s2==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s1!=s3);
	}
}
