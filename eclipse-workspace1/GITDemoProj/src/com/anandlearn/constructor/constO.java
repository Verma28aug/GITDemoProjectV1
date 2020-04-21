package com.anandlearn.constructor;

public class constO {
	constO(double d){
		this(10);
		System.out.println("double-arg");
	}
	constO(int i){
		this();
		System.out.println("int-arg cons");
	}
	constO(){
		System.out.println("no arg const");
	}

	public static void main(String[] args) {
		
constO o1=new constO(10.5);
System.out.println("\n");
constO o2=new constO(10);
	}

}
