import java.util.*;
abstract class Shape{
	abstract public void area();
}
class Rect extends Shape{
	int l=2;
	int b=3;
	float area;
	public void area()
	{
		area=l*b;
		System.out.println("the area of rect"+area);
	}
}
class Square extends Shape{
	int a=5;
	float area;
	public void area()
	{
		area=a*a;
		System.out.println("the area  of square "+area);
	}
}
class Circle extends Shape{
	int r=7;
	double area;
	 public void area()
	{
		area=3.14*r*r;
		System.out.println("the area of circle "+area);
	}
}
class Ma{
	public static void main(String args[]){
	Rect r=new Rect();
	Square q=new Square();
	Circle c=new Circle();
	r.area();
	q.area();
	c.area();
	}
}