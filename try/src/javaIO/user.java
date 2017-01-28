package javaIO;

public class user implements java.io.Serializable{
	private int id;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public void setId(int id) {
		this.id = id;
	}
	private transient String pass;
	public user(){
		super();
	}
	public user(int id,String name,String pass){
		super();
		this.id=id;
		this.name=name;
		this.pass=pass;
	}
	public int getId(){
		return id;
	}
	public String toString(){
		return "User [id="+id+", name="+name+",password="+pass+"]";
	}
}
