package practice06;

public class Teacher extends Person {

    private int klass;

    public Teacher(String name, int age) {
        super(name, age);
        this.klass = -1;
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if (klass == -1) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
        return super.introduce() + String.format(" I am a Teacher. I teach Class %d.", klass);
    }
}
