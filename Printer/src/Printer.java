public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean duplex;


    public Printer(int tonerLevel, boolean duplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : -1;
        this.duplex = duplex;
        this.pagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        int tempAmount = tonerAmount + tonerLevel;
        if ((tempAmount > 100) || (tempAmount < 0)) {
            return -1;
        }
        tonerLevel += tonerAmount;
        return  tonerLevel;
    }

    public int printPages(int pages) {
        int jobPages;
        if (duplex) {
            jobPages = pages / 2 + pages % 2;
            pagesPrinted += jobPages;
        } else {
            jobPages = pages;
        }
        return jobPages;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }
}
