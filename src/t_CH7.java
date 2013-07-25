import java.util.Scanner;

/**
 * Chapter 7
 * Subject
 * @author bmarini
 */
public class t_CH7
{
	Scanner in = new Scanner(System.in);
	private int hour;
	private int minute;
	private int second;
	
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
					System.out.println("1 - Variable Length Arguments");
					System.out.println("2 - Time");
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
					varLength();
					select = -1;
					break;
				}
				case 2:
				{
					time();
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
	 * 		Function that calls the average() function.  You can pass any number of
	 *	integers to the average() function and it will still work.
	 */
	private void varLength()
	{
		System.out.println("The average is " + average(1, 2, 3, 4, 5, 6));
	}
	
	private void time()
	{
		setTime(13, 27, 6);
		System.out.println("\n" + toMilitary());
	}
	
	
	//	Showcasing the ability to use (...) to use an indeterminate amount of numbers
	private static int average(int...numbers)
	{
		int total = 0;
		//	Enhanced FOR loop
		for(int x:numbers)
		{
			total += x;
		}
		
		//	numbers.length will equal how many numbers were inserted
		return total/numbers.length;
	}
	
	private void setTime(int h, int m, int s)
	{
		hour = ((h >= 0) && (h < 24) ? h : 0);
		minute = ((m >= 0) && (m < 60) ? m : 0);
		second = ((s >= 0) && (s < 60) ? s : 0);
	}
	
	private String toMilitary()
	{
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}
	
	private String toNotMilitary()
	{
		int hFix = 0;
		String day;
		
		
		
		return String.format("%02d:%02d:%02d", hFix, minute, second);
	}
}

//poem