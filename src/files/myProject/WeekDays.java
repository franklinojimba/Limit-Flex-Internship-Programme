package files.myProject;
enum Days{
    MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY
}
public class WeekDays {
    public static void main(String[] args) {
        Days day = Days.SATURDAY;
        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY:
                System.out.println("It's a weekday");
                break;
            case SATURDAY:
                                    System.out.println("It's a weekend");
                                    break;
                                    case SUNDAY:
                                        System.out.println("It's the beginning of a new week.");
                                        break;
        }
    }
}
