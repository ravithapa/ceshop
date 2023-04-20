package project.project4;

import org.springframework.data.mongodb.core.aggregation.ArrayOperators;

public class HexagonalNumber {

    public static void main(String[] args) {
        if(args.length < 1) {
            System.out.println("Please provide a number as command line arugment.");
            return;
        }
        int numberEntered = Integer.parseInt(args[0]);
        int hexagonalNumber = getHexagonalNumber(numberEntered);
        System.out.println("The " + numberEntered + "-th hexagonal number is " + hexagonalNumber);
    }

    public static int getHexagonalNumber(int numberEntered) {
        return numberEntered * (2 * numberEntered -1);
    }

}
