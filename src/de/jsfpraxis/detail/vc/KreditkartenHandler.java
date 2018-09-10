package de.jsfpraxis.detail.vc;

import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.convert.Converter;

@ManagedBean
public class KreditkartenHandler {

	private static Logger logger = Logger.getLogger("de.jsfpraxis.detail.vc.KreditkartenHandler");
	
	private Kreditkartennummer kreditkartennummer;

	
	public String ok() {
		logger.info("Gelesene Kreditkartennummer: " + kreditkartennummer);
		return null;
	}
	
	
	public Kreditkartennummer getKreditkartennummer() {
		return kreditkartennummer;
	}

	public void setKreditkartennummer(Kreditkartennummer kreditkartennummer) {
		this.kreditkartennummer = kreditkartennummer;
	}
	
	public Converter getConverter() {
		return new KreditkartennummerConverter();
	}
}
