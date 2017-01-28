package collEctions;

import java.util.*;

public class demo2 {
 public void example(){
	 user2 u1=new user2(100,"ted","sharath@yahoo");
	 user2 u2=new user2(100,"ted","sharath@yahoo");
	 
	 System.out.println("Users equals"+u1.equals(u2));
	 
	 Map users= new HashMap();
	 users.put(u1,u1);
	 users.put(u2, u2);
	 System.out.println("Contents of HashMap"+users);
	 System.out.println("Hashmap size"+users.size());
 }
}
