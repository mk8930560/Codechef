import java.util.Scanner;
class Myclass
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            int sum=1;
            int b=sc.nextInt();
            for(int j=1;j<=b;j++)
            {
                sum*=j;
            }
            System.out.println(sum);
        }
        
    }
}
