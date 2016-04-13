package data;

public class State {
	private Integer stateID; 
	private String abbrev;
	private String name;
	private String capital;
	private String latitude;
	private String longitude;
	private String population;
	private String trivia; 

	public State() {
	}
	
	public State(Integer stateID,String abbreviation, String name, String capital, String latitude, String longitude, String population, String trivia) {
		this.stateID = stateID; 
		this.abbrev = abbreviation;
		this.name = name;
		this.capital = capital;
		this.latitude = latitude;
		this.longitude = longitude;
		this.population = population; 
		this.trivia = trivia; 
	}
	public Integer getStateID() {
		return stateID;
	}
	public String getTrivia() {
		return trivia;
	}
	public String getPopulation() {
		return population;
	}
	public String getAbbreviation() {
		return abbrev;
	}
	public String getName() {
		return name;
	}
	public String getCapital() {
		return capital;
	}
	public String getLatitude() {
		return latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setPopulation(String population) {
		this.population = population;
	}
	public void setAbbreviation(String abbreviation) {
		this.abbrev = abbreviation;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public void setTrivia(String trivia) {
		this.trivia = trivia;
	}
	public void setStateID(Integer stateID) {
		this.stateID = stateID;
	}

	@Override
	public String toString() {
		return "State [abbreviation=" + abbrev + ", name=" + name + ", capital=" + capital + "]";
	}

}
