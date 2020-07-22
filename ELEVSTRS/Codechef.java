/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int floor=sc.nextInt();
		    int stairspeed=sc.nextInt();
		    int elevatorspeed=sc.nextInt();
		    double stairtime=(Math.sqrt(2)*floor)/stairspeed;
		    double elevatortime=(double)(2*floor)/elevatorspeed;
		    if(stairtime>elevatortime)
		    {
		        System.out.println("Elevator");
		    }
		    else if(stairtime<elevatortime)
		    {
		        System.out.println("Stairs");
		    }
		    
		}
	}
}
