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
		for(;;)
		{
		    int total_elment=sc.nextInt();
		    if(total_elment>0)
		    {
		        int arr[] = new int[total_elment];
		        StringBuilder s1=new StringBuilder();
		        StringBuilder s2=new StringBuilder();
		        for(int i=0;i<total_elment;i++)
		        {
		            arr[i] = sc.nextInt();
		            s1.append(String.valueOf(arr[i]));
		        }
		        for(int i=1;i<=total_elment;i++)
		        {
		            for(int j=0;j<total_elment;j++)
		            {
		                if(i==arr[j])
		                {
		                    s2.append(String.valueOf(j+1));
		                    break;
		                }
		            }
		        }
		        if(s1.toString().equals(s2.toString()))
		        {
		            System.out.println("ambiguous");
		        }
		        else
		        {
		            System.out.println("not ambiguous");
		        }
		        
		    }
		    else{
		        break;
		    }
		    
		}
	}
}
