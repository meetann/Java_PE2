import java.util.Scanner;

public class EvenNumTest {

    public static void main(String[] args){
        System.out.println("Enter your input: ");
        Scanner scanner = new Scanner(System.in);
        int input;
        input = scanner.nextInt();
        if(isEven(input)==true){
            System.out.println(input+": Even");
        }
        else
            System.out.println(input+": Not even");

    }

    public static boolean isEven(int number){
        if(number%2==0){
            return true;
        }
        else return false;

    }
}
