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
		    int n=sc.nextInt();
		    String s=sc.next();
		    int x=0;
		    int y=0;
		    char ch='a';
		    if(s.charAt(0)=='L'){
		        x-=1;
		        ch='L';
		    }else if(s.charAt(0)=='R'){
		        x+=1;
		        ch='R';
		    }else if(s.charAt(0)=='U'){
		        y+=1;
		        ch='U';
		    }else if(s.charAt(0)=='D'){
		        y-=1;
		        ch='D';
		    }
		    for(int i=1;i<s.length();i++)
		    {
		        if(ch=='D' || ch=='U'){
		            if(s.charAt(i)=='L'){
		                x-=1;
		                ch='L';
		            }
		            else if(s.charAt(i)=='R'){
		                x+=1;
		                ch='R';
		            }
		            else if(s.charAt(i)=='D' || s.charAt(i)=='U'){
		                continue;
		            }
		            
		        }
		        else if(ch=='L' || ch=='R')
		        {
		            if(s.charAt(i)=='D'){
		                y-=1;
		                ch='D';
		            }
		            else if(s.charAt(i)=='U'){
		                y+=1;
		                ch='U';
		            }
		            else if(s.charAt(i)=='L' || s.charAt(i)=='R'){
		                continue;
		            }
		        }
		    }
		    System.out.println(x+" "+y);
		}
	}
}
