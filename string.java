import java.util.*;

// // input string and output

// public class string {
//      public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String name=sc.nextLine();
//         System.out.println("enter your name" + " " + name);

//      }
// }

// // concatenation (add)
// public class string{
//     public static void main(String[] args) {
//         String fname = "preeti";
//         String lname = "singh";
//         String full = fname +" "+ lname;
//         System.out.println(full);
//     }
// }

// // calculate length
// public class string{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String sen = sc.nextLine();
//         System.out.println(sen.length());
//     }
// }

// // print every character
// public class string{
//     public static void main(String[] args) {
//         String name = "preeti singh";
//         for(int i=0; i<name.length(); i++){
//             System.out.println(name.charAt(i));
//         }
//     }
// }

// // compare two string
// //s1>s2  +ve
// //s1=s2  0
// //s1<s2  -ve

// public class string{
//     public static void main(String[] args) {
//         String first = "wow preet";
//         String second = "wow preet";
//         if(first.compareTo(second)==0){
//             System.out.println("equal");
//         }
//         else{
//             System.out.println("not equal");
//         }
//     }
// }

// // substring

// public class string{
//     public static void main(String[] args) {
//         String sen = "my name is preeti";
//         String subs = sen.substring(11, sen.length());
//         System.out.println(subs);
//     }
// }

// //parseInt

// public class string {
//    public static void main(String args[]) {
//        String str = "123";
//        int number = Integer.parseInt(str);
//        System.out.println(number);

//    }
// }

// // array input and find length

// class string{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         String arr[]= new String[size];
//         int tlengthh = 0;
//         for(int i=0; i<size; i++){
//             arr[i]=sc.next();
//             tlengthh += arr[i].length();
//          }
//          System.out.println(tlengthh);
//     }
// }

// // string builder / find character at index / change the character

// class string{
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("preeti");
//         System.out.println(sb);
//         System.out.println(sb.charAt(4));
//         sb.setCharAt(5, 'y');
//         System.out.println(sb);
//     }
// }

// //add charater in string

// class string{
//     public static void main(String[] args) {
//         StringBuilder sb= new StringBuilder("preeti");
//         System.out.println(sb);
//         sb.insert(6, 'e');
//         System.out.println(sb);
//     }
//}

// // delete character

// class string{
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("watermelon");
//         sb.delete(3, 5);
//         System.out.println(sb);
//     }
// }

// // append (last mein add krna) and find length of string

// class string{
//     public static void main(String[] args) {
//         StringBuilder sb = new StringBuilder("a");
//         sb.append("p");
//         sb.append("p");
//         sb.append("l");
//         sb.append("e");
//         sb.append("s");
//         System.out.println(sb);
//         System.out.println(sb.length());
//     }
// }

// //reverse a string

// class string{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str="name";
//         for(int i=str.length()-1; i>=0; i--){
//             System.out.print(str.charAt(i));
//         }
//     }
// }

// reverse using stringbuilder

public class string {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("name");
        for (int i = 0; i < str.length() / 2; i++) {
            int front = i;
            int back = str.length() - 1 - i;

            char fc = str.charAt(front);
            char bc = str.charAt(back);

            str.setCharAt(front, bc);
            str.setCharAt(back, fc);
        }
        System.out.println(str);
    }
}


