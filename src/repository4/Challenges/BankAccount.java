package repository4.Challenges;

public class BankAccount  {

    private int accountNumber;
    private double accountBalance;
    private double depositedFunds;
    private double withdrawnFunds;
    private String customerName;
    private String customerEmail;
    private long customerPhoneNumber;

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

    public double getDepositedFunds() {
        if(accountBalance >= 0) {
            accountBalance += depositedFunds;
            return accountBalance;
        }
        System.out.println("We're sorry! You don't have enough funds to deposit " + depositedFunds);
        return depositedFunds;
    }

    public void setDepositedFunds(double depositedFunds) {
        this.depositedFunds = depositedFunds;
    }

    public double getWithdrawnFunds() {
        if(accountBalance >= 0) {
            accountBalance -= withdrawnFunds;
            return accountBalance;
        }
        System.out.println("We're sorry! You don't have enough funds to Withdraw " + withdrawnFunds);
        return withdrawnFunds;
    }

    public void setWithdrawnFunds(double withdrawnFunds) {
        this.withdrawnFunds = withdrawnFunds;
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

    public long getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(long customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }



    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(675667875);
        bankAccount.setAccountBalance(7637.99);
        bankAccount.setDepositedFunds(30.98);
        bankAccount.setWithdrawnFunds(22.05);
        bankAccount.setCustomerName("John Smith");
        bankAccount.setCustomerEmail("eastcoastshony@gmail.com");
        bankAccount.setCustomerPhoneNumber(9842189006L);
        System.out.println("Good Afternoon, " + bankAccount.getCustomerName());
        System.out.println("Your Account Number Remains " + bankAccount.getAccountNumber());
        System.out.println("your account balance is $" + bankAccount.getAccountBalance());
        System.out.println("your deposit was successful! Your new balance is now $" + String.format("%.2f", bankAccount.getDepositedFunds()));
        bankAccount.setAccountBalance(7637.99);
        System.out.println("Your requested withdrawl was successful! Your new balance is now $" + bankAccount.getWithdrawnFunds());
    }
}
