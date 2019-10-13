
public class Project {
	private String name;
	private String description;
	private double initialCost;
	
	//Constructor
	public Project() {
		
	}
	
	//Constructor
	public Project(String name) {
		this.name = name;
	}
	
	//Constructor
	public Project(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	//Getter for NAME
	public String getName() {
		return this.name;
	}
	
	//Getter for DESCRIPTION
	public String getDescription() {
		return this.description;
	}
	
	//Getter for INITIAL COST
	public double getInitialCost() {
		return this.initialCost;
	}
	
	//Setter for INITIAL COST
	public void setInitialCost(double cost) {
		this.initialCost = cost;
	}
		
	//Setter for NAME
	public void setName(String name) {
		this.name = name;
	}
	
	//Setter for DESCRIPTION
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	public String elevatorPitch (String name, String description ) {
		String elevatorPitch;
		
		elevatorPitch = this.name + ":" + this.description;
		
		return elevatorPitch;
	}
}
