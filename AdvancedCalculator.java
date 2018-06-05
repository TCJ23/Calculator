public class AdvancedCalculator extends Calculator {
    public double power(double a , double b){
       double result = Math.pow(a,b);
        saveHistory(a,b,result,"^");
        return result;
}
    public void sqrt(double a){
        double result = Math.sqrt(a);
        saveHistory("Square Root: \u221A" + a + " = " + result);
    }
    //OVERRIDE - NADPISAł
    //modifier moze byc bardziej oawrty ale nie zamkniety
    @Override
    public void printOperationalHistory(){
        System.out.println("We are printing this messeage from CHILD");
        super.printOperationalHistory();
    }
}
