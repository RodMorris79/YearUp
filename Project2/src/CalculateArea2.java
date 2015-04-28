
public class CalculateArea2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		double circleArea = CalculateCircleArea (24.0);
		System.out.println("The area of the circle is:" + circleArea );
		double rectangleArea = CalculateRectangleArea (14.0,2.0);
		System.out.println("The area of the rectangle is:" + rectangleArea );
	}
	
		static double CalculateCircleArea(double radius)
		{
			double area = 3.14*radius*radius;
			return area;
		}
	
		static double CalculateRectangleArea(double length, double breadth)
		{
			double area = length * breadth;
			return area;
		}
}