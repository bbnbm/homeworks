package Faculty;

public class Course {
    private String name;
    private String created;
    private int id;
    private String bio;

    public Course(String name, String created, int id, String bio) {
        this.name = name;
        this.created = created;
        this.id = id;
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", created='" + created + '\'' +
                ", id=" + id +
                ", bio='" + bio + '\'' +
                '}';
    }
}
