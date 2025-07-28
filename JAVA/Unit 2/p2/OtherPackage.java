package p2;
class OtherPackage 
{
	
	OtherPackage()
	{
		p1.Protection pro = new p1.Protection();
		System.out.println("Inside OtherPackage");
	//	System.out.println("Value of n " + pro.n);
	//	System.out.println("Value of n_pri "+ pro.n_pri);
	//	System.out.println("Value of n_pro " + pro.n_pro);
		System.out.println("Value of n_pub " + pro.n_pub);
	}
}