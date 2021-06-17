package Stuff;

public class Security {
    String armed;
    String typeOfArm;

    public Security(String armed, String typeOfArm) {
        this.armed = armed;
        this.typeOfArm = typeOfArm;
    }

    public String getArmed() {
        return armed;
    }

    public String getTypeOfArm() {
        return typeOfArm;
    }

    public void faceControl(){
        System.out.println("I'm on face control");
    }
    public void kickOut(){
        System.out.println("Kick out people");
    }
}
