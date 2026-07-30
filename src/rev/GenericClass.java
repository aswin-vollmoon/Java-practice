package rev;

class Student<T,U>{

    T id;
    U name;

    Student(T id,U name){
        this.id=id;
        this.name=name;
    }

    void display(){
        System.out.println(id+" "+name);
    }
}

public class GenericClass {

    public static void main(String[] args) {

        Student<Integer,String> s=
                new Student<>(101,"Rahul");

        s.display();

    }

}