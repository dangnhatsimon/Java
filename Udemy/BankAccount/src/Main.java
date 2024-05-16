//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        bankAccount bobsAccount = new bankAccount();
        bobsAccount.depositFund(250.0);
        bobsAccount.withdrawFund(100.0);
        System.out.println(bobsAccount.getCustomerName());
        double remain = bobsAccount.getAccountBalance();
        System.out.println(remain);
        bankAccount timsAccount = new bankAccount("Tim", "tim@gmail.com", "12345");
        System.out.println("AccountNo: " + timsAccount.getAccountNumber() + "; name " + timsAccount.getCustomerName());
    }
}