import java.util.ArrayList;
import java.util.List;

public class Calculator {

    List<String> lista= new ArrayList<String>();
    static List<String> lista2 = new ArrayList<String>();
    //OVERLOADING - PRZECIĄŻENIE
    protected void saveHistory(double a, double b, double result, String operator){
        String operation = a + " " + operator + " "  + b + " = " + result;
        saveHistory(operation);
    }

    protected void saveHistory(String operation) {
        lista.add(operation);
        lista2.add(operation);
}

    public  double divide(double a, double b){
        double div = a/b;
        saveHistory(a,b,div,"/");
        return div;
    }
    
    public  double add (double a, double b){
        double add = a + b;
        saveHistory(a,b,add,"+");

        return add;
    }
    
    public  double multiply (double a, double b){
        double multi = a * b;
        saveHistory(a,b,multi,"*");

        return multi;
    }
    
    public double subtract (double a, double b){
        double substract = a - b;
        saveHistory(a,b,substract,"-");
        return substract;
    }
    //printOperationalHistory

    public void printOperationalHistory(){
        //String n = Integer.toString(1);
        for (int i = 0; i < lista.size(); i++) {
           System.out.println(i + 1 + ". " + lista.get(i));
        }
    }
    public void clearOperationalHistory(){
        lista.clear();
    }

    //public void printGlobalHistory(){
    public static void printGlobalHistory(){
        for (int i = 0; i < lista2.size(); i++) {
            System.out.println(i + 1 + ". " + lista2.get(i));
        }
    }
}
