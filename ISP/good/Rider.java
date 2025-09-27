public class Rider implements RiderActions{
    @Override
    public void bookRide(){
        System.out.println("\nBooking a ride..");
    }

    @Override
    public void payRide() {
        System.out.println("\nPaying for the ride..");
    }
    
}
