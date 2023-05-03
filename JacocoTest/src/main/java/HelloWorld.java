import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class HelloWorld {
    public static void helloWorld()
    {
        System.out.println("Hello work");
    }

    public static List<Integer> toDo()
    {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        return numbers;
    }

    public static List<String> doName()
    {
        List<String> name = new ArrayList<>();
        name.add("akash");
        name.add("payal");
        name.add("sabira");
        name.add("aditya");
        name.add("suresh");
        name.add("ramesh");
        return name;


    }


    public static void main(String[] args) {
        List<Integer> numbers = toDo();
        System.out.println(numbers);

        List<String> name=doName();
        System.out.println(name);

    }
}
