import java.util.Scanner;
import java.util.Random;

/**
 * Chapter 5:
 * 		Math class methods, random numbers, and scope
 * @author bmarini
 */
public class t_CH5
{
	Scanner in = new Scanner(System.in);
	
	/**
	 * Method to select the subject.
	 * 
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
					System.out.println("1 - Math Class");
					System.out.println("2 - Random Numbers");
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
					mathClass();
					select = -1;
					break;
				}
				case 2:
				{
					rand();
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
	
	/**
	 * 
	 */
	private void mathClass()
	{
		int big = 15, small = 3;
		
		System.out.println("The value of e, common in calculus, is " + Math.E);
		
		System.out.println("The value of pi, common in trigonometry, is " + Math.PI);
		
		System.out.println("The variable 'big' raised to the power of 'small' is " + Math.pow(big, small));
		
		System.out.println("The absolute value of -26.7 is " + Math.abs(-26.7));
		
		System.out.println("7.1 rounded up is " + Math.ceil(7.1));
		
		System.out.println("9.9 rounded down is " + Math.floor(9.9));
		
		System.out.println("The larger of the two variables 'big' and 'small' is " + Math.max(big, small));
		
		System.out.println("The smaller of the two variables 'big' and 'small' is " + Math.min(big, small));
		
		System.out.println("The square root of 9 is " + Math.sqrt(9));
		
		System.out.println("The square root of 10 is " + Math.sqrt(10));
	}
	
	/**
	 * 
	 */
	private void rand()
	{
		Random dice = new Random();
		
		
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