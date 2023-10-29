package encapsulation;

public class Printer {
    private int tonorLevel;
    private int printedPages;

    private boolean duplex;

    public Printer(int tonorLevel, boolean duplex) {
        this.tonorLevel = tonorLevel > 0 &&  tonorLevel <= 100 ? tonorLevel : -1;
        this.duplex = duplex;
    }

    public int addTonorAmount(int tonorAmount) {
        int tempTotal = this.tonorLevel + tonorAmount;

        if (tempTotal < 0 || tempTotal > 100) {
            return  -1;
        }
        this.tonorLevel = tempTotal;
        return tempTotal;
    }

    public int printPages(int pages) {
        printedPages += pages;
        if (duplex) {
            return pages / 2 + pages % 2;
        }
        return pages;
    }
}
