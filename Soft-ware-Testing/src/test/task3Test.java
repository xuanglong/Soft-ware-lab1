package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import work.task3.Condition;
import work.task3.Event;
import work.task3.Location;
import work.task3.Scene;

class task3Test
{
	private Scene scene;
	
	@BeforeEach
	private void init()
	{
		Location loc = new Location("dark",true,false,-1);
		Event eve = new Event("bilogy",true,100);
		Condition con1 = new Condition("bilogy");	
		Condition con2 = new Condition("shadow");
		Condition[] they = new Condition[] {con1, con2};
		scene  = new Scene(loc,eve,they);
	}

	@Test
    void testLocationName() {
        assertEquals("dark", scene.getLocation().getName());
    }
	@Test
	void testEventName() {
		 assertEquals("bilogy", scene.getEvent().getName());
	}
	@Test
    void testConditionName() {
        assertAll(
                () -> assertEquals("bilogy", scene.getLives()[0].getName()),
                () -> assertEquals("shadow", scene.getLives()[1].getName())
        );
    }
}
