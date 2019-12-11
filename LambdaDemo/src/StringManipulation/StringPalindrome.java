package StringManipulation;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Scanner;

public class StringPalindrome {

    public static boolean isPalindrome(String input){

        int front = 0;
        int rare = input.length()-1;
        while (front < rare){
            if(input.charAt(front) != input.charAt(rare))
                return false;
                front++;
                rare--;

        }
        return true;
    }

    public static void main(String[] args) {

        String value = "1231";
        if(isPalindrome(value))
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");


    }

//    public static void main(String[] args) {
//
//        String actual;
//        String reverse = "";
//        Scanner input = new Scanner(System.in);
//        actual = input.nextLine();
//
//        for(int rare = actual.length()-1; rare>=0; rare--){
//
//            reverse = reverse + actual.charAt(rare);
//
//        }
//        //System.out.println(reverse);
//        if(actual.equalsIgnoreCase(reverse))
//            System.out.println("Palindrome");
//        else
//            System.out.println("Not a Palindrome");
//
//    }

    Integer a =123;
    String in = a.toString();

}
