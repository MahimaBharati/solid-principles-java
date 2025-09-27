public class Driver implements DriverActions{
    @Override
    public void acceptRide(){
        System.out.println("\nAccepting the ride..");
    }
    @Override
    public void drive(){
        System.out.println("\nDriving to location..");
    }
}
