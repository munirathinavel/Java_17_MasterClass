package basic;

import org.junit.jupiter.api.Test;

class SwitchFindQuarterTest {

    @Test
    void findQuarter() {
        SwitchFindQuarter switchFindQuarter = new SwitchFindQuarter();

        switchFindQuarter.findQuarter(Months.MARCH);
        switchFindQuarter.findQuarter(Months.MARCH);
        switchFindQuarter.findQuarter(Months.AUGUST);
        switchFindQuarter.findQuarter(Months.NOVEMBER);
    }
}