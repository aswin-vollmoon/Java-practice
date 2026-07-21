package rev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Al {
	String name;
	int score;
	

	public Players(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Players> al = new ArrayList<>(Arrays.asList(
		            new Players("A", 60),
		            new Players("B", 40),
		            new Players("C", 50),
		            new Players("D", 70),
		            new Players("E", 70)
		        ));
		 
		 al.sort(new Comparator<Players>() {
	            @Override
	            public int compare(Players p1, Players p2) {
	                if (p2.score != p1.score) {
	                    return Integer.compare(p2.score, p1.score); 
	                } else {
	                    return p1.name.compareTo(p2.name); 
	                }
	            }
	        });

	       
	        for (Players p : al) {
	            System.out.println("Name: " + p.name + ", Score: " + p.score);
	        }
		
		
	}

}
