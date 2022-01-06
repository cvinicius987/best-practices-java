package overload.primitives;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionTypes {

	public static void main(String[] args) {
		
		overloadCollectionRemoveError();
		
		overloadCollectionRemove();
	}
	
	public static void overloadCollectionRemove() {
		
		List<Integer> list = new ArrayList<>();
		Set<Integer> sets = new TreeSet<>();
		
		System.out.println(" ============================= Normal ");
		
		for (int i = -3; i < 3; i++) {
			list.add(i);
			sets.add(i);
		}
		System.out.println("List: "+list);
		System.out.println("Set: "+sets);
		
		System.out.println(" === Remove first 3");
		
		for (int i = 0; i < 3; i++) {
			list.remove((Integer) i); //Using the remove(Object)
			sets.remove(i);
		}
		
		System.out.println("List: "+list);
		System.out.println("Set: "+sets);
	}
	
	public static void overloadCollectionRemoveError() {
		
		List<Integer> list = new ArrayList<>();
		Set<Integer> sets = new TreeSet<>();
		
		System.out.println(" ============================= With Error");
		
		for (int i = -3; i < 3; i++) {
			list.add(i);
			sets.add(i);
		}
		System.out.println("List: "+list);
		System.out.println("Set: "+sets);
		
		System.out.println(" === Remove first 3");
		
		for (int i = 0; i < 3; i++) {
			list.remove(i);
			sets.remove(i);
		}
		
		System.out.println("List: "+list);
		System.out.println("Set: "+sets+"\n");
	}
}