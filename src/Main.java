import java.io.PrintStream;
import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {


        StreamMain st = new StreamMain();
        st.number();

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(5);
        numbers.add(16);
        numbers.add(-1);
        numbers.add(-2);
        numbers.add(0);
        numbers.add(32);
        numbers.add(3);
        numbers.add(5);
        numbers.add(8);
        numbers.add(23);
        numbers.add(4);
        Collections.sort(numbers);
        for (int n : numbers) {
            if (n > 0 && n % 2 == 0) {
                System.out.print(n + " ");
            }

        }
        System.out.println();


    }
}