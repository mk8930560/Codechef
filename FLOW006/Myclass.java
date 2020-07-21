import java.util.Scanner;
class Myclass
{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            int sum=0;
            int b=sc.nextInt();
            while(b!=0)
            {
                sum+=b%10;
                b=b/10;
            }
            System.out.println(sum);
        }
    }
}

