package People;

public class Human {
    String name;
    int age;
    String address;
    String male;

    public Human(String name, int age, String address, String male) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.male = male;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getMale() {
        return male;
    }

}
