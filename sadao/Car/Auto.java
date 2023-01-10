package sadao.Car;

public class Auto {
    String brand;

    boolean isAutoLaunch = false;
    private Engine engine;
    private Wheel wheel;
    private SteelingWheel steelingWheel;
    private Body body;

    public Auto(String brand, String color, Wheel wheel) {
        this.engine = new Engine();
        this.body = new Body(color);
        this.brand = brand;
        this.wheel = wheel;
        this.steelingWheel = new SteelingWheel(this.wheel);

    }
    public void autoRun(){
     isAutoLaunch = true;
        System.out.println("Вруммм врумммм");
        System.out.println("Машина завелась");
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;

        steelingWheel.setWheel(this.wheel);
    }

    public void turnRight(){
        if (isAutoLaunch==true) {
            steelingWheel.turnRight();
            System.out.println("Машина повернула на право");
        }
        else {
            System.out.println("Машина не заведена");
        }
    }
}
