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
		    String s=sc.next();
		    int StartIndex=0;
		    int EndIndex=0;
		    for(int i=0;i<s.length();i++)
		    {
		        if(s.charAt(i)=='1'){
		            StartIndex=i;
		            break;
		        }
		    }
		    for(int i=s.length()-1;i>=0;i--)
		    {
		        if(s.charAt(i)=='1'){
		            EndIndex=i;
		            break;
		        }
		    }
		    int flag=0;
		    for(int i=StartIndex;i<=EndIndex;i++)
		    {
		        if(s.charAt(i)=='0'){
		            flag=1;
		            break;
		        }
		    }
		    if(flag==1)
		        System.out.println("NO");
		    else
		        System.out.println("YES");
		}
	}
}
