import java.util.Scanner;
class Codechef {    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            int num=sc.nextInt();
            int b=num;
            int num2=0;
            while(b !=0)
            {
                int digit=b % 10;
                num2=num2*10+digit;
                b/=10;
            }
            if(num==num2)
            {
                System.out.println("wins");
            }
            else
            {
                System.out.println("losses");
            }
        }
    }   
}
