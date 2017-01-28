package acme.module;

public enum Car {
	Acme("Legend","2013"),
	Honda("Accord","2013"),
	Toyota("Camry","2013"),
	Ford("Tauras","2013"),
	Nissan("Maxima","2013");
	
	Car(String model,String year){
		this.model=model;
		this.year=year;
	}
	
	private final String model;
	private final String year;
	
	public String getModel() {
		return model;
	}
	public String getYear() {
		return year;
	}
}
