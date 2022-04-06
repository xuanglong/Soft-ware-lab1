package work.task3;

public class Event
{
	private String name;
	private boolean active;

	private int shape;
	
	public Event(String name, boolean active,int shape)
	{
		this.name=name;
		this.active=active;
		this.shape=shape;

	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
        this.name = name;
    }
	public boolean isActive() {
        return active;
    }
	public void setActive(boolean active) {
        this.active = active;
    }

	public int getShape() {
		return shape;
	}
	public void setShape(int shape) {
		this.shape = shape;
	}

}
