class Wrap
{
	static int m(Integer d)
	{
		return d;
	}
	public static void main(String args[])
	{
		// Integer iob = new Integer(100); //boxing
		// int i = iob.intValue();		//unboxing
		// System.out.println(i + " " + iob);

		Integer iob = 100; //auto boxing
		int i = iob; //auto unboxing
		System.out.println(i + " " + iob);
		
		Integer iob1 = m(200);
		System.out.println(iob1);		 

	}
}
