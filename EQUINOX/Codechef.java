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
	        
	        int N = Integer.parseInt(s[0]);
	        int A = Integer.parseInt(s[1]);
	        int B = Integer.parseInt(s[2]);
	        
	        long Ascore=0;
	        long Bscore=0;
	        
	        String words[]=new String[N];
	        
	        for(int i=0;i<N;i++)
	            words[i]=ob.readLine();
	            
	        for(int i=0;i<N;i++)
	        {
	            String word=words[i];
	            if(word.charAt(0)=='E' || word.charAt(0)=='Q'||
	                word.charAt(0)=='U'|| word.charAt(0)=='I'||
	                word.charAt(0)=='N'|| word.charAt(0)=='O'||
	                word.charAt(0)=='X')
	                {
	                    Ascore+=A;    
	                }
	                else
	                    Bscore+=B;
	        }
	        if(Ascore>Bscore)
	            System.out.println("SARTHAK");
	        else if(Ascore<Bscore)
	            System.out.println("ANURADHA");
	        else
	            System.out.println("DRAW");
	    }
	}
}
