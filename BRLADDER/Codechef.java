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
		    int a=sc.nextInt();
		    int b=sc.nextInt();
		    int smaller=0;
		    int bigger=0;
		    if(a>b){
		        smaller=b;
		        bigger=a;
		    }
		    else{
		        bigger=b;
		        smaller=a;
		    }
		    if(smaller%2!=0){
		        if(bigger-smaller==1 || bigger-smaller==2)
		        {
		            System.out.println("YES");
		        }
		        else{
		            System.out.println("NO");
		        }
		    }else{
		        if(smaller%2==0 && bigger%2==0 && bigger-smaller==2)
		        {
		            System.out.println("YES");
		        }
		        else
		        {
		            System.out.println("NO");
		        }
		    }
		}
	}
}
