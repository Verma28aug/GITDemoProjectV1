package com.anandlearn.constructor;

class P{
	String s="Parent-variable";
	
}
class C extends P{
	String s="Child-Variable";
    public void m1() {
	System.out.println(s);
	System.out.println(this.s);
	System.out.println(super.s);
}
}

public class Test1 {

	public static void main(String[] args) {
		C c= new C();
		c.m1();

	}

}
