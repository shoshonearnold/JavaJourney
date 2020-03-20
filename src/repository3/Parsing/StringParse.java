package repository3.Parsing;

public class StringParse {
    public static void main(String[] args) {
        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        double number = Double.parseDouble(numberAsString);
        float number2 = Float.parseFloat(numberAsString);
        System.out.println("number = " + number);
        System.out.println("floated number = " + number2);

        numberAsString += 1;
        number += 1;
        System.out.println("number as string = " + numberAsString);
        System.out.println("number =" + number);
    }
}
