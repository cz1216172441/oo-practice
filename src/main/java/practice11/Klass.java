package practice11;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class Klass extends Observable {

    private int number;
    private String displayName;
    private Student leader;
    private List<Student> students;

    public Klass(int number) {
        this.number = number;
        this.displayName = "Class " + number;
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
            leader = student;
            setChanged();
            notifyObservers(String.format(" I know %s become Leader of Class %d.", leader.getName(), number));
        } else {
            System.out.print("It is not one of us.\n");
        }
    }

    public void appendMember(Student student) {
        students.add(student);
        setChanged();
        notifyObservers(String.format(" I know %s has joined Class %d.", student.getName(), number));
    }

    public boolean isIn(Student student) {
        return student.getKlass() != null && number == student.getKlass().getNumber();
    }

}
