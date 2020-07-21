import java.util.Scanner;
import java.util.Arrays;
class Myclass
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int arr[]=new int[3];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<arr.length;j++)
            {
                arr[j]=sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[arr.length-2]);
        }
    }
}
