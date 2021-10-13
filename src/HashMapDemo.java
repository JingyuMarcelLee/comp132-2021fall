import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class HashMapDemo {
	
	
	public static void main(String[] args) {
		
		
		HashMap<String, Integer> studentToRow = new HashMap<>();
		
		studentToRow.put("ryan", 0);
		studentToRow.put( "marcel",0);
		studentToRow.put("myra", 1);
		studentToRow.put("chloe",1);
		studentToRow.put("aidan", 2);
		studentToRow.put("matt", 3);
		studentToRow.put("megan", 0);
		
		System.out.println(studentToRow.size());
		
		System.out.println(studentToRow);
		
		System.out.println(studentToRow.containsKey("liwen"));
		System.out.println(studentToRow.get("chloe"));
		
		System.out.println(studentToRow.get("megan"));
		
		System.out.println(studentToRow.containsValue(4));
		
		
		for( String name : studentToRow.keySet()) {
			System.out.println("name is " + name);
		}
		
		for(int row : studentToRow.values()) {
			System.out.println("row is " + row);
		}
		
		
		//print names in order 
		ArrayList<String> names = 
				new ArrayList<>(studentToRow.keySet());
		Collections.sort(names); 
		System.out.println(names);
		for( String name : names) {
			
			System.out.println(name + " sits in row " 
			+ studentToRow.get(name));
		}
		
		
		// remove all names of length > 4
		HashMap<String, Integer> studentToRowWithSmallNames = 
				new HashMap<>();
		for(String name : studentToRow.keySet()) {
			if(name.length() > 4) {
				//studentToRow.remove(name);
			}else {
				studentToRowWithSmallNames.put(name, 
						studentToRow.get(name));
			}
		}
		
		
		HashSet<String> namesSet = new HashSet<>();
		namesSet.addAll(studentToRow.keySet());
		System.out.println(namesSet);
		
		for(String name : namesSet) {
			System.out.println("hello " +name);
		}
		
		HashSet<Integer> rows =
				new HashSet<>(studentToRow.values());
		System.out.println(studentToRow.values());
		System.out.println(rows);
		
		HashMap<Integer, ArrayList<String> > rowToStudents =
				new HashMap<>();
		
		
		for(String name : studentToRow.keySet()) {
			int row = studentToRow.get(name);
			
			if(! rowToStudents.containsKey(row)) {
				rowToStudents.put(row, 
						new ArrayList<>());
			}
			ArrayList<String> theRow =
					rowToStudents.get(row);
			theRow.add(name);
			
		}
		System.out.println(rowToStudents);
		
		
	}

}
