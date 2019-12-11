import com.vaish.java8.examples.FuncInterfaceExample;

public class Main {

    public static void main(String[] args) {
        FuncInterfaceExample fe = (x, y) -> System.out.println(x+"\tloves\t"+y);
        fe.merge("Vaishu","Shalu");
    }
}
