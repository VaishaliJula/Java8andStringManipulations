package StringManipulation;

import java.util.List;

public class RemoveDups {

    public static void main(String[] args) {

        String input = "Lover";
        input = input.toLowerCase();
        StringBuilder truncated = new StringBuilder();
        char ch = 'r';
        //convert to chars
        char[] charSequence = input.toCharArray();
        for(char item : charSequence){

            if(item != ch){
                truncated.append(item);

            }

        }
        System.out.println(truncated);

    }
}
