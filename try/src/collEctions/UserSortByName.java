package collEctions;

import java.util.Comparator;

public class UserSortByName implements Comparator{
	public int compare(Object o1,Object o2){
		user u1=(user)o1;
		user u2=(user)o2;
		String userName1=u1.getName().toUpperCase();
		String userName2=u2.getName().toUpperCase();
		
		return userName1.compareTo(userName2);
	}
}
