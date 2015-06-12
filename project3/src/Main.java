
public class Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Circle bigCircle = new Circle(10);
		Circle smallCircle = new Circle("Black", 5);
		
		
		System.out.println("The area for Big Circle is " + bigCircle.CalculateArea() + ".");
		bigCircle.PrintColor();
		System.out.println("The area for Small Circle is " + smallCircle.CalculateArea() + ".");
		smallCircle.PrintColor();
		
	}
	
	
}