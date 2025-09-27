public class Main {
    public static void main(String[] args) {
        ShippingService standardShipping = new StandardShipping();
        System.out.println("Standard shipping cost is: "+standardShipping.calculateCost());
        ShippingService vipFreeShipping = new VIPFreeShipping();
        System.out.println("Standard shipping cost is: "+vipFreeShipping.calculateCost());
    }
}
