package collEctions;
//hashmap ,weakhashmap,treemap and hashtable
public class user2 {
 private int id;
 private String name;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
private String email;
 public user2(int id,String name,String email){
	 super();
	 this.id=id;
	 this.name=name;
	 this.email=email;
 }
 //equals has to compare state not identity
 public boolean equals(Object obj){
	 if(this==obj)return true;
	 if((obj==null)||(obj.getClass())!=(this.getClass()))
		 return false;
	 user2 user=(user2)obj;
	 return id==user.id&&(name!=null&&name.equals(user.name));
 }
 public int hashCode(){
	 final int seed=7;
	 int result=1;
	 result=result*seed+((name==null)?0:name.hashCode());
	 result=seed*result+id;
	 return result;
 }
 public String toString(){
	 return "User [id="+id+",Name="+name+",email="+email+"]";
 }
}
