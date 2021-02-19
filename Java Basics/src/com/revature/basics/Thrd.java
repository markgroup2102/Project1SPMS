package com.revature.basics;

import java.util.ArrayList;

public class Thrd {
	public static void main(String[] args) {
		//System.out.println("hello");
		threads();
		try {
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getState());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("WOlrd");
		
		
	}
	
	private static void threads() {
		Thread runnableThread = new Thread(new MyRunnableThread());
		
		ArrayList<Thread> threads = new ArrayList<Thread>();
		threads.add(new Thread(new MyRunnableThread()));
		threads.add(new Thread(new MyRunnableThread()));
		threads.add(new Thread(new MyRunnableThread()));
		threads.add(new Thread(new MyRunnableThread()));
		threads.add(new Thread(new MyRunnableThread()));
		threads.add(new Thread(new MyRunnableThread()));
		threads.add(new Thread(new MyRunnableThread()));
		for(Thread t : threads) {
			t.start();
		}
		for(Thread t : threads) {
			System.out.println("count :"  + t.getState());
		}
		
		System.out.println(runnableThread.getState());
		runnableThread.start();

		System.out.println(runnableThread.getState());

		Thread willRun = new Thread(() -> {
			  System.out.println("Running!");
			});
			willRun.start();
		
		try {
			runnableThread.join();
			System.out.println(runnableThread.getState());
			

		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		try {
			Thread.sleep(1000);
			System.out.println(Thread.currentThread().getState());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Thread tt = new MyThreadThread();
		tt.start();
		System.out.println(runnableThread.getState());

	}
}

class MyRunnableThread implements Runnable {

	public static int count = 0;
	MyRunnableThread(){
		count++;
	}
	@Override
	public void run() {
		//System.out.println("Runnable class");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("End of class");
		
	}
}

class MyThreadThread extends Thread{
	@Override
	public void run() {
		System.out.println("Runnable class");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("End of class");
		
	}
}