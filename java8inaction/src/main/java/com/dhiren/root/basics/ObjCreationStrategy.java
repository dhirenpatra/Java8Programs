
package com.dhiren.root.basics;

public class ObjCreationStrategy implements Cloneable {

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	public void m1() {
		System.err.println("m1() called ... ObjCreationStrategy");
	}

	static class ObjCreationStrategyV1 {
        public void m1() {
            System.err.println("m1() called ... ObjCreationStrategyV1");
        }
    }

	public static void main(String[] args) {

		ObjCreationStrategy object1 = new ObjCreationStrategy();
		try {
			Class clazz = Class.forName("ObjCreationStrategyV1");
			ObjCreationStrategy object2 = (ObjCreationStrategy) clazz.newInstance();
			ObjCreationStrategy object3 = (ObjCreationStrategy) object1.clone();
			object1.m1();
			object2.m1();
			object3.m1();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException | CloneNotSupportedException e) {
			e.printStackTrace();
		}


	}
}
