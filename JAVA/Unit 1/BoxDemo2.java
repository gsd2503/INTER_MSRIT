class Box
{
 double height;
 double width;
 double depth;
 Box()
 {
  height=30;
  width = 15;
  depth = 20;
 }

 double volume()
 {
  return height * width * depth;
 }
}

class BoxDemo2
{
  public static void main(String args[])
  {
   Box mybox2 = new Box();
   System.out.println("Volume is : " + mybox2.volume());
  }

}