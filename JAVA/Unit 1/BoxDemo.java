class Box
{
  double height;
  double width;
  double depth;
}

class BoxDemo
{
  public static void main(String args[])
  {
   Box mybox1 = new Box();
   mybox1.height=200;
   mybox1.width=100;
   mybox1.depth=150;
   double volume;
   volume = mybox1.width * mybox1.height * mybox1.depth;
   System.out.println("Volume is " + volume);

  Box mybox2 = new Box();
   mybox2.height=120;
   mybox2.width=80;
   mybox2.depth=100;
   double vol;
   vol = mybox2.width * mybox2.height * mybox2.depth;
   System.out.println("Volume is " + vol);
  }
}	

