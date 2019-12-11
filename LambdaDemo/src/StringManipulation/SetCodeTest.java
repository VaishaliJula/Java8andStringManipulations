package StringManipulation;


import java.util.HashMap;
import java.util.Map;

public class SetCodeTest {

    String array[] = new String[3];

    public void addElements(String s){

        Map<String, Integer> map = new HashMap<>();
        //check if element is present and add only then
        for(int i=0; i<array.length; i++){
            if(array[i].equalsIgnoreCase(s)){
                //add element
                map.put(s, map.get(s)+1);
                System.out.println("Element already exists::"+array[i]);


            }else{
                map.put(s, 1);
            }

        }
    }

    public String getElement(int index){

        return array[index];
    }
    public static void main(String[] args) {

        SetCodeTest s = new SetCodeTest();
        s.addElements("Vaishali");
        s.addElements("Shalini");
        s.addElements("Aditya");
        s.addElements("Vaishali");

        System.out.println(s.getElement(0));



    }
}
