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
		    String s[]=ob.readLine().split(" ");
		    int total_act = Integer.parseInt(s[0]);
		    String Country = s[1];
		    int total=0;
		    while(total_act-->0)
		    {
		        String act_Type[]=ob.readLine().split(" ");
		        if(act_Type[0].equals("CONTEST_WON"))
		        {
		            total+=300;
		            if(Integer.parseInt(act_Type[1])<=20)
		            {
		                total+=20-Integer.parseInt(act_Type[1]);
		            }
		        }
		        else if(act_Type[0].equals("TOP_CONTRIBUTOR"))
		        {
		            total+=300;
		        }
		        else if(act_Type[0].equals("BUG_FOUND"))
		        {
		            total+=Integer.parseInt(act_Type[1]);
		        }
		        else if(act_Type[0].equals("CONTEST_HOSTED"))
		        {
		            total+=50;
		        }
		    }
		    int count=0;
		    if(Country.equals("INDIAN"))
		    {
		        while(total>=200)
		        {
		            total-=200;
		            count+=1;
		        }
		    }
		    else if(Country.equals("NON_INDIAN"))
		    {
		        while(total>=400)
		        {
		            total-=400;
		            count+=1;
		        }
		    }
		    System.out.println(count);
		}
	}
}
