

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileIO 
{

	public static void main(String[] args) 
	{
		try 
		{
		String filepath = "C:\\Users\\rmorris116\\Sandbox\\OOP_week15.txt";
		String iReadThis = Read(filepath);
		String originalWord = "dolor";
		String replaceWord ="hedon";
		String replacedString = Replace(iReadThis,originalWord, replaceWord);
		Write(replacedString, filepath);
		}
	
	
 	catch (IOException ex)
	{
		System.out.println("Something went wrong while reading or writing from file");
		ex.printStackTrace();
	}
	catch (NullPointerException nullex)
	{
		System.out.println("You did not supply a valid file path");
		nullex.printStackTrace();
	}
}
	
	private static void Write(String replacedString, String filePath) throws IOException
	{
		
		FileWriter writer = null;
		
		try
		{
			writer = new FileWriter(filePath);
			writer.write(replacedString);
		}
		finally 
		{
			if (writer != null )
			{
				writer.close();
			}
		}
	}
	
	private static String Replace(String iReadThis, String originalWord, String replaceWord)
	{
		String replacedString = null;
		
		if(iReadThis != null)
		{
			replacedString = iReadThis.replace(originalWord, replaceWord);
		}
		
		return replacedString;
	}
		
	public static String Read(String filePath) throws NullPointerException, IOException
	{
		FileReader fileReader = null;
		BufferedReader bufferedReader = null;
		String fullFile = null;
		
		try 
		{
			if (filePath == null)
			{
				throw new NullPointerException();
			}
			
			fileReader = new FileReader(filePath);
			
			StringBuilder builder = new StringBuilder();
			
			String iReadThis = bufferedReader.readLine();
						
			while(iReadThis != null)
			{
				builder.append(iReadThis);
				iReadThis = bufferedReader.readLine();
			}
			
			fullFile = builder.toString();
		}
		finally
		{
			if (fileReader != null);
			{
				fileReader.close();
			}
			
			if (bufferedReader != null)
			{
			bufferedReader.close();	
			}
		}
		return fullFile;
	 }
	
}
