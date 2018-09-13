package de.jsfpraxis.detail.vc;

import java.util.logging.Logger;

import javax.faces.model.SelectItem;
import javax.inject.Named;

@Named
public class EnumHandler {
	
	private static Logger logger = Logger.getLogger("de.jsfpraxis.detail.vc.EnumHandler");
	
	private Familienstand familienstand;

	public String abschicken() {
		logger.info("Ausgewählter 'familienstand': " + familienstand);
		return null;
	}
	
	public Familienstand getFamilienstand() {
		return familienstand;
	}
	public void setFamilienstand(Familienstand familienstand) {
		this.familienstand = familienstand;
	}


	public Object[] getValues() {
		SelectItem[] items = new SelectItem[Familienstand.values().length];
		for (int i = 0; i < items.length; i++) {
			items[i] = new SelectItem(Familienstand.values()[i], Familienstand.values()[i].toString().toLowerCase());
		}
		return items;
		//return Familienstand.values();
	}
}
