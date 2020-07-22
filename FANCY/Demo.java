import java.util.*;
import java.lang.*;
import java.io.*;
class Demo {
    
    public static void main(String[] args) 
    {   
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        sc.nextLine();
        while(a-->0)
        {
            String s=sc.nextLine();
            String arr[]=s.split(" ");
            boolean f=false;
            for(int j=0;j<arr.length;j++)
            {
                if(arr[j].equals("not"))
                  f=true;
            }
            if(f)
		        System.out.println("Real Fancy");
		        else
		        System.out.println("regularly fancy");
        }
    }   
}
