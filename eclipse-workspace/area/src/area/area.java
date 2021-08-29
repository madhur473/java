package area;

public class area {
	
	final double PI=3.14;
	public double circlearea(double r)
	{
		return PI*r*r;
	}
	public double rectanglearea(double l,double b)
	{
		return l*b;
	}
	public double trianglearea(double b, double h)
	{
		return 0.5*b*h;
	}
	public double squarearea(double s)
	{
		return s*s;
	}

}
