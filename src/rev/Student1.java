package rev;

public class Student1 implements Comparable<Student1> {

    int id;
    String name;
    int marks;

    public Student1(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student1 s) {
        return Integer.compare(this.marks, s.marks);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + marks;
    }
}