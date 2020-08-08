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
		BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(ob.readLine());
		while(t-->0)
		{
		    String val[]=ob.readLine().split(" ");
		    int day=Integer.parseInt(val[0]);
		    String s=val[1];
		    int arr[]=new int[7];
		    int a=0;
		    if(s.equals("mon"))
		        a=0;
		    else if(s.equals("tues"))
		        a=1;
		    else if(s.equals("wed"))
		        a=2;
		    else if(s.equals("thurs"))
		        a=3;
		    else if(s.equals("fri"))
		        a=4;
		    else if(s.equals("sat"))
		        a=5;
		    else if(s.equals("sun"))
		        a=6;
		    for(int i=a;i<=6;)
		    {
		        if(day>0)
		        {
		            if(i<6)
		            {
		               arr[i]+=1;
		               i++;
		               --day;
		            }
		            else if(i==6)
		            {
		                arr[i]+=1;
		                i=0;
		                --day;
		            }
		        }else
		            break;
		    }
		    for(int i=0;i<=6;i++)
		    {
		        System.out.print(arr[i]+" ");
		    }
		    System.out.println();
		}    
	}
}
