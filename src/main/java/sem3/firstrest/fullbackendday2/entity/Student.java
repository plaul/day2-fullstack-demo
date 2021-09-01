package sem3.firstrest.fullbackendday2.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String fullStudentName;

    public Student() {
    }

    public Student(String name) {
        this.fullStudentName = name;
    }

    public String getFullStudentName() {
        return fullStudentName;
    }

    public void setFullStudentName(String fullStudentName) {
        this.fullStudentName = fullStudentName;
    }

    public int getId() {
        return id;
    }


}
