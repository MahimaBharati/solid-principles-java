public class Main {
    public static void main(String[] args) {
    RiderBad rider = new RiderBad();
    Driver driver = new Driver();
    rider.bookRide();
    driver.acceptRide();
    driver.drive();
    rider.payRide();
    }
    
}
