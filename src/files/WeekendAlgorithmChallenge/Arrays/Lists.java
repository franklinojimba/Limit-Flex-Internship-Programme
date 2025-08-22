package files.WeekendAlgorithmChallenge.Arrays;

import java.util.*;
class PrivateWrapperMix{
    private final List<Integer> numbers = new ArrayList<>();
    public void add(Integer number){
        numbers.add(number);
    }
    public List<Integer> getNumber(){
        return numbers;
    }
}
public class Lists {
    public static void sumList(List<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
    }
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        PrivateWrapperMix pwm = new PrivateWrapperMix();
        pwm.add(1);
        pwm.add(2);

        sumList(new ArrayList<>(List.of(1,2,3,4,5)));

        List<Integer> digits = new ArrayList<>(List.of(5,2,9,1,3));
        digits.sort(Integer::compareTo);
        System.out.println("Sorted Array: " + digits);
        System.out.println();
        digits.sort(Collections.reverseOrder());
        System.out.println("reversed Array: " + digits);
        System.out.println();

        Integer[] numbers = new Integer[10];
        int num = 0;
        while (num < numbers.length) {
            numbers[num] = num;
            num++;
        }
        System.out.println();


        List<Integer> digits2 = new ArrayList<>(Arrays.asList(numbers));
        ListIterator<Integer> iterator = digits2.listIterator();

        while (iterator.hasNext()) {
            if (iterator.next() % 2 == 0) {
                iterator.remove();
            }
            System.out.println(iterator.next());
        }

        List<String> stringList = new ArrayList<>(List.of("Amaka", "Charity", "Comfort", "Peace", "Jane"));
        ListIterator<String> iterator2 = stringList.listIterator(stringList.size());
        while (iterator2.hasPrevious()) {
            System.out.println(iterator2.previous());
        }
        System.out.println();

        List<String> stringList2 = new ArrayList<>(List.of("Aberdeen", "ALjesh", "Jamal", "Alzir", "Tetrum"));
        Iterator<String> iterator3 = stringList2.iterator();
        while (iterator3.hasNext()) {
            String name = iterator3.next();
            if (name.startsWith("A")){
                iterator3.remove();
            }
        }
        System.out.println(stringList2);
    }
}
