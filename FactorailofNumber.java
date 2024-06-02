/**
 * FactorailofNumber
 * Write a java program to print Factorial of a number
 * Number =5
 * factorail of 5 is  5!= 5*4*3*2*1 =>120
 */
public class FactorailofNumber {
    public static void main(String[] args) {
        int number = 5;
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact = fact * i;
            System.out.print(i+" ");
        }
        System.out.print("Factorial of " + number + " are " + fact);
    }

}


//Write a java program to print Factorial of a number by taking user input
/**
 * InnerFactorailofNumber
 */
import java.util.*;

public class InnerFactorailofNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number ");
        int number =sc.nextInt();
        int fact=1;
        for(int i=1;i<=number;i++){
            fact=fact*i;
            System.out.print(i+" ");
        }
        System.out.println("Factorail of"+number+" are"+fact);
    }
}