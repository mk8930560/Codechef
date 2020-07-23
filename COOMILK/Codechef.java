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
		BufferedReader ob =new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(ob.readLine());
		while (t-- > 0) {
			int n=Integer.parseInt(ob.readLine());
			String arr[]=ob.readLine().split(" ");
			boolean obey=true;
			for(int i=0;i<arr.length-1;i++){
				if(arr[i].equals("cookie") && arr[i+1].equals("cookie")) {
					obey=false;
				}
			}
			if(arr[n-1].equals("cookie")) {
				obey=false;
			}
			if(obey){
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}
