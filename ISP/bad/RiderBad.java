public class RiderBad implements UserActions{
    @Override
    public void acceptRide(){
        throw new UnsupportedOperationException("Rider can't accept a ride");
    }
    
    @Override
    public void drive(){
        throw new UnsupportedOperationException("Rider doesn't drive");
    }
    @Override
    public void bookRide(){
        System.out.println("\nBooking a ride..");
    }

    @Override
    public void payRide() {
        System.out.println("\nPaying for the ride..");
    }
}
