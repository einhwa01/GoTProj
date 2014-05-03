package got.sim.people;

public enum PeopleFirstNames {
	WALDER("Walder", "m"), 
	ROBERT("Robert", "m"), 
	JOFFREY("Joffrey", "m"), 
	TYRION("Tyrion", "m"),
	JAIME("Jaime", "m"),
	JON("Jon", "m"),
	PETYR("Petyr", "m"),
	GREGOR("Gregor", "m"),
	DAVOS("Davos", "m"),
	ROBB("Robb", "m"),
	STANNIS("Stannis", "m"),
	BRAN("Bran", "m"),
	BRONN("Bronn", "m"),
	RAMSAY("Ramsay", "m"),
	THEON("Theon", "m"),
	AMORY("Amory", "m"),
	
	CATELYN("Catelyn", "f");
	
	private final String name;
	private final String gender;
	PeopleFirstNames(String name, String gender){
		this.name = name;
		this.gender = gender;
	}
	
	public String getName(){
		return name;
	}
	
	public String getGender(){
		return gender;
	}
}
