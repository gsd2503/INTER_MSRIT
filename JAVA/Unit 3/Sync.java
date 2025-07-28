class CallMe
{
	void call(String msg)
	{
		System.out.println("[" + msg);
		try
		{
			Thread.sleep(1000);
		}
		catch(InterruptedException e)
		{
			System.out.println("The exception in child thread is " + e);
		}
		System.out.println("]");
	}
}

class Caller implements Runnable
{
	CallMe target;
	String msg;
	Thread t;

	public Caller(CallMe targ,String s)
	{
		target=targ;
		msg=s;
		t = new Thread(this);
	}

	public void run()
	{
		synchronized(target)
		{
			target.call(msg);
		}
	}
}

class Sync
{
	public static void main(String args[])
	{
		CallMe target = new CallMe();

		Caller ob1 = new Caller(target,"Adieu");
		Caller ob2 = new Caller(target,"AI171");
		Caller ob3 = new Caller(target,"Boeing 787");

		ob1.t.start();
		ob2.t.start();
		ob3.t.start();
		System.out.println("the thread t1 is " + ob1.t.isAlive());
		System.out.println("the thread t2 is " + ob2.t.isAlive());
		System.out.println("the thread t3 is " + ob3.t.isAlive());

		try
		{
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("The exception in child thread is " + e);
		}
	}	
}