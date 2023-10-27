package basic;

enum Months {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER
}

public class SwitchFindQuarter {

    public void findQuarter(Months month) {
        switch (month) {
            case JANUARY, FEBRUARY, MARCH -> System.out.println("Quarter 1");
            case APRIL, MAY, JUNE -> System.out.println("Quarter 2");
            case JULY, AUGUST, SEPTEMBER -> System.out.println("Quarter 3");
            case OCTOBER, NOVEMBER, DECEMBER -> System.out.println("Quarter 4");
            default -> System.out.println("Invalid input");
        }
    }
}
