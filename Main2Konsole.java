import java.util.*;

public class Main2Konsole {
    public static void main(String[] args) {
        AdvancedCalculator advancedCalculator3 = new AdvancedCalculator();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("What kind of operation you would like to perform: ");
            String action = scanner.nextLine();
            if (action.equals("exit")) {
                break;
            }
            validateOperator(action, scanner);
            double a = parseNumber2Doubles(scanner);
            double b = parseNumber2Doubles(scanner);
            double result = getResult(a, b, action, advancedCalculator3);
            System.out.println(formatResult(a, b, action, result));
        }
    }

    private static double getResult(double a, double b, String operator, AdvancedCalculator advancedCalculator3) {
        switch (operator.trim()) {
            case "+":
                return advancedCalculator3.add(a, b);
            case "/":
                return advancedCalculator3.divide(a, b);
            case "*":
                return advancedCalculator3.multiply(a, b);
            case "-":
                return advancedCalculator3.subtract(a, b);
            case "^":
                return advancedCalculator3.power(a, b);
            default:
                throw new RuntimeException("Please provide one of valid operators \"/\",\"*\",\"+\",\"-\",\"^\"");
        }
    }

    private static void validateOperator(String operator, Scanner scanner) {
        List<String> strings = Arrays.asList("/", "*", "+", "-", "^");
        while (!strings.contains(operator)) {
            System.out.println("Please chose one of following operations: +, -, /, *, ^");
            operator = scanner.nextLine();
        }
        ;
    }

    private static double parseNumber2Doubles(Scanner scan) {
        System.out.println("Please provide number: ");
        String i = scan.nextLine();
        return Double.parseDouble(i);
    }

    private static String formatResult(double a, double b, String operator, double result) {
        return a + " " + operator + " " + b + " = " + result;
    }
}