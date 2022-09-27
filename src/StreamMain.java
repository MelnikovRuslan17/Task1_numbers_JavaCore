import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class StreamMain {


    List<Integer> inList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

    Stream<Integer> stream = inList.stream();

    public void number() {

        stream.filter(x -> x > 0)
                .sorted(Comparator.naturalOrder())
                .filter(x -> x % 2 == 0)
                .map(x -> x + " ")
                .forEach(System.out::print);
        System.out.println();

    }
}















