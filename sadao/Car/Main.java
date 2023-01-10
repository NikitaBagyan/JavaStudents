package sadao.Car;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto("volvo","white",new Wheel("кирзачи"));


        auto.setWheel(new Wheel("Наташа"));
        auto.autoRun();
        auto.turnRight();
        auto.getWheel().setName("оля");

    }
}
