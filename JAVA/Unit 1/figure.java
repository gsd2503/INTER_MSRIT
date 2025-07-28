class Figure
{
 double width,height;
 
double Figure(double w, double h)
 {
  width=w;
  height=h; 
 }
}

class Rectangle extends figure
{
 double Rectangle(double a,double b)
 {
  
 }
}

class triangle extends figure
{

}

class Area
{
 public static void main(String args[])
 {
  Figure f = new Figure(10,20);
  Rectangle r = new Rectangle(20,30);
  
 }