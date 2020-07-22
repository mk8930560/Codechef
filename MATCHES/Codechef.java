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
		    int number1=sc.nextInt();
		    int number2=sc.nextInt();
		    int sum=number1+number2;
		    int count=0;
		    String s=Integer.toString(sum);
		    for(int i=0;i<s.length();i++)
		    {
		        char ch=s.charAt(i);
		        if(ch=='0' ||ch=='6'||ch=='9')
		        {
		            count+=6;
		        }
		        else if(ch=='2'||ch=='3'||ch=='5')
		        {
		            count+=5;
		        }
		        else if(ch=='1')
		        {
		            count+=2;
		        }
		        else if(ch=='4')
		        {
		            count+=4;
		        }
		        else if(ch=='8')
		        {
		            count+=7;
		        }
		        else if(ch=='7')
		        {
		            count+=3;
		        }
		    }
		    System.out.println(count);
		}
	}
}
