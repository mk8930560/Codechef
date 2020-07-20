/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int CalPower(int a)
    {
        int value=0;
        String s=String.valueOf(a);
        for(int i=0;i<s.length();i++)
        {
            value+=Character.getNumericValue(s.charAt(i));
        }
        return value;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int total_turn=sc.nextInt();
		    int chef_point=0;
		    int morty_points=0;
		    while(total_turn-->0)
		    {
		        int a=sc.nextInt();
		        int b=sc.nextInt();
		        if(a<10 && b<10)
		        {
		            if(a>b)
		            {
		                chef_point+=1;
		            }
		            else if(a<b)
		            {
		                morty_points+=1;
		            }
		        }
		        else
		        {
		            if(a>=10 && b<10)
		            {
		                int chef_power=CalPower(a);
		                if(chef_power>b)
		                {
		                    chef_point+=1;
		                }
		                else if(chef_power<b)
		                {
		                    morty_points+=1;
		                }
		                else if(chef_power==b)
		                {
		                    chef_point+=1;
		                    morty_points+=1;
		                }
		            }
		            else if(a<10 && b>=10)
		            {
		                int morty_power=CalPower(b);
		                if(morty_power>a)
		                {
		                    morty_points+=1;
		                }
		                else if(morty_power<a)
		                {
		                    chef_point+=1;
		                }
		                else if(morty_power==a)
		                {
		                    chef_point+=1;
		                    morty_points+=1;
		                }
		            }
		            else if(a>=10 && b>=10)
		            {
		                int chef_power=CalPower(a);
		                int morty_power=CalPower(b);
		                if(chef_power>morty_power)
		                {
		                    chef_point+=1;
		                }
		                else if(chef_power<morty_power)
		                {
		                    morty_points+=1;
		                }
		                else if(chef_power==morty_power)
		                {
		                    chef_point+=1;
		                    morty_points+=1;
		                }
		            }
		        }
		    }
		    if(chef_point>morty_points)
		    {
		        System.out.println("0"+" "+chef_point);
		    }
		    else if(morty_points>chef_point)
		    {
		        System.out.println("1"+" "+morty_points);
		    }
		    else if(chef_point==morty_points)
		    {
		        System.out.println("2"+" "+chef_point);
		    }
		}
	}
}
