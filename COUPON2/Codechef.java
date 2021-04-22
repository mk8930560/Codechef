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
	    BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
	    int t=Integer.parseInt(ob.readLine());
	    while(t-->0)
	    {
	        String s[]= ob.readLine().split(" ");
	        
	        int DelvCharge=Integer.parseInt(s[0]);
	        int Couponhost=Integer.parseInt(s[1]);
	        
	        String A[]=ob.readLine().split(" ");
	        int A1=Integer.parseInt(A[0]);
	        int A2=Integer.parseInt(A[1]);
	        int A3=Integer.parseInt(A[2]);
	        
	        String B[]=ob.readLine().split(" ");
	        int B1=Integer.parseInt(B[0]);
	        int B2=Integer.parseInt(B[1]);
	        int B3=Integer.parseInt(B[2]);
	        
	        int totalA=(A1+A2+A3);
	        int totalB=(B1+B2+B3);
	        
	        int PriceWithCoupon=totalA+totalB;
	        int PriceWithoutCopupon=totalA+totalB;
	        
	        if(totalA<150 || totalB<150 || totalA<150 && totalB<150)
	        {
	            if(totalA<150 && totalB<150)
	            {
	                PriceWithCoupon +=(Couponhost+(2*DelvCharge));
	                PriceWithoutCopupon +=(2*DelvCharge);
	            }
	            else if(totalA<150 || totalB<150)
	            {
	                PriceWithCoupon +=(Couponhost+DelvCharge);
	                PriceWithoutCopupon +=(2*DelvCharge);
	            }
	        }
	        else if(totalB >=150 && totalA>=150)
	        {
	            PriceWithCoupon +=Couponhost;
	            PriceWithoutCopupon +=(2*DelvCharge);
	        }
	        
	        if(PriceWithCoupon<PriceWithoutCopupon)
	            System.out.println("YES");
	        else
	            System.out.println("NO");
	    }
	}
}
