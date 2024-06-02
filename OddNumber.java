/**
 * OddNumber
 * Write a java program to print odd number by taking user input
 */
import java.util.*;
public class OddNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number");
        int N=sc.nextInt();
        for(int i=1;i<=N;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        } 
    }

}