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
		    String s1=sc.next();
		    String s2=sc.next();
		    int len1=s1.length();
		    int len2=s2.length();
		    if(len1>=1 && len1<=10 && len2>=1 && len2<=10 && len1==len2)
		    {
		        int flag=0;
		        for(int i=0;i<len1;i++)
		        {
		            char c1=s1.charAt(i);
		            char c2=s2.charAt(i);
		            if(c1>='a' && c1<='z' && c2>='a' && c2<='z' && c1==c2)
		            {
		                continue;
		            }
		            else if(c1=='?' && c2=='?' || c1>='a' && c1<='z' && c2=='?' || c1=='?' && c2>='a' && c2<='z')
		            {
		                continue;
		            }else
		            {
		                flag=1;
		                break;
		            }
		        }
		        if(flag==0)
		        {
		            System.out.println("Yes");
		        }else
		        {
		            System.out.println("No");
		        }
		    }
		}
	}
}
