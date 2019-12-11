package StringManipulation;

import java.util.*;

public class EgenTest {

    public static void main(String[] args) {

        //Reverse
//        StringBuilder reversedString = new StringBuilder();
//        String reverse = "";
//        Scanner sc = new Scanner(System.in);
//        String inputValue = sc.nextLine();
//        char[] characterSequence = inputValue.toCharArray();
//        for(int i=characterSequence.length-1 ; i>=0; i--){
//            System.out.print(characterSequence[i]);
//            reversedString.append(characterSequence[i]);
//            reverse = reverse + characterSequence[i];
//        }
//        if(inputValue.equalsIgnoreCase(reverse))
//            System.out.println("\t is Palindrome");
//        else
//            System.out.println("\tNot a Palindrome");



        //------------------------------------------------------------------
        //Anagram
        Set<Character> set1 = new TreeSet<>();
        Set<Character> set2 = new TreeSet<>();
        String string1 = "1235";
        string1 = string1.toLowerCase();
        String string2 = "3214";
        string2  = string2.toLowerCase();

        char[] charseq1 = string1.toCharArray();
        char[] charseq2 = string2.toCharArray();

        if(!(string1.length() == string2.length()))
            System.out.println("Cannot be compared");
        for (char item1: charseq1) {
            set1.add(item1);
        }
        for (char item2 :
                charseq2) {
            set2.add(item2);
        }
        if(set1.equals(set2))
            System.out.println("Anagrams");
        else
            System.out.println("Not Anagrams");



        //--------------------------------------------------
        //Vowel counter
        String input = "EgenSol";
        char[] inputChar = input.toCharArray();
        int count = 0;

        for(char c : inputChar){
            switch (c){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    ++count;
                    break;
            }
        }
        System.out.println("4)No of Vowels::"+count);

        //Duplicate characters
        String val = "ududddddp";
        Map<Character, Integer> map = new TreeMap<>();
        char[] valChar = val.toCharArray();
        for (char c: valChar) {
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);

            }else
                map.put(c,1);
        }
        System.out.println("Duplicates"+map);

        //Add elements of a String
        int sum = 0;
        String value = "10,20,20";
        String[] arr = value.split(",");
        for(int i=0 ; i< arr.length; i++){
            sum = sum + Integer.parseInt(arr[i]);
        }
        System.out.println("sum\t"+sum);

    }




}
