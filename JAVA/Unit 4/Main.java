class Main
{
	public static void main(String args[])
	{
		// SingletonDemo obj1 = new SingletonDemo();
		SingletonDemo obj1 = SingletonDemo.getInstance();
		obj1.showMsg();

		SingletonDemo obj2 = SingletonDemo.getInstance();
		obj2.showMsg();

		System.out.println("Are both the objects same? " + (obj1 == obj2));

	}
}