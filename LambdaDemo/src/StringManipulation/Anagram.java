package StringManipulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Anagram {

    public static void main(String[] args) {

        //Mary
        //Army
        String input1 = "mary";
        String input2 = "arry";

        char[] input1charseq = input1.toCharArray();
        char[] inpu2charseq = input2.toCharArray();
        Set<Character> s1 = new TreeSet<>();
        Set<Character> s2 = new TreeSet<>();

        if(!(input1.length() == input2.length())){

            System.out.println("Not Anangrams");
        }
        for (char c1 : input1charseq){
            s1.add(c1);
        }
        for(char c2 : inpu2charseq ){
            s2.add(c2);
        }

        System.out.println(s1.equals(s2));
    }

}
