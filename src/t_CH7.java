import java.util.Scanner;

/**
 * Chapter 7
 * Subject
 * @author bmarini
 */
public class t_CH7
{
	Scanner in = new Scanner(System.in);
	
	/**
	 * Method to select your subject
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

//poem