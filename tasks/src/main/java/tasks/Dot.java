package tasks;

public class Dot
{
  protected int x;
  protected int y;

  public Dot(int x, int y)
  {
    this.x = x;
    this.y = y;
  }

  @Override
  public String toString()
  {
    return "Dot{" +
        "x=" + x +
        ", y=" + y +
        "} ";
  }
}
class Circle extends Dot
{
  protected double radius;
  public double square()
  {
    return 3.14*Math.pow(radius,2);
  }
  @Override
  public String toString()
  {
    return super.toString()+
        "Circle{" +
        "radius=" + radius +
        ", square=" + square() +
        "} ";
  }

  public Circle(int x, int y, double radius)
  {
    super(x, y);
    this.radius = radius;
  }
}
class Cylinder extends Circle
{
  protected double height;
  @Override
  public double square()
  {
    return 2*3.14*radius*(height+radius);
  }
  public double volume()
  {
    return super.square()*height;
  }
  @Override
  public String toString()
  {
    return super.toString()+
        "Cylinder{" +
        "height=" + height +
        ", square=" + square() +
        ", volume=" + volume() +
        "} ";
  }

  public Cylinder(int x, int y, double radius, double height)
  {
    super(x, y, radius);
    this.height = height;
  }
}
