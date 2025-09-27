package LSP.bad;

public class StandardShippingBad implements ShippingServiceBad{
    @Override
    public double calculateCost() {
        return 50;
    }
}
