package sadao.Phonik;

public class Phone {

    private String model;
    private String number;
    private Phone currentPhone;

    public Phone(String model, String number) {
        this.model = model;
        this.number = number;
        this.currentPhone = null;
    }

    public void call(Phone phone) {
        if (this.currentPhone == null && phone.getCurrentPhone() == null) {
            this.setCurrentPhone(phone);
            phone.setCurrentPhone(this);

            System.out.println("calling to number" + phone.getNumber());
        } else if (phone.getCurrentPhone() != null) {
            System.out.println("запрашиваемый абонент занят");
        } else {
            System.out.println("ваш телефон занят");
        }
    }

    public void callCancell() {
        this.getCurrentPhone().setCurrentPhone(null);
        this.setCurrentPhone(null);
    }

    public void sendMessage(Phone phone, String message) {
        System.out.println("sending " + message + " to number " + phone.getNumber());
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Phone getCurrentPhone() {
        return currentPhone;
    }

    public void setCurrentPhone(Phone currentPhone) {
        this.currentPhone = currentPhone;
    }
}
