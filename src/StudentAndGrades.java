import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class StudentAndGrades {

    public static void main(String[] args){

        int numberOfStudents,number,sum=0,avg,max,min;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of Students:");
        numberOfStudents = scanner.nextInt();
        number = numberOfStudents;
        int[] grades;
        grades = new int[numberOfStudents];

        while (number!=0) {
            for (int i = 0; i < numberOfStudents; i++) {
                System.out.println("Enter the grade for student"+(i+1));
                grades[i]=scanner.nextInt();
                number--;
            }
        }

        for(int i=0;i<numberOfStudents;i++){
            sum+=grades[i];
        }
        avg=sum/numberOfStudents;

        System.out.println("The average is: "+avg);

        System.out.println("The maximum is: "+getMax(grades));

        System.out.println("The minimum is: "+getMin(grades));

    }

    public static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
}
