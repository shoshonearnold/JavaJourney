package repository4.Challenges;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0 || age > 100) {
            age = 0;
        }
        this.age = age;
    }

    public boolean isTeen() {
        return age > 12 && age <= 19;
    }

    public String getFullName() {
         String EMPTY_STRING = " ";
         String isEmpty = EMPTY_STRING;
         String fullName = firstName + " " + lastName;
         if(firstName.equals(isEmpty) && (lastName.equals(isEmpty))) {
             return EMPTY_STRING;
         }

         if(lastName.equals(EMPTY_STRING)) {
             return firstName;
         }

         if(firstName.equals(EMPTY_STRING)) {
             return lastName;
         }
         return fullName;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");
        person.setLastName("Wick");
        person.setAge(34);
        System.out.println("full name = " + person.getFullName());
        System.out.println("teen = " + person.isTeen());
    }
}
