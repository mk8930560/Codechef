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
            int b=sc.nextInt();
            int arr[]=new int[b];
            int c=sc.nextInt();
            for(int j=0;j<b;j++)
            {
                arr[j]=sc.nextInt();
            }
            int count=0;
            for(int i=0;i<b;i++)
            {
                for(int j=i+1;j<b;j++)
                {
                    if(arr[i]+arr[j]==c)
                    {
                        System.out.println("Yes");
                        count=1;
                        break;
                    }
                }
                if(count==1)
                    break;
            }
            if(count==0)
            {
                System.out.println("No");
            }
        }
	}
}
