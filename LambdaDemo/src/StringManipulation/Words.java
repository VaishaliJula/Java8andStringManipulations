package StringManipulation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Words {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String senetense = scanner.nextLine();
        String[] wordArray = senetense.split(" ");
        System.out.println(wordArray.length);
        Map<String, Integer> map = new HashMap<>();
        for (String s: wordArray) {
            if(map.containsKey(s.toLowerCase())){
                map.put(s.toLowerCase(), map.get(s.toLowerCase())+1);

            }else
                map.put(s.toLowerCase(), 1);

        }
        System.out.println(map);

    }

    //------------------------------
}
