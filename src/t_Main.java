import java.util.Scanner;

/**
 * 			Main file for my attempt at creating a beginer's guide
 * 		to Java.  Classes are thought of as 'chapters', and each one
 * 		focuses on a specific set of material, grouped together
 * 		intuitively.  Each chapter will build on its predecessor.
 * 
 * 		@author 	Brian Marini <a href="mailto:brianmarini@gmail.com">brianmarini@gmail.com</a>
 * 		@version 	0.5
 */
public class t_Main
{
	public static void main(String args[])
	{
		short choice = -1;
		boolean end = false;
		Scanner in = new Scanner(System.in);
		
/*
 * 						~~~>   CHAPTER 4   <~~~
 * 			This is the syntax for creating an object of a class.
 */
		t_CH1 A = new t_CH1();
		t_CH2 B = new t_CH2();
		t_CH3 C = new t_CH3();
		t_CH4 D = new t_CH4();
		t_CH5 E = new t_CH5();
		t_CH6 F = new t_CH6();
		t_CH7 G = new t_CH7();
		
		/*
		 * 		This WHILE loop contains a SWITCH statement that, together, will
		 * 	run the methods in whichever chapter the user has selected.
		 */
		while(end == false)
		{
			/*
			 * 		Within this SWITCH statement is a series of nested SWITCH
			 * 	statements that prompt the user to chose a method, or 'lesson'.
			 */
			switch(choice)
			{
				case 0:
				{
					System.out.print("\nGoodbye!");
					end = true;
					break;
				}
				case 1:
				{
					choice = A.selector();
					break;
				}
				case 2:
				{
					choice = B.selector();
					break;
				}
				case 3:
				{
					choice = C.selector();
					break;
				}
				case 4:
				{
/*
 * 							~~~>   CHAPTER 4   <~~~
 * 						Here is an example of calling a method within a class
 * 					using the dot separator (.), and in this case, accepting
 * 					a return value.  Note that the variable type for 'choice'
 * 					must match the return value of the 'selector()' method.
 */
					choice = D.selector();
					break;
				}
				case 5:
				{
					choice = E.selector();
					break;
				}
				case 6:
				{
					choice = F.selector();
					break;
				}
				case 7:
				{
					choice = G.selector();
					break;
				}
				case -1:
				{
					System.out.println("\nWhich Chapter would you like to run?");
					System.out.println("Currently available: CH1 - CH7");
					System.out.print("Or type 0 to exit the program: ");
					choice = in.nextShort();
					break;
				}
				default:
				{
					System.out.println("Incorrect Value!");
					choice = -1;
					break;
				}
			}
		}
	in.close();
	}
}

/*

										"If"
										
						If you can keep your head when all about you
						Are losing theirs and blaming it on you;
						If you can trust yourself when all men doubt you,
						But make allowance for their doubting too:
						If you can wait and not be tired by waiting,
						Or, being lied about, don't deal in lies,
						Or being hated don't give way to hating,
						And yet don't look too good, nor talk too wise;
						
						If you can dream - and not make dreams your master;
						If you can think - and not make thoughts your aim,
						If you can meet with Triumph and Disaster
						And treat those two impostors just the same:.
						If you can bear to hear the truth you've spoken
						Twisted by knaves to make a trap for fools,
						Or watch the things you gave your life to, broken,
						And stoop and build'em up with worn-out tools;
						
						If you can make one heap of all your winnings
						And risk it on one turn of pitch-and-toss,
						And lose, and start again at your beginnings,
						And never breathe a word about your loss:
						If you can force your heart and nerve and sinew
						To serve your turn long after they are gone,
						And so hold on when there is nothing in you
						Except the Will which says to them: "Hold on!"
						
						If you can talk with crowds and keep your virtue,
						Or walk with Kings - nor lose the common touch,
						If neither foes nor loving friends can hurt you,
						If all men count with you, but none too much:
						If you can fill the unforgiving minute
						With sixty seconds' worth of distance run,
						Yours is the Earth and everything that's in it,
						And - which is more - you'll be a Man, my son!
							
											-Rudyard Kipling
 */