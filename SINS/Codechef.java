/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int CalVal(int M,int B)
    {
        if(B==0)
            return M;
        return CalVal(B,M%B);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0)
		{
		    int M=sc.nextInt();
		    int B=sc.nextInt();
		    int answer=CalVal(M,B);
		    System.out.println(answer+answer);
		}
	}
}

