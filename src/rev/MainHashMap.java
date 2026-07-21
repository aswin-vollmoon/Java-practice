package rev;

public class MainHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyHashMap<String, Integer> map = new MyHashMap<>();

        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);
        map.put("Apple", 40); // Overwrites the previous value for "Apple"

        System.out.println("Apple = " + map.get("Apple")); // 40
        System.out.println("Contains 'Banana'? " + map.containsKey("Banana")); // true

        map.remove("Banana");
        System.out.println("Contains 'Banana' after removal? " + map.containsKey("Banana")); // false

        map.print(); // Prints remaining entries

	}

}
