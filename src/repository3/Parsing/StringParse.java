package repository3.Parsing;

public class StringParse {
    public static void main(String[] args) {
        String numberAsString = "2018";
        System.out.println(numberAsString);

        double number = Double.parseDouble(numberAsString);
        float number2 = Float.parseFloat(numberAsString);
        System.out.println(number);
        System.out.println(numberAsString);
        System.out.println(number2);

        numberAsString += 1; // increments added to strings get added to the line of data, 2018(1)
        number += 1; // increments added to int/floats, etc get added to the literal data, 2019, 2019.0
        System.out.println(numberAsString);
        System.out.println(number);
    }
}
