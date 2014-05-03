package got.sim;

import got.sim.holdings.Building;
import got.sim.people.House;
import got.sim.people.Person;

import java.util.ArrayList;
import java.util.List;

public class CreateWorld {
	public CreateWorld(int size){
		int numberOfPeople = 20 / size;
		int numberOfBuildings = 10 / size;
		List<Person> people = createPeople(numberOfPeople);
		List<Building> buildings = createBuildings(numberOfBuildings);
		createHouses(people, buildings);
	}
	
	public List<Person> createPeople(int people){
		List<Person> peopleOfTheWorld = new ArrayList<Person>();
		
		return peopleOfTheWorld;
	}
	
	private List<Building> createBuildings(int buildings) {
		List<Building> buildingsOfTheWorld = new ArrayList<Building>();
		
		return buildingsOfTheWorld;		
	}
	
	public List<House> createHouses(List<Person> people, List<Building> buildings){
		List<House> houses = new ArrayList<House>();
		
		return houses;
	}
	
	public String outputWorld(){
		String theWorld = "";
		
		return theWorld;
	}
}
