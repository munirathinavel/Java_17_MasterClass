package enumclass;

import java.util.Random;

enum WeekDays {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
}
public class Weekday {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            WeekDays day =  getRandonDay();
            System.out.println("Day: " + day + ", Ordinal Value:" +  day.ordinal());

            if (day == WeekDays.FRIDAY) {
                System.out.println("It's friday");
            }
        }

        System.out.println("-".repeat(50));
        for (int i = 0; i < 10; i++) {
            switchDayOfWeek(getRandonDay());
        }

    }

    private static void switchDayOfWeek(WeekDays day) {
        int ordinal = day.ordinal() + 1;
        switch (day) {
            case SUNDAY -> System.out.println("Sunday is day " + ordinal);
            case MONDAY -> System.out.println("Monday is day " + ordinal);
            case TUESDAY -> System.out.println("Tuesday is day " + ordinal);
            case WEDNESDAY -> System.out.println("Wednesday is day " + ordinal);
            case THURSDAY -> System.out.println("Thursday is day " + ordinal);
            case FRIDAY -> System.out.println("Friday is day " + ordinal);
            default -> System.out.println("Saturday is day " + ordinal);


        }
    }

    private static WeekDays getRandonDay() {
        WeekDays[] weekDays = WeekDays.values();
        return weekDays[new Random().nextInt(7)];
    }

}
