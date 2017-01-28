package generics;

public class Demo {
	/**
	 * enables java programmer to specify
	 * with a single method declaration a set of related methods
	 * and with a single class declaration a set of related types
	 * provides compile time type safety, you can call a single generic method with argument of different types
	 * based on the types of arguments compiler calls it 
	 */
	public void example(){
		Integer[] ints={1,2};
		Character[] chars = {'A','B','C'};
		printAnyArray(ints);
		printAnyArray(chars);
	}
	/**
	 * explicit type parameters must not be wild cards
	 * type parameter delimeted by ang brace preceding method signature
	 * tp or type variable is an identifier that specifies generic type name
	 * 
	 * @param anArray
	 */
	public static<E> void printAnyArray(E[] anArray){
		for(E element:anArray){
			System.out.println("Element"+element);
		}
	}
}
