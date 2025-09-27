public class TaxCalculatorBad {
    String country;
    public TaxCalculatorBad(String country) {
        this.country=country;
    }

    //If we need to calculate tax for Europe, we have to modify calculateTax function which can end up affecting tax 
    //for India as well as US.
    public double calculateTax(int amount) {
        if(country.equalsIgnoreCase("India")) {
            return 0.5*amount;
        } else if(country.equalsIgnoreCase("US")){
            return 0.9*amount;
        }
        return 0.1*amount;
    }
}
