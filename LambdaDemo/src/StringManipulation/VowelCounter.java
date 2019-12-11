package StringManipulation;

public class VowelCounter {

    public static void main(String[] args) {

        String input = "Queue";
        int counter = 0;
        char[] charSeuquence = input.toCharArray();
        for (char item : charSeuquence) {
            switch (item) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                counter++;
                break;
            default:
                System.out.println("Hey");
            }
        }
        System.out.println(counter);
    }
}
