package sadao;

public class Knight extends Soldier{

    public Knight(String name) {
        super(name);
        this.price = 245;
        this.phrase = "Наше дело правое, а врага — найдем";
    }
    public void feed(){
        System.out.println("Кормлю коня");
    }
}
