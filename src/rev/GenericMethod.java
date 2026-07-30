package rev;

class Demo{

    public <T> void print(T data){

        System.out.println(data);

    }

}

public class GenericMethod 
{
	public static void main(String[] args) {

        Demo d=new Demo();

        d.print("Java");
        d.print(500);
        d.print(25.5);

    }

}
