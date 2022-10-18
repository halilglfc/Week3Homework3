package homework3.entities;

public class Trainers {
	int id;
	String name;
	
	public Trainers() {
		
	}
	
	public Trainers(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
