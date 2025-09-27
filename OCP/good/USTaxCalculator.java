public class USTaxCalculator implements TaxCalculator{
    @Override
    public double calculateTax(double income){
        return 0.9*income;
    } 
}
