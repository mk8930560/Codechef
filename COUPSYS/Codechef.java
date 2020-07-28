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
		    int coupons = sc.nextInt();
		    
		    int level1Arr[] = new int[3];
		    int level2Arr[] = new int[3];
		    int level3Arr[] = new int[3];
		    
		    while(coupons-->0)
		    {
		        int city=sc.nextInt();
		        int level=sc.nextInt();
		        int discount=sc.nextInt();
		        if(level==1)
		        {
		            if(discount>level1Arr[2])
		            {
		                level1Arr[0]=city;
		                level1Arr[1]=level;
		                level1Arr[2]=discount;
		            }
		            else if(discount==level1Arr[2])
		            {
		                if(city<level1Arr[0])
		                {
		                    level1Arr[0]=city;
		                    level1Arr[1]=level;
		                    level1Arr[2]=discount;
		                }
		            }
		            
		        }else if(level==2)
		        {
		            if(discount>level2Arr[2])
		            {
		                level2Arr[0]=city;
		                level2Arr[1]=level;
		                level2Arr[2]=discount;
		            }
		            else if(discount==level2Arr[2])
		            {
		                if(city<level2Arr[0])
		                {
		                    level2Arr[0]=city;
		                    level2Arr[1]=level;
		                    level2Arr[2]=discount;
		                }
		            }
		            
		        }else if(level==3)
		        {
		            if(discount>level3Arr[2])
		            {
		                level3Arr[0]=city;
		                level3Arr[1]=level;
		                level3Arr[2]=discount;
		            }
		            else if(discount==level3Arr[2])
		            {
		                if(city<level3Arr[0])
		                {
		                    level3Arr[0]=city;
		                    level3Arr[1]=level;
		                    level3Arr[2]=discount;
		                }
		            }
		        }
		    }
		    System.out.println(level1Arr[2]+" "+level1Arr[0]);
		    System.out.println(level2Arr[2]+" "+level2Arr[0]);
		    System.out.println(level3Arr[2]+" "+level3Arr[0]);
		}
	}
}
