package People;

public class Guest extends Human {
    String permanent;
    double averagePay;
    boolean isFaceControl;

    public Guest(String name, int age, String address, String male, String permanent, double averagePay, boolean isFaceControl) {
        super(name, age, address, male);
        this.permanent = permanent;
        this.averagePay = averagePay;
        this.isFaceControl = isFaceControl;
    }

    public void setPermanent(String permanent) {
        this.permanent = permanent;
    }

    public void setAveragePay(double averagePay) {
        this.averagePay = averagePay;
    }

    public void setFaceControl(boolean faceControl) {
        isFaceControl = faceControl;
    }

    public String getPermanent() {
        return permanent;
    }

    public double getAveragePay() {
        return averagePay;
    }

    public boolean isFaceControl() {
        return isFaceControl;
    }


    public void order(){
        System.out.println("Order for something");
    }
    public void payForOrder(){
        System.out.println("Pay for order");
    }
    public void callForWaiter(){
        System.out.println("Call for a waiter");
    }

    @Override
    public String toString() {
        return "Guest{" +
                "permanent='" + permanent + '\'' +
                ", averagePay=" + averagePay +
                ", isFaceControl=" + isFaceControl +
                '}';
    }
}
