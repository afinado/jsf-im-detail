package de.jsfpraxis.detail.vc;

import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class KundeHandler {

	private static Logger logger = Logger.getLogger("de.jsfpraxis.detail.vc.KundeHandler");

	private Kunde kunde;
	
	
	
	public KundeHandler() {
		logger.info("KundenHandler angelegt");
		kunde = new Kunde();
	}


	public String speichern() {
		logger.info("Speichere Kunden " + kunde);
		return "bean-validation";
	}

	
	public Kunde getKunde() {
		return kunde;
	}
	public void setKunde(Kunde kunde) {
		this.kunde = kunde;
	}
	
}
