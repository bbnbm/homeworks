package Faculty;

import Students.Students;

import java.util.Arrays;

public class Group {
   private Students[] students;
   private String name;
   private String date;
   private String duration;
   private Course[] courses;

    public Group(Students[] students, String name, String date, String duration, Course[] courses) {
        this.students = students;
        this.name = name;
        this.date = date;
        this.duration = duration;
        this.courses = courses;
    }

    public Students[] getStudents() {
        return students;
    }

    public void setStudents(Students[] students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Course[] getCourses() {
        return courses;
    }

    public void setCourses(Course[] courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Group{" +
                "students=" + Arrays.toString(students) +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                ", duration='" + duration + '\'' +
                ", courses=" + Arrays.toString(courses) +
                '}';
    }
}

