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
		    int ChefDistance=sc.nextInt();
		    int KefaDistance=sc.nextInt();
		    int BottleDistance=sc.nextInt();
		    int ChefSpeed=sc.nextInt();
		    int KefaSpeed=sc.nextInt();
		    int ChefDistanceFromBottle=Math.abs(BottleDistance-ChefDistance);
		    int KefaDistanceFromBottle=Math.abs(BottleDistance-KefaDistance);
		    double ChefTime=(double)ChefDistanceFromBottle/ChefSpeed;
		    double KefaTime=(double)KefaDistanceFromBottle/KefaSpeed;
		    if(ChefTime>KefaTime)
		    {
		        System.out.println("Kefa");
		    }
		    else if(ChefTime<KefaTime)
		    {
		        System.out.println("Chef");
		    }
		    else
		    {
		        System.out.println("Draw");
		    }
		}
	}
}
