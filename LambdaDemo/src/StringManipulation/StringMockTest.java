package StringManipulation;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMockTest {

    public static void main(String[] args) {

        //Question 1:::Reverse a String
        Integer a = 121;
        String actual = a.toString();
        //StringBuilder
        String reverse = "";
        StringBuilder stringBuilder = new StringBuilder();
        char[] charSeq = actual.toCharArray();
        for(int rare=charSeq.length -1; rare>=0; rare--){
            stringBuilder.append(charSeq[rare]);
            reverse = reverse + charSeq[rare];

        }
//        System.out.println("StringBuilder::"+stringBuilder);
        System.out.println("1)Reverse::"+reverse);


        //Question 2:::
        //Palindrome
        if(actual.equalsIgnoreCase(reverse) ){
            System.out.println("2)Palindrome");
        }else{
            System.out.println("2)Not a Palindrome");
        }


        //Question 3:::
        //Anagram
        String s1 = "Mary";
        s1 = s1.toLowerCase();
        String s2 = "Army";
        s2 = s2.toLowerCase();

        char[] charSeqs1 = s1.toCharArray();
        char[] charSeqs2 = s2.toCharArray();

        Set<Character> set1 = new TreeSet<>();
        Set<Character> set2 = new TreeSet<>();

        if(!(s1.length() == s2.length())){
            System.out.println("3)Can't be compared::Unequal length");
        }
        for(char item1 : charSeqs1)
            set1.add(item1);

        for(char item2 : charSeqs2)
            set2.add(item2);

        System.out.println("3)"+set1.equals(set2));


        //Question :: 4
        //Vowel Counter
        String value = "EgenSol";
        int counter = 0;
        char[] charVal = value.toCharArray();
        for(char c : charVal){

            switch (c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                counter++;
                break;

            }

        }
        System.out.println("4)No of Vowels::"+counter);


        //Question ::4 Find the Duplicates
        String name = "Peopppty";
        name = name.toLowerCase();
        char[] nameChar = name.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for(char c : nameChar){
            //If map doesn't contain the key/value initially
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else
                map.put(c,1); //if map deon't contain key put character as key and count as 1.
        }
        System.out.println("5)Duplicates::"+map);

        Optional<Map.Entry<Character, Integer>> max = map.entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue));
        Optional<Map.Entry<Character, Integer>> min = map.entrySet().stream()
                .min(Comparator.comparing(Map.Entry::getValue));
        System.out.println("6)Max Value in the set ::"+max+"Min Value::"+min);

        Optional<Map.Entry<Character, Integer>> optional = map.entrySet().stream().max(Comparator.comparing(Map.Entry::getValue));



        //Question::7
        //Add digits in a String
        String input = "10,23,12,45";
        int sum = 0;
        String[] splitValue = input.split(",");
        for(int i=0; i<splitValue.length;i++){
            sum = sum + Integer.parseInt(splitValue[i]);
        }
        System.out.println("7)Sum of all digits::"+sum);

        //Question::8
        //Find the digits in a String:: Regex

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher("16256ghsad");
        if(matcher.find())
            System.out.println("8)Digits are::"+matcher.group());


    }




}
