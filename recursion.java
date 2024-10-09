import java.util.*;  
import java.util.Scanner;

// // print 5 to 1

// public class recursion {
//     public static void main(String[]args){
//         int n =5;
//         printnum(n);
//     }
//     public static void printnum(int n) {
//         if(n==0)
//         return;
//         System.out.println(n);
//         printnum(n-1);
//     }
// }


//print sum of first n natural numberss
/**
 * recursion
 */
// public class recursion {

//     public static void main(String[] args) {
//         printsum(5, 0, 1);
//     }
//     public static void printsum(int n, int sum, int i){
//         if(n==i){
//         sum+=i;
//         System.out.println(sum);
//         return ;
//     }
//     sum+=i;
//         printsum(n, sum, i+1);
        
//     }
// }



// factorial of n numbers
/**
 * recursion
 */
// public class recursion {

//     public static void main(String[] args) {
//         int n=5;
//         System.out.println(fac(n));
//     }
//     public static int fac(int n){
//         if(n==1 || n==0){
//             return 1;
//         }
//         int c=fac(n-1);
//         int ans=n*c;
//         return ans;
//     }
// }


// print fabonacci series till nth term
/**
 * recursion
 */
// public class recursion {

//     public static void main(String[] args) {
//         int a=0;
//         int b=1;
//         System.out.println(a);
//         System.out.println(b);
//         int n=7;
//         fib(n-2, a, b);

//     }
//     public static void fib(int n, int a,int b){
//         if(n==0){
//             return;
//         }
//         int c=a+b;
//         System.out.println(c);
//         fib(n-1, b, c);
//     }
// }


