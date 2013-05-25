/*
 * 		Author:			Brian Marini
 * 		Start Date:		5/18/2013
 * 
 * 			Main file for my attempt at creating a beginer's guide
 * 		to Java.  Classes are thought of as 'chapters', and each one
 * 		focuses on a specific set of material, grouped together
 * 		intuitively.  Each chapter will build on its predecessor.
 */

import java.util.Scanner;

public class t_Main
{
	public static void main(String args[])
	{
		//	Variables in the scope of main()
		int choice = -1, subj;
		boolean end = false;
		
		//	Calling each of the the Chapter classes
		t_CH1 A = new t_CH1();
		t_CH2 B = new t_CH2();
		t_CH3 C = new t_CH3();
		
		Scanner in = new Scanner(System.in);
		
		/*
		 * 		This WHILE loop contains a SWITCH statement that, together, will
		 * 	run the methods in whichever chapter the user has selected.
		 */
		while(end == false)
		{
			//		Within this SWITCH statement is a series of nested SWITCH
			//	statements that prompt the user to chose a method, or 'lesson'.
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
					subj = 0;
					System.out.println("\nWhich subject would you like to run?");
					System.out.println("1 - Basic Output and Variables");
					System.out.println("2 - User Input");
					System.out.println("0 - Chose Another Chapter");
					System.out.print("Please enter a numerical choice: ");
					subj = in.nextInt();
					
					switch(subj)
					{
						case 0:
						{
							choice = -1;
							break;
						}
						case 1:
						{
							System.out.println("\nRunning A.output() method from t_CH1 class...\n");
							A.output();
							break;
						}
						case 2:
						{
							System.out.println("\nRunning A.inputTest() method from t_CH1 class...\n");
							A.inputTest();
							break;
						}
						default:
						{
							System.out.println("\nIncorrect input; closing program.");
							break;
						}
					}
					break;
				}
				case 2:
				{
					subj = 0;
					System.out.println("\nWhich subject would you like to run?");
					System.out.println("1 - Basic Math and Incrementals");
					System.out.println("2 - If Statements and Operators");
					System.out.println("0 - Chose Another Chapter");
					System.out.print("Please enter a numerical choice: ");
					subj = in.nextInt();
					
					switch(subj)
					{
						case 0:
						{
							choice = -1;
							break;
						}
						case 1:
						{
							System.out.println("\nRunning B.math() method from t_CH2 class...\n");
							B.math();
							break;
						}
						case 2:
						{
							System.out.println("\nRunning B.ifStatement() method from t_CH2 class...\n");
							B.ifStatement();
							break;
						}
						default:
						{
							System.out.println("\nIncorrect input; closing program.");
							break;
						}
					}
					break;
				}
				case 3:
				{
					subj = 0;
					System.out.println("\nWhich subject would you like to run?");
					System.out.println("1 - Switch Statements");
					System.out.println("2 - While Loops");
					System.out.println("3 - For Loops");
					System.out.println("4 - Do While Loops");
					System.out.println("0 - Chose Another Chapter");
					System.out.print("Please enter a numerical choice: ");
					subj = in.nextInt();
					
					switch(subj)
					{
						case 0:
						{
							choice = -1;
							break;
						}
						case 1:
						{
							System.out.println("\nRunning C.switchStatement() method from t_CH3 class...\n");
							C.switchStatement();
							break;
						}
						case 2:
						{
							System.out.println("\nRunning C.whileLoop() method from t_CH3 class...\n");
							C.whileLoop();
							break;
						}
						case 3:
						{
							System.out.println("\nRunning C.forLoop() method from t_CH3 class...\n");
							C.forLoop();
							break;
						}
						case 4:
						{
							System.out.println("\nRunning C.doWhileLoop() method from t_CH3 class...\n");
							C.doWhileLoop();
							break;
						}
						default:
						{
							System.out.println("\nIncorrect input; closing program.");
							break;
						}
					}
					break;
				}
				case -1:
				{
					System.out.println("\nWhich Chapter would you like to run?");
					System.out.println("Currently available: CH1 - CH3");
					System.out.print("Or type 0 to exit the program: ");
					choice = in.nextInt();
					break;
				}
				default:
				{
					//		Throws an error message to the user then prompts them again
					//	to chose a chapter.  This will keep the WHILE loop running
					//	until a legitimate chapter has ben selected.
					System.out.println("Incorrect Value!");
					System.out.println("Which Chapter would you like to run?");
					System.out.print("Currently available: CH1 - CH3: ");
					choice = in.nextInt();
					break;
				}
			}
		}
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