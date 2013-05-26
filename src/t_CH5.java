/*
 * Chapter 5:
 * 		Math class methods, random numbers, and scope
 */

import java.util.Scanner;

public class t_CH5
{
	Scanner in = new Scanner(System.in);
	
	//	Method to select the subject.
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
					System.out.println("1 - Class 1");
					System.out.println("2 - Class 2");
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
					class1();
					select = -1;
					break;
				}
				case 2:
				{
					class2();
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
	
	private void class1()
	{
		
	}
	
	private void class2()
	{
		
	}
}

/*

						   "As Soon as Fred Gets Out of Bed"

							As soon as Fred gets out of bed,
							his underwear goes on his head.
							His mother laughs, "Don't put it there,
							a head's no place for underwear!"
							But near his ears, above his brains,
							is where Fred's underwear remains.
							
							At night when Fred goes back to bed,
							he deftly plucks it off his head.
							His mother switches off the light
							and softly croons, "Good night! Good night!"
							And then, for reasons no one knows,
							Fred's underwear goes on his toes. 
							
											-Jack Pretlutsky

 */