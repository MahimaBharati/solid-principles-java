package LSP.bad;

public class MainBad {
    public static void main(String[] args) {
        ShippingServiceBad standardService=new StandardShippingBad(); 
        System.out.println("Cost for shipping is"+standardService.calculateCost()); 

        ShippingServiceBad vipService=new VIPFreeShippingBad(); 
        System.out.println("Cost for shipping is"+vipService.calculateCost()); //throws exception when substituted
    }
}
