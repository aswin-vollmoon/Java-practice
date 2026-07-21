package rev;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class Methodreference {

    // 1. Static method
    public static int square(int number) {

        return number * number;
    }

    // 2. Instance method
    public void printName(String name) {

        System.out.println("Name : " + name);
    }

    public static void main(String[] args) {

        // ====================================
        // 1. Static Method Reference
        // ====================================

        Function<Integer, Integer> squareFunction =
                Methodreference::square;

        System.out.println(
                squareFunction.apply(5)
        );


        // ====================================
        // 2. Instance Method -
        // Particular Object
        // ====================================

        Methodreference obj =
                new Methodreference();

        Consumer<String> consumer =
                obj::printName;

        consumer.accept("Arun");


        // ====================================
        // 3. Instance Method -
        // Arbitrary Object of Particular Type
        // ====================================

        List<String> names =
                Arrays.asList(
                        "arun",
                        "kumar",
                        "priya"
                );

        names.stream()
             .map(String::toUpperCase)
             .forEach(System.out::println);


        // ====================================
        // 4. Constructor Reference
        // ====================================

        Function<String, Employee> employeeCreator =
                Employee::new;

        Employee employee =
                employeeCreator.apply("Karthik");

        employee.display();
    }
}