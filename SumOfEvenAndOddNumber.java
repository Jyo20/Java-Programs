/**
 * SumOfEvenAndOddNumber
 * Write a java program to print sum of even and odd number by taking user input
 */
import java.util.*;
public class SumOfEvenAndOddNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Element ");
        int N=sc.nextInt();
        int SumofEven=0;
        int SumofOdd=0;
        for(int i=1;i<=N;i++){
            if(i%2==0){
                SumofEven+=i;
                System.out.println(i+" ");
            }else{
                SumofOdd+=i;
            }
        }
        System.out.println("Even Number "+SumofEven);
        System.out.println("Odd Number "+SumofOdd);
        System.out.println("Addition of Sum and Even Number is : "+(SumofEven+SumofOdd));
    }
    
}