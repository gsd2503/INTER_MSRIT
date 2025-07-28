enum Apple
{
 	Jonathan(100), GoldenDel(200), RedDel(300), Winesap(400);
	
	private int price;
	Apple(int p)
	{
		price = p;
	}

	int getPrice(){
		return price;
	}
}
class EnumDemo3
{
	public static void main(String args[])
	{
		System.out.println("price of all apples: ");
		for(Apple a : Apple.values())
		{
			System.out.println( a + " Price is " + a.getPrice());
		}	
	}
}
