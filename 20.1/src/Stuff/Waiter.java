package Stuff;

public class Waiter extends Employee {
    public Waiter(String name, int age, String address, String male, String position, int salary, int prize, int fine, int experience, int vacation) {
        super(name, age, address, male, position, salary, prize, fine, experience, vacation);

    }

    public void takeOrder(){
        System.out.println("Take an order");
    }
    public void giveOrder(){
        System.out.println("Give an order");
    }
    public void countOrder(){
        System.out.println("Count an order");
    }
}
