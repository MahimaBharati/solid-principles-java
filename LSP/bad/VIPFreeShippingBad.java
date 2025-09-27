package LSP.bad;

public class VIPFreeShippingBad implements ShippingServiceBad{
    @Override
    public double calculateCost() {
        throw new UnsupportedOperationException("VIP shipping is free, so it has no cost associated.");
    }
    
}
