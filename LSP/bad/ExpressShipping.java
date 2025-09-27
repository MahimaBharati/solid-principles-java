package LSP.bad;

public class ExpressShipping implements ShippingServiceBad{
    @Override
    public double calculateCost() {
        return 100;
    }  
}
