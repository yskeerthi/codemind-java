import java.util.Scanner;
public class main{
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       char ch;
       char choice=sc.next().charAt(0);
        switch(choice){
            case 'G':
                System.out.print("Green");
            break;
            case 'I':
                System.out.print("Indigo");
            break;
            case 'B':
                System.out.print("Blue");
            break;
            case 'V':
                System.out.print("Violet");
            break;
            case 'O':
                System.out.print("Orange");
            break;
            case 'Y':
                System.out.print("Yellow");
            break;
            case 'R':
                System.out.print("Red");
            break;
        default:
        System.out.print("-1");
        
            
                
        }
    }
}