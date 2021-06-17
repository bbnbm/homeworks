package Stuff;

public class Chief  extends Employee{
    String menu;
    String type;
    String awards;

    public Chief(String name, int age, String address, String male, String position, int salary, int prize, int fine, int experience, int vacation, String menu, String type, String awards) {
        super(name, age, address, male, position, salary, prize, fine, experience, vacation);
        this.menu = menu;
        this.type = type;
        this.awards = awards;
    }

    public String getMenu() {
        return menu;
    }

    public String getType() {
        return type;
    }

    public String getAwards() {
        return awards;
    }

    public void goToSpecies(){
        System.out.println("I'm going to Market");
    }
    public void researchMeal(){
        System.out.println("I'm researching for a new meal");
    }
    public void cookMeal(){
        System.out.println("I'm cooking meal");
    }

    @Override
    public String toString() {
        return "Chief{" +
                "menu='" + menu + '\'' +
                ", type='" + type + '\'' +
                ", awards='" + awards + '\'' +
                '}';
    }
}
