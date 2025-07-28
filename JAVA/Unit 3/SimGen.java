class TwoGen<T,V>
{
	T ob1;
	V ob2;
	
	TwoGen(T o1, V o2)
	{
		ob1 = o1;
		ob2 = o2;
	}
	
	T getOb1()
	{
		return ob1;
	}

	V getOb2()
	{
		return ob2;
	}

	void showTypes()
	{
		System.out.println("The type of T is " + ob1.getClass().getName());
		System.out.println("The type of V is " + ob1.getClass().getName());
	}
}

class SimGen
{
	public static void main(String args[])
	{
		TwoGen<Integer,String> tg = new TwoGen<Integer,String>(7,"Dhoni");
		int a = tg.getOb1();
		System.out.println("The value is " +a );

		String b = tg.getOb2();
		System.out.println("The value is " + b);
		tg.showTypes();
	}
}
