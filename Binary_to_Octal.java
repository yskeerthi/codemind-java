import java.util.Scanner;
public class main{
    public static void main(String[] arg)
    {
      Scanner sc=new Scanner(System.in);
      int a;
       a=sc.nextInt();
       sc.nextLine();
       for(int i=1;i<=a;i++)
       {
           String s =sc.next();
           int dec=Integer.parseInt(s, 2);
          String octal= Integer.toOctalString(dec);
          System.out.println(octal);
       }
     
    }
}