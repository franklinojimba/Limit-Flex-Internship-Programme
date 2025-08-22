package files.WeekendAlgorithmChallenge.Arrays;

import java.util.ArrayList;
import java.util.List;

public class ListMerger {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>(List.of("pj", "sk", "et"));
        List<String> list2 = new ArrayList<>(List.of("tt", "xt", "ye"));
        List<String> list3 = new ArrayList<>();
        list3.addAll(list2);
        list3.addAll(list1);
        System.out.println(list3);
    }
}
