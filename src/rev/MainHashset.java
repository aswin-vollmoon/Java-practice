package rev;

public class MainHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyHashset<String> set = new MyHashset<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Apple"); // Duplicate won't be added

        set.print();

        System.out.println("Contains Banana? " + set.contains("Banana"));

        set.remove("Banana");
        System.out.println("Contains Banana after removal? " + set.contains("Banana"));

        set.print();

	}

}
