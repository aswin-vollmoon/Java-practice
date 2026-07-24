package rev;

public class Student2 {

    int id;
    String name;
    int marks;

    public Student2(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + marks;
    }
}