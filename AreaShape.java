abstract class Shape
{
	int a, b;
	abstract void printArea();
}
class Rectangle extends Shape
{
	public Rectangle(int x, int y)
	{
		a = x;
		b = y;
	}
	public void printArea()
	{
		System.out.println("Rectangle Area => " + (a * b));
	}
}
class Triangle extends Shape
{
	public Triangle(int x, int y)
	{
		a = x;
		b = y;
	}
	public void printArea()
	{
		System.out.println("Triangle Area => " + (0.5 * a * b));
	}
} 
class Circle extends Shape
{
	public Circle(int x)
	{
		a = x;
	}
	public void printArea()
	{
		System.out.println("Circle Area => " + (3.14 * a * a));
	}
}
public class AreaShape{
	public static void main(String[] args)
	{
		Rectangle R = new Rectangle(10,20);
		Triangle T = new Triangle(5,10);
		Circle C = new Circle(8);
                R.printArea();
		T.printArea();
		C.printArea();

		}
}