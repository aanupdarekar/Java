package com.programmingSearch.winterbe;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadTest {

	private static ExecutorService executor;

	public static void main(String[] args) {
		Runnable runnable = () -> {
			System.out.println("Thread 1");
			try {
				TimeUnit.SECONDS.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		};
		
		Callable<Integer> callable= new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		
		ExecutorService executor = Executors.newSingleThreadExecutor();
		executor.submit(runnable);
		try {
		
		    System.out.println("attempt to shutdown executor");
		    executor.shutdown();
		    executor.awaitTermination(5, TimeUnit.SECONDS);
		}
		catch (InterruptedException e) {
		    System.err.println("tasks interrupted");
		}
		finally {
		    if (!executor.isTerminated()) {
		        System.err.println("cancel non-finished tasks");
		    }
		    executor.shutdownNow();
		    System.out.println("shutdown finished");
		}
		
		
		Callable<Integer> call = () ->{
			try {
		        TimeUnit.SECONDS.sleep(1);
		        return 123;
		    }
		    catch (InterruptedException e) {
		        throw new IllegalStateException("task interrupted", e);
		    }
			
		};
		ExecutorService callExecutor = Executors.newSingleThreadExecutor();
		Future<Integer> future = callExecutor.submit(call);
		
		System.out.println("Is future done"+future.isDone());
		callExecutor.shutdown();
		Integer result;
		try {
			result = future.get();
			System.out.println("future done? " + future.isDone());
			System.out.print("result: " + result);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println("Invoke Any start****");
		ExecutorService executeInvokeAny = Executors.newWorkStealingPool();

		List<Callable<String>> callables = Arrays.asList(
		    callable("task1", 2),
		    callable("task2", 1),
		    callable("task3", 3));

		String invokeResult;
		try {
			invokeResult = executeInvokeAny.invokeAny(callables);
			System.out.println(invokeResult);
			//executeInvokeAny.shutdown();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

		
		ScheduledExecutorService schexecutor = Executors.newScheduledThreadPool(1);

		Runnable task = () -> System.out.println("Scheduling: " + System.nanoTime());
		ScheduledFuture<?> schFuture = schexecutor.schedule(task, 10, TimeUnit.SECONDS);

		try {
			TimeUnit.MILLISECONDS.sleep(1337);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		long remainingDelay = schFuture.getDelay(TimeUnit.SECONDS);
		
		System.out.printf("Remaining Delay: %sms", remainingDelay);
		schexecutor.shutdown();
		
		AtomicInteger integer = new AtomicInteger();
	}
	
	static Callable<String> callable(String result, long sleepSeconds) {
		return new Callable<String>() {

			@Override
			public String call() throws Exception {
				 TimeUnit.SECONDS.sleep(sleepSeconds);
				return result;
			}
		}; 
	}
	   
}
