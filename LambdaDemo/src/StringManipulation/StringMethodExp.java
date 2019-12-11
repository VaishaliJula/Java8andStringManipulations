package StringManipulation;

public class StringMethodExp {

    public static void main(String[] vaish){

        //Substring and split
        //add string of numbers
//        int sum= 0;
//        String s1 = "Vaish";
//        String s2 = "Shal";
//        String withSpace = "    Hey with Space  ";
//        String input1 ="10,Vaishali,12,13";
//        System.out.println("First IndexOf i::"+input1.indexOf("Vaishali")+" Last Index of i::"+ input1.lastIndexOf("i"));
//        String removed = input1.substring(0, 3) + input1.substring(12);
//        System.out.println(removed);
//        String[] res = removed.split(",");
//        for (int i=0; i<=res.length-1; i++){
//             sum = sum + Integer.parseInt(res[i]);
////            System.out.print(res[i]);
//        }
//        System.out.println("Sum::"+sum);
//        //trim just removes leading and trailing spaces
//        System.out.println("Trim::"+withSpace.trim());
//        //returns num of similar
//        System.out.println(s1.compareTo(s2));

        String name1 = "Vaishali";
        String name2 = "Vamshi";
        String name3 = "Vaishali";
        String name4 = new String("Vaishali");
        String name5 = new String("Vamshi");
        String name6 = new String("vaishali");

        System.out.println(name1.equalsIgnoreCase(name4));
        System.out.println(name1 == name3); //true
        System.out.println(name1.equalsIgnoreCase(name3)); //true
        System.out.println(name1 == name3); //no new  so true
        System.out.println(name1 == name4); //different addr false
        System.out.println(name4 == name6); //different addr false
        System.out.println(name5 == name6); //different addr false
        System.out.println(name4.equals(name6)); //false
        System.out.println(name4.equalsIgnoreCase(name6)); //true
        System.out.println(name5.equals(name6)); //false
    }
}
