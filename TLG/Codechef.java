/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int value1=0;
		int value2=0;
		int Player1lead=0;
		int Player2lead=0;
		while(t-->0)
		{
		    value1+=sc.nextInt();
		    value2+=sc.nextInt();
		    if(value1>value2)
		    {
		        Player1lead=Math.max(Player1lead,value1-value2);
		    }
		    else
		    {
		        Player2lead=Math.max(Player2lead,value2-value1);
		    }
		}
		if(Player1lead>Player2lead)
		{
		    System.out.println("1"+" "+Player1lead);
		}
		else
		{
		    System.out.println("2"+" "+Player2lead);
		}
	}
}
