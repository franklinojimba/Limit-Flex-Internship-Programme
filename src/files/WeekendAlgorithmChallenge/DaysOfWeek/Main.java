package files.WeekendAlgorithmChallenge.DaysOfWeek;

public class Main {
    public static void main(String[] args) {
       Days myDay = Days.FRIDAY;
       switch (myDay){
           case MONDAY -> System.out.println("Sweep the compound");
           case TUESDAY -> System.out.println("Mow the lawn");
           case WEDNESDAY -> System.out.println("ash the car");
           case THURSDAY -> System.out.println("Sweep the dining room");
           case FRIDAY -> System.out.println("Mop the floors");
       }
        System.out.println(myDay);
    }
}
