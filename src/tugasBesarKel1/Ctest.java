package tugasBesarKel1;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Ctest {
	
	C c;
	
	@BeforeTest
	public void init(){
		c = new C();
	}
	
	@Test
	public void tesTambah(){
		Assert.assertEquals(20, c.add (10,10),0);
	}
	
	@Test
	public void tesKurang(){
		Assert.assertEquals(5, c.sub (10,5),0);
	}
	
	@Test
	public void tesKali(){
		Assert.assertEquals(15, c.mul (5,3),0);
	}
	
	@Test
	public void tesBagi(){
		Assert.assertEquals(20, c.div (40,2),0);
	}
	
	@Test
	public void tesSisaBagi(){
		Assert.assertEquals(1, c.mod (4,3),0);
	}

}
