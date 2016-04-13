package data;

public interface StateDAO {
	public State getStateByName(String name);
	public State getStateByAbbreviation(String abbreviation);
	public void addState(State state);
	public State getStateCapitalPopulation (String population); 
	public State getCapitalLat (String latitude); 
	public State getCapitalLong (String longitude); 
	public State getTrivia (String trivia);
	State getStateID(Integer stateId);
}
