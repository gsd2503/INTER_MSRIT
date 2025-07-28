class Gen<T>
{
	T ob; //placeholder
	Gen(T o)
	{
		ob = o;
	}

	T getOb()
	{
		return ob;
	}
	
	void showType()
	{
		System.out.println("The type of T is " + ob.getClass().getName());
	}
}

class GenDemo
{
	public static void main(String args[])
	{
		Gen<Integer> iob;
		iob = new Gen<Integer>(88);
		int a = iob.getOb();
		System.out.println("The value is "+a);

		Gen<String> sob = new Gen<String>("Dhoni is the best");
		String str = sob.getOb();
		System.out.println("The value is " +str);

		Gen<Float> fob = new Gen<Float>(10f);
		Float b = fob.getOb();
		System.out.println("The value is "+ b);

		Gen<Double> dob = new Gen<Double>(10.2);
		Double d = dob.getOb();
		System.out.println("The value is "+ d);

		iob.showType();
		sob.showType();	
		fob.showType();
		dob.showType();

	}
}
