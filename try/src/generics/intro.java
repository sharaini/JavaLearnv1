package generics;
import java.util.*;
public class intro {
 public void example(){
	 List<String> myList = new ArrayList<String>();
	 Map<Integer,String> empMap=new HashMap<Integer,String>();
	 empMap.put(1, "Bob");
	 empMap.put(2, "Dorris");
	 empMap.put(3, "Jane");
	 for(Map.Entry<Integer, String> entry:empMap.entrySet())
	 System.out.println("Key"+entry.getKey()+"Value"+entry.getValue());
	 for(Map.Entry entry:empMap.entrySet()){
		 
	 }
	 for(Integer keys:empMap.keySet()){
		 
	 }
	 List testList=new ArrayList();
	 testList.add(new Integer(6));
	 
	 //String string=(String)testList.get(0); //gives casting error instead use generics
	 
	 List<Integer> st=new ArrayList<Integer>();
	 st.add(new Integer(6));
	 
	 //String string =(String)st.get(0);//gives compile time error which is power of generics
	 
	 
 }
}
