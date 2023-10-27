package inheritance.challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    @Test
    void testWorkerInheritance() {

        Worker hourlyEmployee = new HourlyEmployee("Chinna", "12-12-87", "01-01-2020", 60);
        System.out.println(((HourlyEmployee)hourlyEmployee).getDoublePay());
        System.out.println("Age is:" + hourlyEmployee.getAge());
        System.out.println("Collect Pay:" + hourlyEmployee.collectPay());
        System.out.println("Double Pay is:" + ((HourlyEmployee)hourlyEmployee).getDoublePay());
        System.out.println(hourlyEmployee);
        System.out.println();

        Worker salariedEmployee = new SalariedEmployee("Cool", "12-12-88", "01-01-2019", 100000000, false);
        System.out.println("Age is:" + salariedEmployee.getAge());
        System.out.println("Collect Pay:" + salariedEmployee.collectPay());
        System.out.println("Retiring date is:" + ((SalariedEmployee)salariedEmployee).retire());
        System.out.println("Collect Pay Post Retirement:" + salariedEmployee.collectPay());
        System.out.println(salariedEmployee);
        System.out.println();
    }
}