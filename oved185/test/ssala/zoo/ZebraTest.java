package ssala.zoo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



class ZebraTest {

	
	@Test
	void genoveffaTsGenoveffa() {
		Zebra genoveffa = new Zebra("genoveffa");
		assertEquals("genoveffa", genoveffa.getName());
	}


}
