package collEctions;

import java.util.*;

public class listexample {
	Vector v;
	public listexample(){
		v= new Vector();
	}
	//int collec is root interface in collection hierarchy
	/**
	 * set ,queue and list is derived set defines a collection which doesn't contain duplicates
	 * list is an ordered collection that contain duplicate elements
	 * list is imp by arraylist,linkedlist(eff inse and removal) and vector(not eff ins)
	 * al and vl is resizable  v is synchronized(thread safe)
	 * whereas al is not
	 */
	public void add(){
		v.add("1");
		v.add("2");
	}
	public void example(){
		for(Object s:v){
			System.out.println(s);
		}
		String[] colors={"red","blue","white"};
		List listColors=Arrays.asList(colors);
		List randomlist = new ArrayList();
		randomlist.add(new Integer(2));
		randomlist.add(new Double(2.4));
		randomlist.add("Hello");
		System.out.println("\n\nRandom list");
		for(Object o:randomlist){
			System.out.println(o);
		}
		/**
		 * set is a collection that cannot contain duplicate elements
		 * has methods implemented by collection
		 */
		List duplicates=new ArrayList();
		duplicates.add("Apple");
		duplicates.add("Banana");
		duplicates.add("Apple");
		Set dedup=new HashSet(duplicates);
		for(Object o:dedup){
			System.out.println(o);
		}
		/**
		 * Iterator in java is a traversing object
		 * made for collection and set
		 * access data without bothering imp of that collection
		 * list and set provides the iterator but map doesn't provide the iterator but can use the key set and valueset 
		 */
		List animals = new ArrayList();
		animals.add("Lion");
		animals.add("Tiger");
		animals.add("Bear");
		
		Iterator animaliter = animals.iterator();
		while(animaliter.hasNext()){
			System.out.println(animaliter.next());
		}
		for(Iterator<String> animalIter=animals.iterator();
				animalIter.hasNext();){
			String s=(String)animalIter.next();
			if(s.equals("Tiger")){
				animalIter.remove();
			}
			else
				System.out.println(s);
		}
	}
	
}
