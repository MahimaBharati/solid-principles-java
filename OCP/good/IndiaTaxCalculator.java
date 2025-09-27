public class IndiaTaxCalculator implements TaxCalculator{
    @Override
    public double calculateTax(double income) {
        return income*0.5;
    }
}
