package practice03;

public class Student extends Person {

    private int klass;

    public Student(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    public void setKlass(int klass) {
        this.klass = klass;
    }

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public String introduce() {
        return String.format("I am a Student. I am at Class %d.", this.klass);
    }

}
