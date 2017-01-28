package collEctions;

import java.util.*;

/**
 * java collections framework is set of utility classes in java.util package
 * for working with collection of objects
 * 
 * no duplicates- Set int-hashset,linkedhashset,treeset
 * yes duplicates-List int-ArrayList and LinkedList
 * key value mapping-Map int-imp of HashMap-LinkedHashMap,TreeMap,HashTable,
 * @author Sharath
 *
 */
public class demo {
 public void example(){
	 String[] s={"mat","hat","cat"};
	 List myList = Arrays.asList(s);
	 Collections.sort(myList);
	 System.out.println("Sorted :"+myList);
	 Collections.reverse(myList);
	 System.out.println("reversed :"+myList);
	 Collections.shuffle(myList);
	 System.out.println("shuffled :"+myList);
	 
	 String[] copy=new String[3];
	 List listCopy= Arrays.asList(copy);
	 Collections.copy(listCopy, myList);
	 System.out.println("copy:"+listCopy);
	 Collections.fill(myList, "vtc");
	 System.out.println("fill: "+myList);
	 
 }
}
