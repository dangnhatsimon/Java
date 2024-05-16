public class  bankAccount {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public bankAccount() {
        this("327", 2.6, "default name", "default email", "default phone");
        System.out.println("Empty constructor called");
    }


    public bankAccount(String accountNumber, double accountBalance, String customerName, String customerEmail, String customerPhone) {
        System.out.println("Account constructor with parameters called");
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        email = customerEmail;
        phoneNumber = customerPhone;
    }

    public bankAccount(String customerName, String email, String phoneNumber) {
        this("999", 99.6, customerName, email, phoneNumber);
//        this.customerName = customerName;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public void depositFund(double depositAmount) {
        double balance = getAccountBalance() + depositAmount;
        setAccountBalance(balance);
    }

    public void withdrawFund(double withdrawAmount) {
        double balance = getAccountBalance();
        if (balance < withdrawAmount) {
            System.out.println("Insufficient funds! You have only $ " + balance + " in you account.");
        } else {
            balance -= withdrawAmount;
            setAccountBalance(balance);
        }
    }
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}



