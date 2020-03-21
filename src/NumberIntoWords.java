import java.util.Scanner;

public class NumberIntoWords {
    public static void main(String[] args) {
        String firstNumber = "";
        String secondNumber = "";
        String thirdNumber = "";
        String zero = "zero";
        String one = "one";
        String two = "two";
        String three = "three";
        String four = "four";
        String five = "five";
        String six = "six";
        String seven = "seven";
        String eight = "eight";
        String nine = "nine";
        String ten = "ten";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number less than 1000: ");
        String inputNumber = scanner.nextLine();
        String[] numberList = inputNumber.split("");
        switch (numberList[0]) {
            case "1":
                firstNumber = one;
                break;
            case "2":
                firstNumber = two;
                break;
            case "3":
                firstNumber = three;
                break;
            case "4":
                firstNumber = four;
                break;
            case "5":
                firstNumber = five;
                break;
            case "6":
                firstNumber = six;
                break;
            case "7":
                firstNumber = seven;
                break;
            case "8":
                firstNumber = eight;
                break;
            case "9":
                firstNumber = nine;
                break;
        }
        switch (numberList[1]) {
            case "1":
                secondNumber = one;
                break;
            case "2":
                secondNumber = two;
                break;
            case "3":
                secondNumber = three;
                break;
            case "4":
                secondNumber = four;
                break;
            case "5":
                secondNumber = five;
                break;
            case "6":
                secondNumber = six;
                break;
            case "7":
                secondNumber = seven;
                break;
            case "8":
                secondNumber = eight;
                break;
            case "9":
                secondNumber = nine;
                break;
        }
        switch (numberList[2]) {
            case "1":
                thirdNumber = one;
                break;
            case "2":
                thirdNumber = two;
                break;
            case "3":
                thirdNumber = three;
                break;
            case "4":
                thirdNumber = four;
                break;
            case "5":
                thirdNumber = five;
                break;
            case "6":
                thirdNumber = six;
                break;
            case "7":
                thirdNumber = seven;
                break;
            case "8":
                thirdNumber = eight;
                break;
            case "9":
                thirdNumber = nine;
                break;
        }
        System.out.println("Your number is: " + firstNumber + " hundred " + secondNumber + "ty " + thirdNumber);
    }
}



