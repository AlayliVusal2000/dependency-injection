package injection;

public class OilMotor implements Motor {
    @Override
    public void start() {
        System.out.println("OilMotor");
    }
}
