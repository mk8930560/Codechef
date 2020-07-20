/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int Dieface = sc.nextInt();
		    int firstToss = sc.nextInt();
		    int secondToss = sc.nextInt();
		    int arr[]=new int[Dieface];
		    int countFrstFace=0;
		    int countsendFace=0;
		    
		    for(int i=0;i<Dieface;i++)
		    {
		        arr[i]=sc.nextInt();
		        if(arr[i]==firstToss)
		            countFrstFace++;
		        if(arr[i]==secondToss)
		            countsendFace++;
		    }
		    double prob = Double.valueOf(countFrstFace)/Double.valueOf(Dieface)*Double.valueOf(countsendFace)/Double.valueOf(Dieface);
		    System.out.printf("%.10f",prob);
		    System.out.println();
		}
	}
}
