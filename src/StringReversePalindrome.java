import java.util.Scanner;

public class StringReversePalindrome {

    public static void main(String[] args){
        System.out.println("Enter the input String you want to reverse:");
        String inputString ;
        Scanner scanner = new Scanner(System.in);
        inputString = scanner.next();

        String reverseString="";

        for(int i=inputString.length()-1; i>=0; i--){
            reverseString=reverseString+inputString.charAt(i);
        }
        System.out.println("Your input is: "+inputString);
        System.out.println("Reversed String is: "+reverseString);

        if(reverseString.equals(inputString)){
            System.out.println("Your input is a palindrome!");
        }
        else
            System.out.println("Your input is not a palindrome!");

    }
}
