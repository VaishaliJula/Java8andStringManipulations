package StringManipulation;

import java.util.*;

public class PrintDuplicateCaracters {

    public static void main(String[] args) {

        //Java
        //Vaishali
        String input = "Babyyyyy";
        input = input.toLowerCase();
        Map<Character, Integer> map = new HashMap<>();
        char[] charSequence = input.toCharArray();
        for(int i=0 ; i< charSequence.length; i++){
            if(map.containsKey(charSequence[i])){
                map.put(charSequence[i],map.get(charSequence[i])+1);

            }else
                map.put(charSequence[i],1);

        }
        System.out.println(map);
        Optional<Map.Entry<Character, Integer>> max = map.entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue));
        System.out.println(max.get().getKey());

    }


}
