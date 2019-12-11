package StringManipulation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class StringReverse {


    public static void main(String[] args){

        String input = "Vaishali is a good girl";
        StringBuilder  toBeReversed = new StringBuilder();
        toBeReversed.append(input);
        toBeReversed = toBeReversed.reverse();
        System.out.println(toBeReversed);

        String input1 = "Hey Shalini";
        char[] charSequences = input1.toCharArray();

        for(int i=charSequences.length-1; i>=0 ; i--){
            System.out.print(charSequences[i]);
        }

        //declare a string to be reversed
        String value = " Perfecient Code test";
        //Convert to characters
        char[] charSequence = value.toCharArray();
        //Create an arraylist
        List<Character> characterList = new ArrayList<>();

        //add each item of the characterSequence to the arraylist
        for(char item: charSequence)
            characterList.add(item);
        //Reverse the List
        Collections.reverse(characterList);

        //Traverse the list
        ListIterator listIterator = characterList.listIterator();
        while (listIterator.hasNext())
            System.out.print(listIterator.next());

    }


}
