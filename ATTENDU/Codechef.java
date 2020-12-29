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
	    int t=Integer.parseInt(ob.readLine());
	    while(t-->0)
	    {
	        int DayPast=Integer.parseInt(ob.readLine());
	        String s=ob.readLine();
	        int present=0;
	        for(int i=0;i<DayPast;i++)
	        {
	            if(s.charAt(i)=='1')
	                present++;
	        }
	        int Total_Present_Day=((120-DayPast)+present);
	        double attandence=(Double.valueOf(Total_Present_Day)/Double.valueOf(120))*100;
	        if(attandence<75.0)
	            System.out.println("NO");
	        else
	            System.out.println("YES");
	    }
	}
}
