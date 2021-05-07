package GameProject.entities.abstracts;

public class Entity {
	public String name;
	
	public Entity() {
		
	}

	public Entity(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
