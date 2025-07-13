import java.util.*;
public class Grade{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your marks :");
        int n = scan.nextInt();
        if (n>=90 && n<=100)
        System.out.println("your grade is : A");
        else if(n>=70 && n<=89)
        System.out.println("your grade is : B");
        else if (n>=50 && n<=69)
        System.out.println("your grade is : c");
        else if (n >= 0 && n < 50)
        System.out.println("you Failed in  the Exam ");
        else
            System.out.println("Invalid marks entered. Please enter between 0 and 100.");
    }
}