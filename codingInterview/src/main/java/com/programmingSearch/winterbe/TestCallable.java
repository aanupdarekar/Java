package com.programmingSearch.winterbe;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestCallable {

	public static void main(String args[]){
		
		Runnable task = ()-> {
		    String threadName = Thread.currentThread().getName();
		    System.out.println("Hello " + threadName);
		};

		task.run();

		ExecutorService executor = Executors.newWorkStealingPool();
		List<Callable<String>> callables = Arrays.asList(
			    callable("task1", 2),
			    callable("task2", 1),
			    callable("task3", 3));
		
		
		try {
			String result = executor.invokeAny(callables);
			System.out.println(result);
		//	new TestCall().call();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*Thread thread = new Thread(task,"test");
		thread.start();
*/
		System.out.println("Done!");
	}
	
	static Callable<String> callable(String result, long sleepSeconds) {
	    return () -> {
	        TimeUnit.SECONDS.sleep(sleepSeconds);
	        return result;
	    };
	}
	static class TestCall implements Callable<Integer>{

		@Override
		public Integer call() throws Exception {
			// TODO Auto-generated method stub
			System.out.println("Test call");
			return 2+1;
		}
		
	}
}
