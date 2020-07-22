import java.util.Arrays;
import java.util.Scanner;
class Demo {
    
    public static void main(String[] args) 
    {   
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        while(a-->0)
        {
            int b=sc.nextInt();
            int arr[]=new int[b];
            for(int i=0;i<arr.length;i++)
            {
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[0]+arr[1]);
        }
    }  
}
