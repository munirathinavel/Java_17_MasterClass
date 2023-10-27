package basic;

public class SwitchNATO {
    public String printNATO(char input) {
        return switch (input) {
            case 'A' -> "Able";
            case 'B' -> "Baker";
            case 'C' -> "Charlie";
            case 'R' -> "Roger";
            default -> "Invalid Input";
        };
    }
}


