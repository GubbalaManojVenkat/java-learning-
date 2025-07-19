import java.util.*;
public class Positive{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();
        if(n>0)
        System.out.println(n+" " +"its positive");
        else if(n<0)
        System.out.println(n+" " +"its negative");
        else if(n==0)
        System.out.println(n+" "+ "its zero");
        

    }
}