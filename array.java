import java.util.Scanner;
import java.util.*;

// public class array {
//     public static void main(String[] args) {
//     // int[] marks = new int[3] ;

//     int[] marks={45,34,56};
//     // marks[0]=45;
//     // marks[1]=34;
//     // marks[2]=56;
//     for(int i=0;i<3;i++){
//         System.out.println(marks[i]);
//     }
// }
// }

// //take size as input and elements as input
// class array{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size=sc.nextInt();
//         int num[]=new int[size];
//         for(int i=0; i<size; i++){
//             num[i] = sc.nextInt();
//         }
//         for(int i=0; i<size; i++){
//             System.out.println(num[i]);
//         }

//     }
// }

// //print names
// class array{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size=sc.nextInt();
//         String name[]=new String[size]; 
//         for(int i=0; i<size; i++){
//             name[i]=sc.next();
//         }
//         for(int i=0; i<size; i++){
//         System.out.println(name[i]);
//         }
//     }
// }

// // find min and max no.
// class array{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size=sc.nextInt();
//         int num[]=new int[size];
//         for(int i=0; i<size; i++){
//             num[i]=sc.nextInt();
//         }
//         int max=Integer.MIN_VALUE;
//         int min=Integer.MAX_VALUE;
//         for(int i=0; i<num.length; i++){
//             if(num[i]<min){
//                 min=num[i];
//             }
//             if(num[i]>max){
//                 max=num[i];
//             }
//         }
//         System.out.println(max);
//         System.out.println(min);
//     }
// }

// // ascending order sorting
// class array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int num[] = new int[size];
//         for (int i = 0; i < size; i++) {
//             num[i] = sc.nextInt();
//         }
//         boolean ass = true;
//         for (int i = 0; i < size-1; i++) {
//             if (num[i] > num[i + 1]) {
//                 ass = false;
//             }
//         }
//         if (ass) {
//             System.out.println("sorted");
//         } else {
//             System.out.println("not sorted");
//         }
//     }
// }

// //find x in 2d array
// class array {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int r = sc.nextInt();
//         int c = sc.nextInt();
//         int num[][] = new int[r][c];
//         for (int i = 0; i < r; i++) {
//             for (int j = 0; j < c; j++) {
//                 num[i][j] = sc.nextInt();
//             }
//         }
//         int x = sc.nextInt();
//         for (int i = 0; i < r; i++) {
//             for (int j = 0; j < c; j++) {
//                 if (num[i][j] == x) {
//                     System.out.println(i+","+j);
//                 }

//             }
//         }
//     }
// }

// //transpose of 2d matrix
// class array{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int r = sc.nextInt();
//         int c = sc.nextInt();

//         int matrix[][]= new int[r][c];

//         for(int i=0; i<r; i++){
//             for(int j=0; j<c; j++){
//                 matrix[i][j]=sc.nextInt();
//             }
//         }

//         for(int j=0; j<c; j++){
//             for(int i = 0; i<r; i++){
//                 System.out.print(matrix[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }

//DOUBT
// //spiral order matrix

//2-d array

// public class array {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int r=sc.nextInt();
//         int c=sc.nextInt();

//         int[][] num = new int[r][c];
//         for(int i=0; i<r; i++){
//             for(int j=0; j<c; j++){
//                 num[i][j]=sc.nextInt();
//             }
//         }

//         for(int i=0; i<r; i++){
//             for(int j=0; j<c; j++){
//                 System.out.print(num[i][j] +" ");
//             }
//             System.out.println();
//         }
//     }
// }

//find a

// public class array {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int r = sc.nextInt();
//         int c = sc.nextInt();

//         int arr[][]=new int[r][c];
//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 arr[i][j]=sc.nextInt();
//             }
//         }

//         int a = sc.nextInt();

//         for(int i=0;i<r;i++){
//             for(int j=0;j<c;j++){
//                 if(arr[i][j] == a){
//                     System.out.println(i +" " + j);
//                 }
//             }
//         }

//     }
// }

//spiral traverse
public class array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int rs;
        int cs;
        for(int i = 0; i<r; i++){
            System.out.print(arr[i]+" ");
        }
    }
}