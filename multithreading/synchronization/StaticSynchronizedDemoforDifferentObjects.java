package com.practice.examplesolving.multithreading;

public class SynchronizedDemoforDifferentObjects {

	public static void main(String[] args) {
		
		Display d1=new Display();
		MyThread t1=new MyThread(d1,"Dhoni");
		Display d2=new Display();
		MyThread t2=new MyThread(d2,"YuvRaj");
		t1.start();
		t2.start();

	}

}

class MyThread extends Thread
{
	Display d;
	String name;
	 MyThread(Display d,String name)
	 {
		 this.d=d;
		 this.name=name;
	 }
	public void run()
	{
		d.wish(name);
	}
	
}

class Display 
{

	public static synchronized  void wish(String name)
	{
	for(int i=0;i<10;i++)
	{
		System.out.print("Good Mrng: ");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		System.out.println(name);
	}
	}
}
