package repository4.Challenges;

public class BankAccount  {

    private int accountNumber;
    private double accountBalance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public BankAccount(int accountNumber, double accountBalance, String customerName, String customerEmail, String customerPhoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public double depositFunds(double deposit) {
        if(accountBalance + deposit >= 0) {
            accountBalance += deposit;
            System.out.println("Thank you for deposit, your new balance is " + String.format("%.2f",accountBalance));
        } else {
            return accountBalance;
        }
        return -1;
    }

    public double withdrawFunds(double withdraw) {
        if(accountBalance - withdraw <= 0) {
            System.out.println("Cannot process your withdrawl, your account is currently at " + accountBalance);
        } else {
            accountBalance -= withdraw;
            System.out.println("Thank you for withdrawl, your new balance is " + String.format("%.2f", accountBalance));
            return accountBalance;
        }
        return -1;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(9876789,567.88,"Shony",
                "123@gmail.com","(984) 218-9006");
        bankAccount.withdrawFunds(56.56);
        bankAccount.depositFunds(100.00);
        System.out.println("Good Afternoon, " + bankAccount.customerName + "! Your current balance is " + String.format("%.2f",bankAccount.accountBalance));
    }
}
