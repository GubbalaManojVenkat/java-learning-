import java.util.*;
public class vowel{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the single character");
        char ch = scan.next().charAt(0);
        if(ch=='a'|| ch =='e'|| ch =='i' || ch =='o' || ch =='u')
        System.out.println("the character was vowel");
        else if(ch!='a'|| ch !='e'|| ch !='i' || ch !='o' || ch !='u')
        System.out.println("the character is consonant");
        else
        System.out.println("enyter the valid character");
    }
}