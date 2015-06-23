
public class ExceptionalCentral
{
	
	public static void main(String[] args)
	{
		ExceptionalCentral Expression = new ExceptionalCentral();
		
		//Expression.r(12479, 0);
		//Expression.a(null);
		//Expression.m(null);
		int[] setOfNumbers = {1,2,3,4,5,6};
		Expression.m(setOfNumbers);
	}

	int r(int nums, int nothing) throws ArithmeticException
	{
		int value = nums/nothing;
		return value;
	}
	
	void a(String word) throws NullPointerException
	{
		String whatWasSaid = word.toUpperCase();
		System.out.println(whatWasSaid);
	}	
			
	void m(int[] setOfNumbers)
	{
		try
		{
			for (int i = 0; i < 10; i++)
			{
				System.out.println(setOfNumbers[i]);
				
			}
		}
		catch(ArrayIndexOutOfBoundsException mCaught)
		{
			System.out.println("Error set of nuumbers not large enough.");
			mCaught.printStackTrace();
		}
		catch(NullPointerException nullPrtEx)
		{
			System.out.println("Array is null.");
			nullPrtEx.printStackTrace();
		}
	}
}
