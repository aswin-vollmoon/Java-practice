package rev;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {

    public static void main(String[] args) {

        Emp employee =
                new Emp(101, "Karthik", 50000);

        try (
            FileOutputStream file =
                    new FileOutputStream("employee.ser");

            ObjectOutputStream output =
                    new ObjectOutputStream(file)
        ) {

            output.writeObject(employee);

            System.out.println(
                    "Employee object serialized successfully"
            );

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}