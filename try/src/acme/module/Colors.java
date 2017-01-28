package acme.module;
//provides a typesafe implementation of constant data in the program
public enum Colors {
	Red("rgb(255,0,0)"),
	Yellow("rgb(255,255,0)"),
	Blue("rgb(0,0,255)");
	void setColor(String aColor){
		currentColor = aColor;
	}
	private Colors(String aColor){
		currentColor = aColor;
	}
	String getColors(){
		return currentColor;
	}
	private String currentColor;
}
