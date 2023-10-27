package oops.inheritance.methodoverloading;

public class SecondsAndMinutesConversion {

    public static final int HOUR = 3600;
    public static final int MINUTE = 60;

    public String secondsAndMinutes(int seconds) {
        if (seconds < 0) {
            return "Invalid input";
        }
        if (seconds >= HOUR) {
            int hours = seconds / HOUR;
            int mins = hours / MINUTE;
            int secs = mins % MINUTE;
            return hours + "h " + mins + "m " + secs + "s";
        } else if (seconds >= MINUTE) {
            int mins = seconds / MINUTE;
            int secs = seconds % MINUTE;
            return "0h " + mins + "m " + secs + "s";
        } else {
            return "0h 0m " + seconds + "s";
        }
    }

    public String secondsAndMinutes(int minutes, int seconds) {
        if (seconds < 0 || seconds > 59 || minutes < 0) {
            return "Invalid input";
        }
        if (minutes >= 60) {
            int hours = minutes / 60;
            int mins = minutes % 60;
            return hours + "h " + mins + "m " + seconds + "s";
        } else {
            return "0h " + minutes + "m " + seconds + "s";
        }
    }
}
