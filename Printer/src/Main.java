public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer(50, true);
        System.out.println("Initial page count = " + printer.getPagesPrinted());

        int pagesPrinted = printer.printPages(5);
        System.out.printf("Current job pages: %d, Printer total: %d %n", pagesPrinted, printer.getPagesPrinted());

        pagesPrinted = printer.printPages(10);
        System.out.printf("Current job pages: %d, Printer total: %d %n", pagesPrinted, printer.getPagesPrinted());

        System.out.println("Initial Toner level = " + printer.getTonerLevel());

        printer.addToner(60);
        System.out.println(printer.addToner(60));
        System.out.println("Current Toner level  = " + printer.getTonerLevel());
    }
}