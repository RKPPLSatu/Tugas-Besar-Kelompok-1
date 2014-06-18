package TestCase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import TugasBesarRKPPL.D;

public class DTest {
	public D service;
	
	@BeforeClass
	public void awal(){
		System.out.println("Mulai Test");
		service = new D();
	}

    @Test(dataProvider="Nanos")
    private int fixParsedValue(int maxWidth, int value) {
        if (maxWidth < 9) {
            Math.pow(10, (9 - maxWidth));
    }
		return value;
    }
}
