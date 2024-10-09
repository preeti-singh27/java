import java.util.*;

import java.util.Scanner;

// /**
//  * adi
//  */
// // primefactors
// public class adi {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         while (n%2==0){
//             System.out.print(2);
//             n/=2;
//         }
//         for(int i=3;i<=Math.sqrt(n);i+=2){
//             while(n%i==0){
//                 System.out.print(i);
//                 n/=i;
//             }
//         }
//         if(n>2){
//             System.out.println(n);
//         }

//     }
// }

// //highest comman factor
/**
 * adi
 */
// public class adi {

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n1 = sc.nextInt();
// int n2 = sc.nextInt();
// System.out.println(ans(n1, n2));
// }

// public static int ans(int n1, int n2) {
// if(n2==0){
// return n1;
// }
// return ans(n2, n1%n2);

// }
// }

// // bubble sort
// public class adi {

// public static void main(String[] args) {
// int arr[]={ 7 ,3 ,4 ,5 ,2 ,9 ,8 ,1};
// for(int i=0;i<arr.length-1;i++){
// for(int j=0;j<arr.length-i-1;j++){
// if(arr[j]>arr[j+1]){
// int temp=arr[j];
// arr[j]=arr[j+1];
// arr[j+1]=temp;
// }
// }
// }
// for(int i=0;i<arr.length;i++){
// System.out.print(arr[i]+" ");
// }
// }
// }

// //selection sort
// /**
// * adi
// */
// public class adi {

// public static void main(String[] args) {
// int arr[]={7,8,3,1,2};
// for(int i=0;i<arr.length-1;i++){
// for(int j=0;j<arr.length-1)
// }
// }
// }

// //basic ques fro bubble sort
// //descending order
// /**
// * adi
// */
// public class adi {

// public static void main(String[] args) {
// int arr[]={64,34,25,12,22,11,90};
// for(int i=0;i<arr.length-1;i++){
// for(int j=0;j<arr.length-i-1;j++){
// if(arr[j+1]>arr[j]){
// int temp=arr[j];
// arr[j]=arr[j+1];
// arr[j+1]=temp;
// }
// }
// }
// for(int i=0;i<arr.length;i++){
// System.out.print(arr[i]+" ");
// }
// }
// }

// // count swaps in BS

// public class adi {

//     public static void main(String[] args) {
//         int arr[] = { 5,1,4,2,8};
//         int count =0;
//         for (int i = 0; i < arr.length - 1; i++) {
//             for (int j = 0; j < arr.length - i - 1; j++) {
//                 if (arr[j] > arr[j+1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                     count++;
//                 }
//             }
//         }

//             System.out.print(count);

//     }

// }



// // partially sorted or stop when array is sorted
// /**
//  * adi
//  */
// public class adi {

//     public static void main(String[] args) {
//         int arr[] = { 1, 2, 3, 5, 4, 6, 7, 8 };
//         boolean swap;
//         for (int i = 0; i < arr.length - 1; i++) {
//             swap = false;
//             for (int j = 0; j < arr.length - i - 1; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;

//                     swap = true;
//                 }
//             }
//             if (!swap) {
//                 break;
//             }
//             System.out.print(arr[i]);
//         }

//     }
// }



// //selection sort
// /**
//  * adi
//  */
// public class adi {
//     public static void main(String[] args) {
//         int a[]={-31, 22, -1, 50, -6, 4};
//         for(int i=0;i<a.length-1;i++){
//             int sm=i;
//             for(int j=i+1;j<a.length;j++){
//                 if(a[sm]>a[j]){
//                     sm=j;
//                 }
                
//             }
//             int temp=a[sm];
//             a[sm]=a[i];
//             a[i]=temp;
//         }
//         for(int i=0;i<a.length;i++){
//             System.out.print(a[i]+" ");
//         }
//     }
// }




// //insertion sort
// /**
//  * adi
//  */
// public class adi {

//     public static void main(String[] args) {
//         int[]a={7,8,3,1,2};
//         for(int i=1;i<a.length;i++){
//         int current = a[i];
//         int j=i-1;
//         while(j>=0 && current<a[j]){
//             a[j+1] = a[j];
//             j--;
//         }
//         a[j+1]=current;
//     }
//     for(int i=0;i<a.length;i++){
//         System.out.print(a[i]);
//     }
//     }
// }




// //linear search
// /**
//  * adi
//  */
// public class adi {

//     public static void main(String[] args) {
//         int a[]={2,3,4,10,40};
//         int x=10;
//         for(int i=0;i<a.length;i++){
//             if(a[i]==x){
//                 System.out.println(i);
//             }
//         }
//     }
// }




/**
 * adi
 */
// public class adi {
// public static void comb(String s, int flips, int c, int k){
//     if(flips==0){
//         System.out.println(s);
//         return;
//     }

//     comb(s+"H", flips-1, c+1, k);
//     comb(s+"T", flips-1, c=0, k);

// }
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     int flips=sc.nextInt();
//      comb(" ", flips, c, k);
// }
// }



/**
 * adi
 */
// public class adi {

//     public static void coin(int a[], int tar, String str) {
//         if(tar==0){
//             System.out.println(str);
//             return;
//         }

//         for(int i=0;i<a.length;i++){
//             if(a[i]<=tar){
//                 coin(a, tar-a[i], str+" "+a[i]);;
//             }
//             else
//             break;
//         }
        
//     }


//    public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();
// int[] a=new int[n];

// for(int i=0;i<n;i++){
//     a[i]=sc.nextInt();
// }

// int tar=sc.nextInt();
// coin(a,tar,"");
// }
// }



/**
 * adi
 */public class adi {

    public static String remove(String s){
        if(s.length() <=1 ){
            return s;

        }
        if(s.charAt(0) == s.charAt(1)){
            return remove(s.substring(1));
        }else{
           return s.charAt(0) + remove(s.substring(1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        System.out.print(remove(s));
    
    }
 
}