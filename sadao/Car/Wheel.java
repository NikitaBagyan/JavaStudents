package sadao.Car;

public class Wheel {
    private String name;

    public Wheel(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void turnRight() {
        System.out.println("колесо " + name + " поворачивается на право");
    }
}
