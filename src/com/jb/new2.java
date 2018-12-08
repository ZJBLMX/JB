package com.jb;

public class new2 {
	public static void main(String[] args) {
		int w=0;
		int x=4;
		int y=50;
		while(y/x>3){
		if(y%x>3){
			x=x+1;
			System.out.println("9");
			System.out.println(++w);
		}else{
			y=y/x;
			System.out.println(++w);
			System.out.println("5");
		}
	}
}
}