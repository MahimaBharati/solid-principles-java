public class Main {
    public static void main(String[] args) {
        TaxCalculator indiaTaxCalculator = new IndiaTaxCalculator();
        System.out.println("Tax for India is: "+indiaTaxCalculator.calculateTax(1000));

        TaxCalculator usTaxCalculator = new USTaxCalculator();
        System.out.println("Tax for US is: "+usTaxCalculator.calculateTax(1000));
    }
}
