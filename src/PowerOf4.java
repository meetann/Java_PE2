import java.util.Scanner;

public class PowerOf4 {
    public static void main(String[] args) {
        int inputNumber,testNumber = 0;
        int flag=0;
        System.out.println("Enter input to check power of 4: ");
        Scanner scanner = new Scanner(System.in);
        testNumber = scanner.nextInt();
        inputNumber=testNumber;
        if(testNumber==1){
            System.out.println(testNumber+" is a power of 4!");
        }
        else if(testNumber==0){
            System.out.println(testNumber+" is not a power of 4!");
        }
        else
        {
            while(testNumber!=1)
            {
                if(testNumber%4 == 0){
                    testNumber=testNumber/4;
                    flag=1;
                }
                else {
                    flag = 0;
                    break;
                }
            }
            if (flag==1){
                System.out.println(inputNumber+ " is a power of 4.");
            }
            else
                System.out.println(inputNumber+" is not a power of 4!");
        }


    }
}
