import java.util.*;
public class Simple{
    public static void main(String args[]){
        Scanner scan = new Scanner (System.in);
        System.out.println("enter the number from 1 to 7");
        int n = scan.nextInt();
        switch (n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednessday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("please enter the number from range 1 to 7");

        }

    }

}