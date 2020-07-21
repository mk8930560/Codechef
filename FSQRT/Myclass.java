import java.util.Scanner;
import java.lang.Math;
class Myclass
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            int b=sc.nextInt();
            int d=(int)(Math.sqrt(b));
            System.out.println(d);
        }
    }
}
