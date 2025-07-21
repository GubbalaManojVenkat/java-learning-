import java.util.*;
public class Great{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter two numbers :");
        int n = scan.nextInt();
        int v = scan.nextInt();
        if (n>v)
        System.out.println("Greater number is: " +" "+ n );
        else 
        System.out.println("Greater number is:"+" "+v);

    }
}