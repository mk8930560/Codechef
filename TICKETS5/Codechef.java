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
			String s=sc.next();
			boolean luck=true;
			if(s.charAt(0)==s.charAt(1))
			{
				luck=false;
			}else {
				for(int i=0;i<s.length()-2;i++){
					if(s.charAt(i)!=s.charAt(i+2))
					{
						luck=false;
					}
				}
			}
			if(luck){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}
