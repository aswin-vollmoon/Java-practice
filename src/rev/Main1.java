package rev;

import java.util.ArrayList;
import java.util.Collections;

public class Main1 {

    public static void main(String[] args) {

        ArrayList<Student1> students = new ArrayList<>();

        students.add(new Student1(1, "Ravi", 85));
        students.add(new Student1(2, "Arun", 70));
        students.add(new Student1(3, "Kumar", 95));
        students.add(new Student1(4, "Bala", 60));

        Collections.sort(students);

        for (Student1 s : students) {
            System.out.println(s);
        }
    }
}