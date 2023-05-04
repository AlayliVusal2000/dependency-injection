package injection;

public class DieselMotor implements Motor {
    @Override
    public void start() {
        System.out.println("DieselMotor");
    }
}
