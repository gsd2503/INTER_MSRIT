class box
{
	double width,height,depth;
	box(box ob)
	{
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
		
	}
	box(double w,double h,double d)
	{
		width = w;
		height = h;
		depth = d;
	}
	box()
	{
		width = 0;
		height = 0;
		depth = 0;
	}
	box(double len)
	{
		width=height=depth=len;
	}
	double volume()
	{
		return width*height*depth;
	}
}
class boxweight extends box
{
	double weight;
	boxweight(boxweight ob)
	{	
		super(ob);
		weight = ob.weight;
	}
	boxweight(double w,double h,double d,double m)
	{
		super(w,h,d);
		weight = m;
	}
	boxweight()
	{
		super();
		weight =0;
		
	}
	boxweight(double len,double m)
	{
		super(len);
		weight=m;
	}
}
class shipment extends boxweight
{
	double cost;
	shipment(shipment ob)
	{
		super(ob);
		cost = ob.cost; 
	}
	shipment(double w,double h,double d,double m,double c)
	{	
		super(w,h,d,m);
		cost = c;
	}
	shipment()
	{
		super();
		cost=0;
	}
	shipment(double len,double m,double c)
	{
		super(len,m);
		cost = c;
	
	}
	
}

class demoshipment
{
	public static void main(String args[])
	{
		shipment obj1 = new shipment(10,20,15,10,3.14);
		double vol = obj1.volume();
		System.out.println("volume of shipment:"+vol);
		System.out.println("weight of shipment:"+obj1.weight);
		System.out.println("cost is:"+obj1.cost);
	}
}
