public class Main {
    public static void main(String[] args) {
//        Car car =new Car();
//        car.motor=new DieselMotor();
//        car.getMotor().start();

          Motor motor = new OilMotor();
//        DieselMotor dieselMotor =new DieselMotor();
          Car car = new Car(motor);    // constructor
//        car.setMotor(dieselMotor); // method
//        car.motor=dieselMotor;     // property

        car.getMotor().start();
    }
}