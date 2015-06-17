
public class Worker 
{	
	protected String statements = "I worked.";
	
	protected void DoWork()
	{
		System.out.println(statements);
	}
	
	public static void main(String[] args)
	{
		Producer Zaytoven = new Producer();
		Zaytoven.DoWork();
		
		Boxer Ali = new Boxer();
		Ali.DoWork();
		
		DJ DJDrama = new DJ();
		DJDrama.DoWork();
		
		Mayweather Floyd = new Mayweather();
		Floyd.DoWork();
		
		Mayweather FloydJr = new Mayweather();		
		Boxer Gloves = FloydJr;
		Gloves.DoWork();
		
	}
}
