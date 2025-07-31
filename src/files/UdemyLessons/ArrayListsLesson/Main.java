package files.UdemyLessons.ArrayListsLesson;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static void printActions(){
        String textBlock = """
    0 - to quit
    1 - to add items
    2 - to remove items
    """;
        System.out.print(textBlock + " ");
    }
    private static final Scanner scanner = new Scanner(System.in);
    private static void addItem(ArrayList<String> groceryList){
        System.out.println("Add items (comma separated list): )");
        String[] items = scanner.nextLine().split(",");
        for (String i : items){
            String trimmedItem = i.trim();
            if (!trimmedItem.isEmpty()){
                groceryList.add(trimmedItem);
        }
        groceryList.addAll(List.of(items));
    }
    }
    private static void removeItem(ArrayList<String> groceryList){
        System.out.println("Remove items (comma separated list): )");
        String[] items = scanner.nextLine().split(",");
//        groceryList.removeAll(List.of(items));
        for (String i : items){
            String trimmed = i.trim();
            groceryList.remove(trimmed);
        }
    }
    public static void main(String[] ignoredArgs) {
        ArrayList<String> groceryList = new ArrayList<>();
        boolean flag = true;
        while(flag){
            printActions();
            switch (Integer.parseInt(scanner.nextLine())){
                case 1 -> addItem(groceryList);
                case 2 -> removeItem(groceryList);
                default -> flag = false;
            }
        }
        groceryList.sort(Comparator.naturalOrder());
        System.out.println(groceryList);
    }
}
