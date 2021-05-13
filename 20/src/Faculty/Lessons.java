package Faculty;

import Students.Students;

import java.util.Arrays;

public class Lessons {
    private String date;
    private Students[] students = new Students[0];
    private String course;
    private String hm;
    private String exam;

    public Lessons(String date, Students[] students, String course, String hm, String exam) {
        this.date = date;
        this.students = students;
        this.course = course;
        this.hm = hm;
        this.exam = exam;
    }


    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Students[] getStudents() {
        return students;
    }

    public void setStudents(Students[] students) {
        this.students = students;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getHm() {
        return hm;
    }

    public void setHm(String hm) {
        this.hm = hm;
    }

    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        this.exam = exam;
    }

    @Override
    public String toString() {
        return "Lessons{" +
                "date='" + date + '\'' +
                ", students=" + Arrays.toString(students) +
                ", course='" + course + '\'' +
                ", hm='" + hm + '\'' +
                ", exam='" + exam + '\'' +
                '}';
    }
}

