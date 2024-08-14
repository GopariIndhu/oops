package Java;
import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<> ();
		hashSet.add("A");
		hashSet.add("B");
		boolean r1 = hashSet.add("C");
		System.out.println(r1);
		hashSet.add("C");
		hashSet.add("C");
		
		System.out.println(hashSet);
		
		hashSet.remove("A");
		
		//System.out.println("List contains C or not? " + hashSet.hashCode().contains("C"));
		
		System.out.println(hashSet);
	}

}
