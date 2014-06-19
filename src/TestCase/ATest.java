package TestCase;


import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import TugasBesarRKPPL.A;

public class ATest {
A a;


@BeforeTest
public void init(){
	a = new A();
}

@Test
public void tesTambah(){
	Assert.assertEquals(10, a.add(5,5),0);
}

@Test
public void tesKurang(){
	Assert.assertEquals(5, a.sub(10,5),0);
}

}
