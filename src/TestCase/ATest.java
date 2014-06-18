package TestCase;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



import TugasBesarRKPPL.A;
import TugasBesarRKPPL.AddAndSubInterface;

public class ATest {
	public A service;
	
	@BeforeClass
	public void awal(){
		System.out.println("Mulai Test");
		service = new A();
	}

	  @Test(enabled = false)
	  public void testAdd() {
	  System.out.println("@Test : testAdd()");
	  int result = service.add(10, 5);
	  Assert.assertEquals(result, 15);
	  }
	  
	  @Test
	  public void testSub() {
	System.out.println("@Test : testSub()");
		  int result = AddAndSubInterface.sub(10, 5);
		  Assert.assertEquals(result, 5);
	  }
  

}
