package work.task3;

public class Location
{
	private int environment;
	private boolean fog;
	private boolean sight;
	private int initialEnvironment;
	private String name;
	
	public Location(String name,boolean fog,boolean sight,int environment)
	{
		this.name = name;
		this.initialEnvironment=environment;
		this.fog=fog;
		this.sight=sight;
		
	}

	public int getEnvironment() {
		return environment;
	}
	public void setEnvironment(int environment) {
		this.environment=environment;
	}
	public boolean isFog() {
		return fog;
	}
	public void setFog(boolean fog) {
		this.fog=fog;
	}
	public boolean isSight() {
		return sight;
	}
	public void setSight(boolean sight) {
		this.sight=sight;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String changeInitialEnvironment(int environmentchange) {
		this.environment += environmentchange;
		StringBuilder stringBuilder = new StringBuilder();
		if(environmentchange <0) {
			stringBuilder.append(fog + "is fog");
		}
		else {
			stringBuilder.append(sight + "is sight");
		}
		 return stringBuilder.toString();
	}
}
