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
		    int a=sc.nextInt();
		    String arr[]=new String[a];
		    for(int i=0;i<a;i++)
		    {
		        String s=sc.next();
		        arr[i]=s;
		    }
		    for(int i=0;i<a-1;i++)
		    {
		        String s1=arr[i];
		        String s2=arr[i+1];
		        StringBuilder sb=new StringBuilder(); 
		        for(int j=0;j<s1.length();j++)
		        {
		            char c1=s1.charAt(j);
		            char c2=s2.charAt(j);
		            if(c1=='1' && c2=='1'|| c1=='0' && c2=='0')
		            {
		                sb.append("0");
		            }
		            else if(c1=='1' && c2=='0' || c2=='1' && c1=='0')
		            {
		                sb.append("1");
		            }
		        }
		        arr[i+1]=sb.toString();
		    }
		    String weapon=arr[arr.length-1];
		    int totalweapon=0;
		    for(int i=0;i<weapon.length();i++)
		    {
		        char c=weapon.charAt(i);
		        if(c=='1')
		        {
		           totalweapon++; 
		        }
		    }
		    System.out.println(totalweapon);
		}
	}
}
