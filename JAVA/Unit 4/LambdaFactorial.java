interface NumericFunc/*
{
	int func(int n);
}

class LambdaFactorial
{
	public static void main(String args[])
	{
		NumericFunc factorial = (n)-> {
			int res = 1;
			for(int i=2;i<=n;i++)
			{
				res = res * i;
			}
			return res;
		};

		System.out.println("The factorial is: " + factorial.func(5));
		System.out.println("The factorial is: " + factorial.func(6));
	}
}