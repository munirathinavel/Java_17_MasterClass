package encapsulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PrinterTest {

    @Test
    void printPages() {

        Printer printer = new Printer(50, false);
        System.out.println(printer.printPages(50));
        printer.addTonorAmount(30);
        System.out.println(printer.printPages(100));
        System.out.println("-----------");

        Printer duplexPrinter = new Printer(50, true);
        System.out.println(duplexPrinter.printPages(50));
        duplexPrinter.addTonorAmount(30);
        System.out.println(duplexPrinter.printPages(100));

    }
}