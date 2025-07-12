import java.util.*;
public class Calculator{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the First number :");
        double a = scan.nextDouble();
        System.out.println("enter the second number :");
        double b = scan.nextDouble();
        System.out.println("enter the operator : + , - , * , /");
        String sh = scan.next();
        switch(sh){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
               System.out.println(a-b);
               break;
            case "*":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break; 
            default:
                System.out.println("enter an valid operator");
        }

    }

}