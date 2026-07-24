package rev;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialization {

    public static void main(String[] args) {

        try (
            FileInputStream file =
                    new FileInputStream("employee.ser");

            ObjectInputStream input =
                    new ObjectInputStream(file)
        ) {

            Emp employee =
                    (Emp) input.readObject();

            System.out.println(
                    "Employee object deserialized successfully"
            );

            employee.display();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}