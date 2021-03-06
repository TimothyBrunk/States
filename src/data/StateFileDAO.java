package data;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class StateFileDAO implements StateDAO {
	private static final String FILE_NAME="/WEB-INF/states.csv";
	private List<State> states = new ArrayList<>();
	/*
	 * Use Autowired to have Spring inject an instance
	 * of an ApplicationContext into this object after
	 * creation.  We will use the ApplicationContext to
	 * retrieve an InputStream so we can read from a 
	 * file.
	 */
	@Autowired 
	private ApplicationContext ac;

	/*
	 * The @PostConstruct method is called by Spring after 
	 * object creation and dependency injection
	 */
	@PostConstruct
	public void init() {
		// Retrieve an input stream from the application context
		// rather than directly from the file system
		try (
				InputStream is = ac.getResource(FILE_NAME).getInputStream();
				BufferedReader buf = new BufferedReader(new InputStreamReader(is));
			) {
			String line = buf.readLine();
			while ((line = buf.readLine()) != null) {
				int id;
				String[] tokens = line.split(",");
				String stateId = tokens[0];
				id = Integer.parseInt(stateId); 
				String abbrev = tokens[1];
				String name = tokens[2];
				String capital = tokens[3];
				String latitude = tokens[4];
				String longitude = tokens[5];
				String population = tokens[6]; 
				String trivia = tokens[7]; 
				states.add(new State(stateId, abbrev, name, capital, latitude, longitude, population, trivia)); 
			
			}
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	@Override
	public State getStateID(Integer stateId) {
		State s = null;
		for (State state : states) {
			if (state.getStateID().(stateId)) { 
				s = state;
				break;
			}
		}
		return s;
	}
	@Override
	public State getStateByName(String name) {
		State s = null;
		for (State state : states) {
			if (state.getName().equalsIgnoreCase(name)) {
				s = state;
				break;
			}
		}
		return s;
	}
	@Override
	public State getStateByAbbreviation(String abbrev) {
		State s = null;
		for (State state : states) {
			if (state.getAbbreviation().equalsIgnoreCase(abbrev)) {
				s = state;
				break;
			}
		}
		return s;
	}
	@Override
	public State getStateCapitalPopulation(String population) {
		State s = null;
		for (State state : states) {
			if (state.getPopulation().equals(" ")) {
				s = state;
				break;
			}
		}
		return s;
	}
	@Override
	public State getCapitalLat(String latitude) {
		State s = null;
		for (State state : states) {
			if (state.getLatitude().equals(" ")) {
				s = state;
				break;
			}
		}
		return s;
	}
	@Override
	public State getCapitalLong(String longitude) {
		State s = null;
		for (State state : states) {
			if (state.getLongitude().equals(" ")){
				s = state;
				break;
			}
		}
		return s;
	}
		@Override
		public State getTrivia(String trivia) {
			State s = null;
			for (State state : states) {
				if (state.getTrivia().equals(" ")) {
					s = state;
					break;
				}
			}
			return s;
		}
	
	@Override
	public void addState(State state) {
		states.add(state);
	}
}

