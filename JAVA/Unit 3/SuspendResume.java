class NewThread implements Runnable
{
	String name;
	Thread t;
	boolean suspendFlag;

	NewThread(String threadname)
	{
		name = threadname;
		t = new Thread(this,name);
		System.out.println("The new thread " + t);
		suspendFlag =  false;
	}
	public void run()
	{
		try
		{
			for(int i =5;i>0;i--)
			{
				System.out.println(name + " " + i);
				Thread.sleep(200);
				synchronized(this)
				{
					while(suspendFlag)
					{
						wait();
					}
				}
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("There is an exception " + e);
		}
		System.out.println("exiting from thread " +name);
	}
	synchronized void mySuspend()
	{
		suspendFlag=true;
	}
	synchronized void myResume()
	{
		suspendFlag = false;
		notify();
	}
}

class SuspendResume
{
	public static void main(String args[])
	{
		NewThread ob1 = new NewThread("Tom");
		NewThread ob2 = new NewThread("Jerry");

		ob1.t.start();
		ob2.t.start();
		
		try
		{
			Thread.sleep(1000);
			ob1.mySuspend();
			System.out.println("Suspending Tom for few seconds");
			Thread.sleep(1000);
			ob1.myResume();
			System.out.println("Resuming Tom after few seconds");
			Thread.sleep(1000);
			ob2.mySuspend();
			System.out.println("Suspending Jerry for few seconds");
			Thread.sleep(1000);
			ob2.myResume();
			System.out.println("Resuming Jerry after few seconds");
		}
		catch(InterruptedException e)
		{
			System.out.println("Main thread interrupted " +e);
		}
		
		try
		{
			System.out.println("tom and jerry");
			ob1.t.join();
			ob2.t.join();
			System.out.println("After joining Tom and Jerry");
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread Exception " + e);
		}
		System.out.println("exiting the main thread ");	
	}	
}