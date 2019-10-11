
package com.dhiren.root.multithreading.executor.exception;

import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class RejectedTaskHandler implements RejectedExecutionHandler {

	@Override
	public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.err.println("The task "+r.toString()+ " has been rejected ...");
	}
}
