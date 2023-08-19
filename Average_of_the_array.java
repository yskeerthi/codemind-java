import java.util.Scanner;
public class main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] intArray=new int[n];
         for(int i=0;i<n;i++)
        {
            intArray[i]=sc.nextInt();
        }
        double sum=0;
        for(int i=0;i<n;i++)
        {
                sum+=intArray[i];
        }
        double avrg=(sum)/n;
        System.out.printf("%.2f",avrg);
        
    }
}