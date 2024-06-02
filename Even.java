/** Wtite a java Program to print even number by taking user input */
import java.util.*;
class Even{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the Number : ");
    int N=sc.nextInt();
    for(int i=0;i<=N;i++){
      if(i%2==0){
        System.out.println(i);
      }
    }
  }
}
