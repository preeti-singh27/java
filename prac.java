import java.util.*; 
  
import java.util.Scanner;

public class prac {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while (n%2==0){
            System.out.print(2);
            n/=2;
        }
        for(int i=3;i<=Math.sqrt(n);i+=2){
            while(n%i==0){
                System.out.print(i);
                n/=i;
            }
        }


    }
}
