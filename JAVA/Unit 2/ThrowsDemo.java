class ThrowsDemo
{
	static void throwOne() throws IllegalAccessException
	{
		System.out.println("Inside throwOne");
		throw new IllegalAccessException("Gaurav");
	}

	public static void main(String args[])
	{
		try
		{
			throwOne();
		}

		catch(IllegalAccessException e)
		{	
			System.out.println("Caught the exception " +e);
		}

		finally
		{
			System.out.println("At the end of the program");
		}
	}
}