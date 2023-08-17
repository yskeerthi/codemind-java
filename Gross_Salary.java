import java.util.Scanner;
public class main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double g,c,h,d;
        c=sc.nextDouble();
        if(c<=10000)
        {
            d=0.8*c;
            h=0.2*c;
        }
        else if(c<=20000)
        {
            d=0.9*c;
            h=0.25*c;
        }
        else
        {
            d=0.95*c;
            h=0.3*c;
        }
        g=c+d+h;
        System.out.printf("%.2f",g);
    }
}