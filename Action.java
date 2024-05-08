package secondhalf.Revision;
public enum Action {
	ROCK("R"), PAPER("P"), SCISSORS("S");

	private String id;

	private Action(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public static Action getActionbyId(String id) {
		for (Action a : values()) {
			if (a.id.equals(id))
				return a;
		}
		return null;
	}

}
