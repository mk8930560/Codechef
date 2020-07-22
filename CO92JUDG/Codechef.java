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
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int length=sc.nextInt();
		    int arr1[]=new int[length];
		    int arr2[]=new int[length];
		    int AliceSum=0;
		    int BobSum=0;
		    for(int i=0;i<arr1.length;i++)
		    {
		        arr1[i]=sc.nextInt();
		        AliceSum+=arr1[i];
		    }
		    for(int i=0;i<arr2.length;i++)
		    {
		        arr2[i]=sc.nextInt();
		        BobSum+=arr2[i];
		    }
		    Arrays.sort(arr1);
		    Arrays.sort(arr2);
		    AliceSum=AliceSum-arr1[arr1.length-1];
		    BobSum=BobSum-arr2[arr2.length-1];
		    if(AliceSum<BobSum)
		    {
		        System.out.println("Alice");
		    }
		    else if(AliceSum>BobSum)
		    {
		        System.out.println("Bob");
		    }
		    else if(AliceSum==BobSum)
		    {
		        System.out.println("Draw");
		    }
		    
		}
	}
}
