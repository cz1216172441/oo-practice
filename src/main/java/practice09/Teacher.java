package practice09;

public class Teacher extends Person {

    private Klass klass;

    public Teacher(int id, String name, int age) {
        super(id, name, age);
    }

    public Teacher(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public Klass getKlass() {
        return klass;
    }

    @Override
    public String introduce() {
        if (klass == null) {
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }
        return super.introduce() + String.format(" I am a Teacher. I teach Class %d.", klass.getNumber());
    }

    public String introduceWith(Student student) {
        if (student.getKlass().getNumber() == klass.getNumber()) {
            return super.introduce() + String.format(" I am a Teacher. I teach %s.", student.getName());
        }
        return super.introduce() + String.format(" I am a Teacher. I don't teach %s.", student.getName());
    }
}
