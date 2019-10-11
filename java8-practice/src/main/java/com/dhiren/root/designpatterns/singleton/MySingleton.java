
package com.dhiren.root.designpatterns.singleton;

public class MySingleton {

	private static volatile MySingleton instance = null;

	private MySingleton() {
		if (instance != null) {
			throw new RuntimeException("use getInstance() to get an Object of MySingleton");
		}
	}

	public static MySingleton getInstance() {
		if (instance == null) {
		    synchronized (MySingleton.class) {
                if (instance == null)
                    instance = new MySingleton();
            }
		}
		return instance;
	}

}
