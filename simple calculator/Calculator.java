import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number :");
        double s = scan.nextDouble();
        System.out.println("Enter the second number :");
        double a = scan.nextDouble();
        System.out.println("enter the operator : + ,- ,* , /");
        String op = scan.next();
        if (op.equals("+"))
        System.out.print(s+a);
        else if (op.equals("-"))
        System.out.println(s-a);
        else if (op.equals("*"))
        System.out.println(s*a);
        else if (op.equals("/"))
        System.out.println(s/a);
    }
}

    