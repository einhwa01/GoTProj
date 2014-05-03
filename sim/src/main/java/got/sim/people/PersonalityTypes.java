package got.sim.people;

public enum PersonalityTypes {
	RUTHLESS(1),
	KIND(1),
	ANGRY(2),
	HAPPY(2),
	LOYAL(3),
	UNRELIABLE(3),
	NOBLE(4),
	UNDERHANDED(4),
	HONEST(5),
	DISHONEST(5);
	
	//can only have one of each type number
	private final int typeNumber;
	PersonalityTypes(int typeNumber){
		this.typeNumber = typeNumber;
	}
}
