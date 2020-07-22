package practice11;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Teacher extends Person implements Observer {

    private List<Klass> classes;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
        this.classes = new ArrayList<>();
    }

    public Teacher(int id, String name, int age, List<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        for (Klass klass : classes) {
            klass.addObserver(this);
        }
    }

    public List<Klass> getClasses() {
        return classes;
    }

    @Override
    public String introduce() {
        if (classes.size() == 0) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
        StringBuilder classNums = new StringBuilder(String.valueOf(classes.get(0).getNumber()));
        if (classes.size() > 1) {
            for (int i = 1; i < classes.size(); i++) {
                classNums.append(String.format(", %d", classes.get(i).getNumber()));
            }
        }
        return super.introduce() + String.format(" I am a Teacher. I teach Class %s.", classNums.toString());
    }

    public boolean isTeaching(Student student) {
        boolean isTeaching = false;
        for (Klass klass : classes) {
            if (klass.isIn(student)) {
                isTeaching = true;
                break;
            }
        }
        return isTeaching;
    }

    public String introduceWith(Student student) {
        if (isTeaching(student)) {
            return super.introduce() + String.format(" I am a Teacher. I teach %s.", student.getName());
        }
        return super.introduce() + String.format(" I am a Teacher. I don't teach %s.", student.getName());
    }

    @Override
    public void update(Observable o, Object arg) {
        String tip = (String) arg;
        System.out.print(String.format("I am %s.%s\n", getName(), tip));
    }
}
