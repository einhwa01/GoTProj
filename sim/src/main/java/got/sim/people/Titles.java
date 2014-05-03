package got.sim.people;

public enum Titles {
	LORD("m"),
	LADY("f"),
	KING("m"),
	QUEEN("f"),
	PRINCE("m"),
	PRINCESS("f"),
	SER("m"),
	SQUIRE("m"),
	MAESTER("m");
	
	private final String gender;
	Titles(String gender){
		this.gender = gender;
	}
}
