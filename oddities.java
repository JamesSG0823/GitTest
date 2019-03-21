import java.util.*;

public class oddities
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int testcase = args[0];
		
		for (i = 0; i < testcase; i++)
		{
			int numberToCheck = input.nextInt();

			boolean isEven = false;
			
			if(numberToCheck % 2 == 0)
			{
				isEven = true;
			}//if
		}//for
	}//main method
}//class
