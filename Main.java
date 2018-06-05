import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.add(2.0,4.0);
        calculator.divide(2.0,4.0);
        calculator.multiply(2.0,4.0);
        calculator.subtract(2.0,4.0);
        calculator.printOperationalHistory();
        Calculator.printGlobalHistory();
//
//        Calculator calculator2 = new Calculator();
//        calculator2.add(3.5,4.0);
//        calculator2.divide(2.0,4.0);
//        calculator2.multiply(2.0,4.0);
//        calculator2.subtract(2.0,4.0);
        //calculator2.printOperationalHistory();
        //calculator2.printOperationalHistory();
//        advancedCalculator3.sqrt(4);
//        advancedCalculator3.power(6,3);
//        //Calculator.printGlobalHistory();
//        //advancedCalculator3.printOperationalHistory();
//        List<Calculator> calculatorList = new ArrayList<Calculator>();
//        calculatorList.add(calculator);
//        calculatorList.add(calculator2);
//        calculatorList.add(advancedCalculator3);
//        printCalculatorsHistory(calculatorList);
//        AdvancedCalculator advancedCalculator3 = new AdvancedCalculator();
//        Scanner scanner = new Scanner(System.in);
//        while (true){
//            System.out.println("Fuck you and give me operation you would like to perform: ");
//            String line = scanner.nextLine();
//
//            if(line.equals("exit")){
//                break;
//            }
//        }
    }

}
