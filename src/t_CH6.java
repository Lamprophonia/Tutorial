import java.util.Scanner;
import java.util.Random;

/**
 * Chapter 6:
 * Simple arrays, more FOR loops (multiple variables, enhanced FOR loop),
 * BREAK statement and CONTINUE statement
 * @author bmarini
 */
public class t_CH6
{
	Scanner in = new Scanner(System.in);
	
	/**
	 * Method to select the subject.
	 * @return -1 to Main, which will return the user to the menu page.
	 */
	public short selector()
	{
		boolean cont = true;
		short select = -1;
		
		while(cont)
		{
			switch(select)
			{
				case -1:
				{
					System.out.println("\nWhich subject would you like to run?");
					System.out.println("1 - Arrays");
					System.out.println("2 - Enhanced For Statement");
					System.out.println("3 - Passing an Array");
					System.out.println("4 - Multidimentional Array");
					System.out.println("0 - Chose Another Chapter");
					select = in.nextShort();
					break;
				}
				case 0:
				{
					cont = false;
					break;
				}
				case 1:
				{
					arrays();
					select = -1;
					break;
				}
				case 2:
				{
					enhFor();
					select = -1;
					break;
				}
				case 3:
				{
					passArray();
					select = -1;
					break;
				}
				case 4:
				{
					multiArray();
					select = -1;
					break;
				}
				default:
				{
					System.out.println("\nIncorrect input!");
					select = -1;
					break;
				}
			}
		}
		
		return -1;
	}
	
	private void arrays()
	{
		//	Declaring an array.  It's a good idea to set the size to it's own variable.
		int i, max = 30, j = 0, sum = 0, freqSize = 7, freqIteration = 1000, freqSum = 0;
		int arrayName[] = new int[max];
		Random rand = new Random();
		int freq[] = new int[freqSize];
		
		//	For loop to announce the values of each member of the array
		for(i = 0; i < max; i++)
		{
			System.out.printf("arrayName[%d] is %d.\n", i, arrayName[i]);
		}
		
		System.out.println();
		
		//	For loop to set new values and print them
		for(i = 0; i < max; i++)
		{
			j = (i * i);
			arrayName[i] = j;
			System.out.printf("arrayName[%d] is %d.\n", i, arrayName[i]);
		}
		
		//	Summing the array
		for(i = 0; i < max; i++)
		{
			sum += arrayName[i];
		}
		System.out.printf("\nSum = %d\n", sum);
		
		//	Incorporating random number (dice rolls)
		for(i = 0; i < freqIteration; i++)
		{
			++freq[1 + rand.nextInt(6)];
		}
		
		System.out.println("Face\tFrequency");
		
		for(i = 0; i < freq.length; i++)
		{
			freqSum += freq[i];
			System.out.printf("%d\t%d\n", i, freq[i]);
		}
		
		System.out.printf("\nfreqSum = %d\n", freqSum);
	}
	
	private void enhFor()
	{
		int arrayLoop[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum = 0;
		
		for(int x: arrayLoop)
		{
			sum += x;
		}
		
		System.out.printf("\nSum = %d\n", sum);
	}
	
	private void passArray()
	{
		int arrayName[] = {1, 2, 3, 4, 5};
		
		takeArray(arrayName);
		
		for(int y : arrayName)
		{
			System.out.println(y);
		}
	}
	
	private void takeArray(int x[])
	{
		int i;
		for(i = 0; i < x.length; i++)
		{
			x[i] += 5;
		}
	}
	
	private void multiArray()
	{
		int numRow = 5, numCol = 10;
		int firstArray[][] = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
		int secondArray[][] = {{1, 2, 3, 4}, {5, 6}};
		int thirdArray[][] = new int[numRow][numCol];
		
		multiArrayLoop(firstArray);
		multiArrayLoop(secondArray);
		multiArrayLoop(thirdArray);
	}
	
	private void multiArrayLoop(int x[][])
	{
		int row, col;
		
		for(row = 0; row < x.length; row++)
		{
			for(col = 0; col < x[row].length; col++)
			{
				System.out.printf("x[%d][%d] %d\t\n",row, col, x[row][col]);
			}
		}
		System.out.println();
	}
}

//poem