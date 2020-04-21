package com.anandlearn.constructor;

public class test_Cons {
	
	String name;
	int rollno;
	
	test_Cons(String name,int rollno){
		this.name=name;
		this.rollno=rollno;
		System.out.println("current object name is:"+name  +"\nCurrent object rollno is:"+rollno  );
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test_Cons obj1=new test_Cons("anand",101);
		
		

	}

}
