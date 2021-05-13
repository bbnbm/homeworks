package Students;

public class Students {
    private int birth;
    private String surname;
    private String name;
    private String sex;
    private int age;

    public Students(int birth, String surname, String name, String sex, int age) {
        if (birth > 0){
            setBirth(birth);
        }
        else {
            System.out.println("Error");
        }
        this.birth = birth;
        this.surname = surname;
        this.name = name;
        this.sex = sex;
        this.age = 2021 - birth;
    }

    public int getBirth() {
        return birth;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "birth=" + birth +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
