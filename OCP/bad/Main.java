public class Main {
    public static void main(String[] args) {
        TaxCalculatorBad indiaTaxCalculator = new TaxCalculatorBad("India");
        System.out.println("Tax for India is: "+indiaTaxCalculator.calculateTax(1000));

        TaxCalculatorBad usTaxCalculator = new TaxCalculatorBad("US");
        System.out.println("Tax for US is: "+usTaxCalculator.calculateTax(1000));
    }
}
