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
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int max=arr[n-1];
		int count=0;
		for(int i=arr.length-2;i>=0;i--)
		{
		    if(arr[i]!=max)
		    {
		        max=arr[i]%max;
		        count++;
		        break;
		    }
		}
		if(count!=0)
		{
		    System.out.println(max);
		}else
		{
		    System.out.println(0);
		}
	}
}
