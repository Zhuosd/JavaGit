package HomWork20171122;

import java.util.Scanner;
class demo{
	String number;
	String name;
	boolean available = false;
	Scanner in = new Scanner(System.in);

	public synchronized void read()
	{
		if(available)
			try{
				wait();
			}catch(Exception e)	{
				System.out.println("等待过程...");
			}
			try{
				number=in.next();
			}catch(Exception e)	{
				System.out.println("输入学号出错！");
			}
			try{
				name=in.next();
			}catch(Exception e){
				System.out.println("输入姓名出错！");
			}
		System.out.println();
		available=true;
		notify();
	}

	public synchronized void write()
	{
		if(!available)
			try{
				wait();
			}
			catch(Exception e){
			}
		System.out.println("输出学生学号："+number+" 姓名："+name+"\n");
		available=false;
		notify();
	}
}
class Reader extends Thread{
	demo R1 = null;
	public Reader(demo d){
		this.R1=d;
	}
	public void run(){
		while(true)
		{
			R1.read();
		}
	}
}

class Write extends Thread{
	demo W2=null;
	public Write(demo d)
	{
		this.W2=d;
	}
	public void run()
	{
		while(true)
		{
			W2.write();
		}
	}
}
public class ThreadStudent {
	public static void main(String[] args){
		demo demo1 = new demo();
		System.out.println("请输入学号+姓名：" );
		new Reader(demo1).start();
		new Write(demo1).start();
	}
}

