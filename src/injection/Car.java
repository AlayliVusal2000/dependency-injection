package injection;

public class Car {
    Motor motor;

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Car(Motor motor) {
        this.motor = motor;
    }
}
