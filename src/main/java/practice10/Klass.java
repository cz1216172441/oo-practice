package practice10;

import java.util.ArrayList;
import java.util.List;

public class Klass {

    private int number;
    private String displayName;
    private Student leader;
    private List<Student> students;

    public Klass(int number) {
        this.number = number;
        this.displayName = "Class " + this.number;
        this.students = new ArrayList<>();
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return displayName;
    }

    public Student getLeader() {
        return leader;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void assignLeader(Student student) {
        if (students.contains(student)) {
            this.leader = student;
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student) {
        students.add(student);
    }
}
