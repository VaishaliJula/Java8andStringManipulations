import java.util.ArrayList;

public class StreamOperations {
    public static void main(String[] args) {

        ArrayList<String> collectionArrayList =new ArrayList<>();
        collectionArrayList.add("Vaishu");
        collectionArrayList.add("Vai");
        collectionArrayList.add("Vishal");
        collectionArrayList.add("Shalu");
        System.out.println(collectionArrayList);
        collectionArrayList.stream().filter(item -> item.startsWith("V")).map(String::toUpperCase).sorted().forEach(System.out::println);

        collectionArrayList.parallelStream().filter(item1 -> item1.contains("sh")).map(String::toLowerCase).sorted().forEach(System.out::println);
    }
}
