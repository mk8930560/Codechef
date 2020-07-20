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
		    int total = sc.nextInt();
		    int arr[] = new int[total];
		    for(int i=0;i<total;i++)
		    {
		        arr[i] = sc.nextInt();
		    }
		    int flag=0;
		    for(int i=0;i<total;i++)
		    {
		        if(arr[i]%2==0){
		            flag=1;
		            break;
		        }else if(arr[i]%2!=0){
		            continue;
		        }
		    }
		    if(flag==1){
		        System.out.println("NO");
		    }else{
		        System.out.println("YES");
		    }
		}
	}
}
