import java.util.Scanner;
public class main{
    public static void main(String[]  args)
    {
        Scanner sc=new Scanner(System.in);
        int n,temp,r,s=0;
        n=sc.nextInt();
         temp=n;
        while(n!=0)
        {
            r=n%10;
            s=r+s*10;
            n=n/10; 
        }
        if(temp==s)
        {
            System.out.print("Palindrome");
        }
        else
        {
            System.out.print("Not Palindrome");
        }
    }
}