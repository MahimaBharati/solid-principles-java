public class DriverBad implements UserActions{
    @Override
    public void acceptRide(){
        System.out.println("\nAccepting the ride..");
    }
    @Override
    public void drive(){
        System.out.println("\nDriving to location..");
    }
    @Override
    public void bookRide(){
        throw new UnsupportedOperationException("Driver can't book a ride");
    }

    @Override
    public void payRide() {
        throw new UnsupportedOperationException("Driver shouldn't pay for a ride");
    }
}
