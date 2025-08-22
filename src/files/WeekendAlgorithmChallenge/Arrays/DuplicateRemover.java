package files.WeekendAlgorithmChallenge.Arrays;

import java.util.*;

public class DuplicateRemover {
    public static void main(String[] args) {
        List<Integer> newList = new ArrayList<>(List.of(1,2,2,4,5,6));
        List<Integer> result = newList.stream().distinct().toList();
        System.out.println(result);


        Set<String> newSet = new HashSet<>(List.of("Jane", "Mary", "Cynthia", "John", "Jackson"));
        System.out.println("HashSet: " + newSet);

        Set<Integer> newSet2 = new TreeSet<>(List.of(1,4,5,2,7));
        System.out.println("TreeSet: " + newSet2);

        Set<Integer> newSet3 = new TreeSet<>(List.of(5,8,7,4));

        Set<Integer> intersect = new TreeSet<>(newSet2);
        intersect.retainAll(newSet3);
        System.out.println("Intersection of the sets:" + intersect);

        Set<Integer> union = new TreeSet<>(newSet2);
        union.addAll(newSet3);
        System.out.println("Union of sets: " + union);

        Comparator<String> lengthComparator = (s1,s2)-> {
            int diff = s1.length() - s2.length();
            if (diff == 0){
                return s1.compareTo(s2);
            }
            return diff;
        };
        Set<String> newSet4 = new TreeSet<>(lengthComparator);
        newSet4.add("Jane");
        newSet4.add("Jacinta");
        newSet4.add("Xi");
        newSet4.add("Griselda");
        System.out.println("Set with Custom Comparator: " + newSet4);

        Set<Integer> newSet5 = new HashSet<>(List.of(5,2,9,6,3,1));
        ArrayList<Integer> newList5 = new ArrayList<>(newSet5);
        Collections.sort(newList5);
        System.out.println("Sorted List:" + newList5);

        Map<String, Integer> scoreList = new HashMap<>();
        scoreList.put("Janet", 98);
        scoreList.put("Javier", 88);
        scoreList.put("Xiang", 87);
        scoreList.put("Griselateda", 84);

        System.out.println("Scorelist: " + scoreList);

        Map<String, String> countries = new LinkedHashMap<>();
        countries.put("France", "Paris");
        countries.put("Germany", "Berlin");
        countries.put("Russia", "Moscow");
        countries.put("Nigeria", "Abuja");
        countries.put("Ghana", "Accra");

        System.out.println("Countries: " + countries);

        Map<Integer, String> products = new TreeMap<>();
        products.put(110, "Apple");
        products.put(2, "Banana");
        products.put(49, "Pearl");
        products.put(54, "Pineapple");
        products.entrySet().removeIf(entry -> entry.getKey()< 50);

        System.out.println("Products: " + products);

        Map<String, Integer> stringIntegerMap = new TreeMap<>();
        stringIntegerMap.put("Apple", 10);
        stringIntegerMap.put("Banana", 20);
        stringIntegerMap.put("Pearl", 30);
        String key = "Apple";
        if (stringIntegerMap.containsKey(key)) {
            System.out.println("Key: " + stringIntegerMap.get(key));
        }
        else {
            System.out.println("Key not found");
        }

        for (Map.Entry<String, Integer> entry : stringIntegerMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }
    }

}
