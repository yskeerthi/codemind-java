import java.util.*;
public class main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
         int[] Array=new int[n];
         for(int i=0;i<n;i++)
         {
             Array[i]=sc.nextInt();
         }
         int c=0;
        for(int i=0;i<n;i++)
         {
             int d=Integer.toString(Array[i]).length();
             if(d%2==0)
             {
                 c++;
             }
         }
        System.out.print(c);
        
    }
}