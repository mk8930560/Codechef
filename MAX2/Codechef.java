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
		String s=sc.next();
		int count=0;
		for(int i=t-1;i>=0;i--)
		{
		    if(s.charAt(i)=='0')
		        count++;
		    else 
		        break;
		}
		System.out.println(count);
	}
}
