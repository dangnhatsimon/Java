public class Main {
    public static void main(String[] args) {
        Employee nhat = new Employee("Nhat", "12/04/1995", "01/01/2020");
        System.out.println(nhat);
        System.out.println("Age = " + nhat.getAge());
        System.out.println("{ay} = " + nhat.collectPay());

        Employee joe = new Employee("Joe", "11/11/1995", "03/03/2020");
        System.out.println(joe);

        SalariedEmployee timmy = new SalariedEmployee("timmy", "25/12/1985", "03/03/2020", 35000);
        System.out.println(timmy);
        System.out.println("Timmy's paycheck = $" + timmy.collectPay());

        timmy.retire();
        System.out.println("Timmy's pension check = $" + timmy.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "05/05/1970", "03/03/2021", 15);
        System.out.println(mary);
        System.out.println("Mary's paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());
    }
}