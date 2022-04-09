package work.task3;

public class Condition
{

	private String name;
	
	
	public Condition(String name)
	{
		this.name=name;

	}


	public String getName() {
		return name;
	}
	public void setName( String name) {
		this.name=name;
	}
	public String attack() {
		return name + "kill";
	}
	public String help() {
		return name + "shout";
	}
	public String run() {
		return name + "move";
	}
	public String waitting() {
		return name + "rotate";
	}
}
