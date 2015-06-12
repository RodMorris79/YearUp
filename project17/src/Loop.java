
public class Loop {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		int myFavNumbers[] = {24,7,14,2,13,24,35,42,17,15};
		
		FindNumber(myFavNumbers, 35);
		TimesShown(24, myFavNumbers);
	}

public static void FindNumber(int[] setOfNumbers, int searchNumber)
{
	if(setOfNumbers != null)
	{
		if(setOfNumbers.length > 0)
		{
			for(int i = 0; i < setOfNumbers.length; i++)
			{
				if(searchNumber == setOfNumbers[i])
				{
					System.out.println(searchNumber + " is found in this set of numbers.");	
					break;
				}
			}
		}
	}
	
}
public static void TimesShown(int searchNumber, int[] setOfNumbers)
{

int numberOfTimes = 0;
if(setOfNumbers != null)
	{
		if(setOfNumbers.length > 0)
		{
			for(int i = 0; i < setOfNumbers.length; i++)
			{
				if(searchNumber == setOfNumbers[i])
				{
					numberOfTimes++;
				}
			}
		}
			System.out.println(searchNumber + " is found in this set of numbers " + numberOfTimes + " times.");
		}
	}
}
