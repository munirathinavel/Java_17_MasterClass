package string;

public class StringExamples {

    public static void main(String[] args) {
        callStringInspectionMethods("");
        callStringInspectionMethods("\t \t \n");
        callStringInspectionMethods("Hello World");

        callStringCompareMethods("Hello World");

    }

    private static void callStringCompareMethods(String string) {
        String lowerCaseString = string.toLowerCase();

        if(lowerCaseString.equals(string)) {
            System.out.println("Same String");
        }
        if(lowerCaseString.equalsIgnoreCase(string)) {
            System.out.println("Same string but different case");
        }

        if(string.contains("Hello")) {
            System.out.println("String contains Hello");
        }

        if(string.contentEquals("Hello")) {
            System.out.println("Contains Value");
        }
        if(string.contentEquals("Hello World")) {
            System.out.println("Contains Full Value");
        }

        String dob = String.join("-", "12", "10", "88");
        System.out.println(dob);
        System.out.println("Updated DOB:" + dob.replace("-", "/"));
        System.out.println("Updated DOB:" + dob.replace("88", "1988"));
        System.out.println("Replace First DOB:" + dob.replaceFirst("-", "/"));
        System.out.println("Replace Last DOB:" + dob.replaceAll("-", "/"));
        System.out.println("Hello World".substring(2,6));
        System.out.println("Hello World".concat(" !"));
        System.out.println("Cool\n".repeat(5).indent(4));


    }

    private static void callStringInspectionMethods(String string) {
        System.out.println("Original String:" + string);
        int length = string.length();
        System.out.println("Length is "+ length);
        if (string.isEmpty()) {
            System.out.println("String is empty");
            System.out.println("-------------------");
            return;
        }
        if (string.isBlank()) {
            System.out.println("String is blank");
        }
        System.out.println("First Char is " + string.charAt(0));
        System.out.println("Last Char is " + string.charAt(length - 1));

        System.out.println("Index of l is " + string.indexOf('l'));
        System.out.println("Index of World is " + string.indexOf("World"));
        System.out.println("Index of l from 3 is " + string.indexOf('l', 3));
        System.out.println("Last Index of l is " + string.lastIndexOf('l'));
        System.out.println("Last Index of l is " + string.lastIndexOf('l', length-4));
        System.out.println("-------------------");
    }
}
