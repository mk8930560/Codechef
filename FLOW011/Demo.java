import java.util.Scanner;
class Demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            double sal=sc.nextInt();
            if(sal<1500)
            {
                double Gross=sal+((sal*10)/100)+((sal*90)/100);
                System.out.println(Gross);
                
            }
            else if(sal>=1500)
            {
                double Gross=sal+500+((sal*98)/100);
                System.out.println(Gross); 
            }
        }
    }
    
}
