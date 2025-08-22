package files.WeekendAlgorithmChallenge.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorAutoboxing {
    public static void main(String[] args) {
        List<Integer> figures = new ArrayList<>();
       for (int i = 1; i <= 20; i++) {
       figures.add(i);
       }

        ListIterator<Integer> iterator = figures.listIterator();
       while (iterator.hasNext()) {
           if (iterator.next() % 3 == 0) {
               iterator.remove();
           }
       }
        ListIterator<Integer> iterator2 = figures.listIterator();
       while (iterator2.hasNext()) {
           int value = iterator2.next();
           iterator2.set(value * value);
       }
        System.out.println(figures);
    }
}
