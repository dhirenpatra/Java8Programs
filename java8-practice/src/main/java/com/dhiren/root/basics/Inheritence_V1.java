
package com.dhiren.root.basics;

import java.util.ArrayList;
import java.util.List;

class Fruit {
	public Fruit() {
		System.out.println("Super class constructor");
		System.out.println("Super class object hashcode :" + this.hashCode());
		System.out.println(this.getClass()
		        .getName());
	}

	public void m1() {
		System.out.println("m1");
	}
}


// sub class
class Apple extends Fruit {

	public Apple() {
		System.out.println("Subclass constructor invoked");
		System.out.println("Sub class object hashcode :" + this.hashCode());
		System.out.println(this.hashCode() + "   " + super.hashCode());

		System.out.println(this.getClass()
		        .getName() + "  " + super.getClass().getName());
	}

	public void m2() {
		System.out.println("m2");
	}
}


public class Inheritence_V1 {

	public static void main(String[] args) {
		Apple myApple = new Apple();
		myApple.m2();
		myApple.m1();
		System.err.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
		Fruit fruit = new Apple();
		fruit.m1();
	}

}
