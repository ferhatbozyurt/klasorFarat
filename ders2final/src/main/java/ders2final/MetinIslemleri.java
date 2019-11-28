package ders2final;

import java.util.Locale;

public class MetinIslemleri {


	public static String buyukHarf(String metin) {
		
		return metin.toUpperCase(
				Locale.forLanguageTag("tr")
				);
	}

}
