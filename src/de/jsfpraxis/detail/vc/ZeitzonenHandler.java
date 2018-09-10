package de.jsfpraxis.detail.vc;

import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

public class ZeitzonenHandler {

	/**
	 * Alle dem JDK bekannten Zeitzonen berechnen.
	 * 
	 * @return Liste von TimeZone-Instanzen
	 */
	public List<TimeZone> getZeitzonen() {
		List<TimeZone> zeitzonen = new ArrayList<TimeZone>();
		String[] ids = TimeZone.getAvailableIDs();
		for (int i = 0; i < ids.length; i++) {
			zeitzonen.add(TimeZone.getTimeZone(ids[i]));
		}
		return zeitzonen;
	}
}
