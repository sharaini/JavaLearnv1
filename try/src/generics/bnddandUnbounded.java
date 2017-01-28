package generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * upper bounded if you write <? extends Number> any field or sub class of the field Number
 * any class can be upper or lower classes hierarcy in bounded wild card
 * 
 * lower bound if arg can be of that field or super class of that field like <? super Integer> 
 * @author Sharath
 * in generic prog ? means unknown type
 * used as type of field,localvar,
 * 
 * every reference type is subtype of an object
 * subs principle can provide value any subtype of expected type
 */
public class bnddandUnbounded {
	public void example(){
		List<Integer> li=Arrays.asList(1,5,9);
		System.out.println("sum = "+add(li));
		List<Double> ld=Arrays.asList(5.2,5.3,5.4);
		System.out.println("sum = "+add(ld));
		printonlyintorsuper(new ArrayList<Integer>());
		//printonlyintorsuper(new ArrayList<Double>());
		List<Integer> myList=new ArrayList<Integer>();
		myList.add(1);
		myList.add(2);
		myList.add(3);
		wildcardprintList(myList);
		wildcardprintList(Arrays.asList("hey","hello"));
		
	}
	public static double add(List<? extends Number> list){
		double s=0.0;
		for(Number n:list)s+=n.doubleValue();
		return s;
	}
	public static void wildcardprintList(List<?> list){
		for(int i=0,n=list.size();i<n;i++){
			if(i>0)System.out.print(",");
			Object o=list.get(i);
			System.out.print(o.toString());
		}
		System.out.print("\n");
	}
	public static void printonlyintorsuper(List<? super Integer> list){
		System.out.println(list);
	}
}
