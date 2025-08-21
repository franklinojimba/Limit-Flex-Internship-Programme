package files.WeekendAlgorithm.OOPAlgorithm.LambdaPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StringSorter implements DefInterface {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("Berries","Watermelon","Apples"));
        list.sort(String::compareTo);
        System.out.println(list);

        List<String> list2 = new ArrayList<>(List.of("Cake","Tree","Vine"));
        List<String> list3 = list2.stream().filter(s -> s.length()>3).collect(Collectors.toList());
        System.out.println(list3);

        List<Integer> list4 = new ArrayList<>(List.of(2,5,6,9));
        list4.stream().map(s -> s * s).forEach(System.out::println);
        System.out.println(list4);

        List<Integer> list5 = new ArrayList<>(List.of(10,53,60,90));
        int sum = list5.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        Calculator adder = Integer::sum;
        Calculator multiplier = (a,b) -> a*b;

        adder.calculate(2,4);
        multiplier.calculate(3,7);

        Predicate<String> contains = s -> s.startsWith("A");
        System.out.println(contains);

        System.out.println(contains.test("Berries"));
        System.out.println(contains.test("Alberdeen"));

        Consumer<Integer>  numberSquare = (num) -> System.out.println(num * num);
        numberSquare.accept(2);

        Supplier<String> supplier = () -> "Random Quote";
        System.out.println(supplier.get());

        StringSorter sorter = new StringSorter();
        System.out.println(sorter.modify(3,4));

        List<String> names = new ArrayList<>(Arrays.asList("ring", "dye", "red"));
        List<String> toUpper = names.stream().map(String::toUpperCase).toList();
        System.out.println(toUpper);

    }
}
