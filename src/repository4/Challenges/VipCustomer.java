package repository4.Challenges;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(String name,double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public VipCustomer() {
        this("jeff",300.00,"123@gmail.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "123@gmail.com");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public static void main(String[] args) {
        VipCustomer vipCustomer = new VipCustomer("jeff",300.00,"123@gmail.com");
        System.out.println("your name is " + vipCustomer.name + ", your credit limit is " + vipCustomer.creditLimit + " and your email address is " + vipCustomer.emailAddress);
    }
}
