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
		    int PoliceHouse=sc.nextInt();
		    int house=sc.nextInt();
		    int time=sc.nextInt();
		    int speed=house*time;
		    int arr[]=new int[100];
		    while(PoliceHouse-->0)
		    {
		        int houseNo=sc.nextInt();
		        int StartIndex=1;
		        int lastIndex=100;
		        if(houseNo-speed>0)
		        {
		            StartIndex=houseNo-speed;
		        }
		        if(houseNo+speed<100)
		        {
		            lastIndex=houseNo+speed;   
		        }
		        for(int i=StartIndex-1;i<=lastIndex-1;i++)
		        {
		            arr[i]=1;
		        }
		    }
		    int count=0;
		    for(int i=0;i<100;i++)
		    {
		        if(arr[i]==0)
		            count++;
		    }
		    System.out.println(count);
		}
	}
}
