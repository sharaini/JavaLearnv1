package collEctions;

public class user implements Comparable{
	private int id;
	public user(int id, String name){
		super();
		this.id=id;
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	public int compareTo(Object o){
		user u=(user)o;
		return(this.id<u.id)?-1:(this.id>u.id)?1:0;
	}
	public String toString(){
		return "User [id="+id+",name "+name+"]";
	}
}
