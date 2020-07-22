package practice09;

import java.util.ArrayList;
import java.util.List;

public class Klass {

    private int number;
    private String displayName;
    private Student leader;
    private List<Student> students = new ArrayList<>();

    public Klass(int number) {
        this.number = number;
        this.displayName = "Class " + this.number;
    }

    public int getNumber() {
        return number;
    }

    public Student getLeader() {
        return leader;
    }

    public String getDisplayName() {
        return displayName;
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
