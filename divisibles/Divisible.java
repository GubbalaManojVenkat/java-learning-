import java.util.*;
public class Divisible{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int n = scan.nextInt();
        if (n%5==0)
        System.out.println(n+" "+"its Divisible by 5");
        else if (n%11==0)
        System.out.println(n+" "+"its Divisible by 11");
        else
        System.out.println(n+" "+ "its not divisible by 5 or 11" );

    }
}