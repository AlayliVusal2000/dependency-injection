package injection;

public class Main {
    public static void main(String[] args) {
//        injection.Car car =new injection.Car();
//        car.motor=new injection.DieselMotor();
//        car.getMotor().start();

          Motor motor = new OilMotor();
//        injection.DieselMotor dieselMotor =new injection.DieselMotor();
          Car car = new Car(motor);    // constructor
//        car.setMotor(dieselMotor); // method
//        car.motor=dieselMotor;     // property
        car.getMotor().start();
    }
}