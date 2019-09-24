import java.io.*;
import java.util.Scanner;

class Factorial{
    public static void main(String[] args){
        int n=1;
        long fact=1;
        while(fact<Integer.MAX_VALUE){
            fact=fact*n;
            if(fact>Integer.MAX_VALUE){
                break;
            }
            System.out.println("The factorial of"+ " " + n + "is" + " "+fact);
            n=n+1;
        }
        System.out.println("The factorial of" +" " + n + "is out of range");
    }
}