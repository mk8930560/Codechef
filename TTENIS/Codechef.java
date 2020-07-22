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
		    String s=sc.next();
		    int win=0;
		    int lose=0;
		    if(s.length()>=1 && s.length()<=100)
		    {
		        for(int i=0;i<s.length();i++)
		        {
		            if(s.charAt(i)=='1')
		            {
		                win+=1;    
		            }
		            else if(s.charAt(i)=='0')
		            {
		                lose+=1;
		            }
		            if(win==11 && lose<10)
		            {
		                System.out.println("WIN");
		                break;
		            }
		            else if(lose==11 && win<10)
		            {
		                System.out.println("LOSE");
		                break;
		            }
		            else if(win>=10 && lose>=10 && win-lose>1)
		            {
		                System.out.println("WIN");
		                break;
		            }
		            else if(win>=10 && lose>=10 && lose-win>1)
		            {
		                System.out.println("LOSE");
		                break;
		            }
		        }
		    }
		}
	}
}
