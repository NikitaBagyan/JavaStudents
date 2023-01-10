package sadao.Car;

public class SteelingWheel {
 private Wheel wheel;

    public SteelingWheel(Wheel wheel) {
        this.wheel = wheel;
    }



    public void turnRight() {
        wheel.turnRight();
        System.out.println("руль повернут на право");
    }
    public void setWheel(Wheel wheel) {
        this.wheel = wheel;

    }
}
