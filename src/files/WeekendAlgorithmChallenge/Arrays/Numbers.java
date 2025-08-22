package files.WeekendAlgorithmChallenge.Arrays;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
    public static void main(String[] args) {
        ArrayList<Integer> myNumber = new ArrayList<>(List.of(1,2,3,4,5));
        System.out.println("Current Array: " + myNumber);
        myNumber.add(2, 99);
        myNumber.set(4, 100);
        System.out.println("Current Array after replacement: " + myNumber);
    }
}
