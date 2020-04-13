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

    public BankAccount(String customerName, String customerEmail, String customerPhoneNumber) {
        this(789456,222.59,"jeff","123@gmail.com","(984) 218-9006");
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
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

    public String getCustomerEmail() {
        return customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("jeff","123@gmail.com","(984) 218-9006");
        System.out.println("Good Afternoon, " + bankAccount.customerName + "! Your current balance is " + String.format("%.2f",bankAccount.accountBalance));
        System.out.println(bankAccount.getAccountBalance());
    }
}
