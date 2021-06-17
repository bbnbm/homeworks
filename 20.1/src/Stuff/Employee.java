package Stuff;

import People.Human;

public class Employee extends Human {
    String position;
    int salary;
    int prize;
    int fine;
    int experience;
    int vacation;

    public Employee(String name, int age, String address, String male, String position, int salary, int prize, int fine, int experience, int vacation) {
        super(name, age, address, male);
        this.position = position;
        this.salary = salary;
        this.prize = prize;
        this.fine = fine;
        this.experience = experience;
        this.vacation = vacation;

    }

    public String getPosition() {
        return position;
    }

    public int getSalary() {
        return salary;
    }

    public int getPrize() {
        return prize;
    }

    public int getFine() {
        return fine;
    }

    public int getExperience() {
        return experience;
    }

    public int getVacation() {
        return vacation;
    }

    public void goToWork(){
        System.out.println("I'm going to work");
    }
    public void beLateToWork(){
        System.out.println("I'm being late to work");
    }
    public void goToVacation(){
        System.out.println("I go to vacation");
    }
}


