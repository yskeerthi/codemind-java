import java.util.Scanner;
public class main{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        float a,b,c,d,area;
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        d=(a+b+c)/2;
        area=d*(d-a)*(d-b)*(d-c);
        System.out.printf("%.2f",Math.sqrt(area));
    }
}