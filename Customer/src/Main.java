public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Nhat", 5000.0, "dangnhat");
        System.out.println(customer);
        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
    }
}