
package com.dhiren.root.designpatterns.singleton;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MySingleton implements Serializable {

    private static volatile MySingleton instance;

    private MySingleton() {
		// make singleton class safe from reflection
        if (instance != null) {
            throw new RuntimeException("use getInstance() to get an Object of MySingleton");
        }
    }

    public static MySingleton getInstance() {
		// make singleton class safe from multiple threads
        if (instance == null) {
            synchronized (MySingleton.class) {
				// make singleton class doubly locked
                if (instance == null)
                    instance = new MySingleton();
            }
        }
        return instance;
    }

    public static void main(String[] args) throws NoSuchMethodException,
			IllegalAccessException, InvocationTargetException, InstantiationException {

        MySingleton newInstance1 = MySingleton.getInstance();
        System.out.println(newInstance1);

        Constructor<MySingleton> constructor = MySingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        MySingleton newInstance = constructor.newInstance();
        System.out.println(newInstance);
    }

    // make singleton class safe from serialization
	protected MySingleton readResolve() {
		return getInstance();
	}

}
