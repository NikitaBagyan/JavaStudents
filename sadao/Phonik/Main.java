package sadao.Phonik;

public class Main {
    public static void main(String[] args) {


        Phone saMphone = new Phone("Sasung","123123");

        Phone telePhone = new Phone("InPhone","789789");

        Phone xiPhone = new Phone("Xiaomi","456456");

        saMphone.call(telePhone);
        saMphone.callCancell();
        telePhone.call(saMphone);
        saMphone.call(xiPhone);
        saMphone.sendMessage(telePhone, "Hi");
        telePhone.sendMessage(saMphone , "Hi nice to meet you");

    }
}
