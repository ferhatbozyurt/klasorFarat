package ders2final;

import  org.junit.*;

public class MetinIslemleriTest {

	@Test
	public void testBuyukHarf() {
		String sonuc = MetinIslemleri.buyukHarf("farat");
		Assert.assertEquals("FARAT", sonuc);
	}

}
