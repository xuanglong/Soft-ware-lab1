package work.task3;

public class Scene
{
	private Location location;
	private Event event;
	private Condition[] lives;
	
	
	
	public Scene(Location location,Event event,Condition[] lives)
	{
		this.lives=lives;
		this.event=event;
		this.location=location;
		
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location=location;
	}
	public Event getEvent() {
		return event;
	}
	public void setEvent(Event event) {
		this.event=event;
	}
	public Condition[] getLives() {
		return lives;
	}
	public void setLives(Condition[] lives) {
		this.lives=lives;
	}
	 public String start() {
		 StringBuilder stringBuilder = new StringBuilder();
		 if(event.isActive()) {
		 stringBuilder.append(event.getName()).append("be killed").append("help");
		 stringBuilder.append(location.changeInitialEnvironment(event.getShape()));
		 if(location.isFog()) {
			 for(Condition condition : lives )
				 stringBuilder.append(condition.attack()) ;
		 }
		}
		 return stringBuilder.toString();	 
		 }
}
