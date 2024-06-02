/**
 * FactorsNumber
 * Write a java program to print factors of given number using taking user input
 * Output
 * Factors of 60 are: 1 2 3 4 5 6 10 12 15 20 30 60
 */
import java.util.*;
public class FactorsNumber {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number : " );
       
        int N=sc.nextInt();
        System.out.print("Factors of "+ N +" are : ");
        //Iterate Number from 1 to 60 
        for(int i=1;i<N;i++){
            //If Number is divided by i and return 0 then i is factor of that number
            if(N%i==0){
                System.out.print(i+" ");
            }
        }
    }
    
}