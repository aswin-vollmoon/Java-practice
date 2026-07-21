package rev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

@FunctionalInterface
interface ParentInt
{
	void demo();
}
public class functionalInterfacce {
	void method1()
	{
		System.out.println("instance method ref");
	}
	
	static int method2()
	{
		System.out.println("static method ref");
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ArrayList<Integer>al=new ArrayList<>(Arrays.asList(20,30,45,65,3,34,65));
		Optional<Integer>a=al.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println(a);*/
		UnaryOperator<String> s=a->a;
		System.out.println(s.apply("java8"));

	   BinaryOperator<Integer> t=(x,y)->x+y;
	   System.out.println(t.apply(10, 10));
	
	   List<Integer> al=Arrays.asList(20,10,40,22,30);
	   System.out.println(al);
	   Comparator<Integer> c=(a,b)->b-a;
	   Collections.sort(al,c);
	   System.out.println(al);
	   
	   Runnable r=()->System.out.println("run method");
	   Thread d=new Thread(r);
	   d.start();
	   
	   
	   Thread d1=new Thread(()->System.out.println("hello"));
	   d1.start();
	
	
	   Second ob=new Second();
	   ParentInt p= ob :: method1;
	   p.demo();
	   
	   ParentInt p1= Second:: method2;
	   p1.demo();
	   
	   Predicate<String> p2= String :: isEmpty;
	   System.out.println(p2.test("abc"));
	   
	   
	   Function<String,String> f1= String :: toUpperCase;
	   System.out.println(f1.apply("java"));
	   
	   String s2=new String("hello");
	   
	}

}
