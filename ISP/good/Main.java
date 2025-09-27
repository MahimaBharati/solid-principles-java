public class Main {
    public static void main(String[] args) {
    Rider rider = new Rider();
    Driver driver = new Driver();
    rider.bookRide();
    driver.acceptRide();
    driver.drive();
    rider.payRide();
    }
    
}
