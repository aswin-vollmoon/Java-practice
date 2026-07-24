package rev;

import java.util.ArrayList;
import java.util.Collections;

public class Main2 {

    public static void main(String[] args) {

        ArrayList<Student2> students = new ArrayList<>();

        students.add(new Student2(1, "Ravi", 85));
        students.add(new Student2(2, "Arun", 70));
        students.add(new Student2(3, "Kumar", 95));
        students.add(new Student2(4, "Bala", 60));

        Collections.sort(students, new NameComparator());

        for (Student2 s : students) {
            System.out.println(s);
        }
    }
}