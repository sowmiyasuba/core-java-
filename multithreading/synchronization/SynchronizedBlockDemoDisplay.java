package com.practice.examplesolving.multithreading;

public class SynchronizedBlock {

	public static void main(String[] args) {

		Display1 d1=new Display1();
		MyThread1 t1=new MyThread1(d1,"Dhoni");
		Display1 d2=new Display1();
		MyThread1 t2=new MyThread1(d2,"YuvRaj");
		t1.start();
		t2.start();

	}

}

class MyThread1 extends Thread
{
	Display1 d;
	String name;
	 MyThread1(Display1 d,String name)
	 {
		 this.d=d;
		 this.name=name;
	 }
	public void run()
	{
		d.wish(name);
	}
	
}

class Display1 
{

	public void wish(String name)
	{
		
    //1 lakh lines of code	
	synchronized(Display1.class)
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
		
		//1 lakh lines of code
	}
	}
	}
}

