package de.jsfpraxis.detail.events;

import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "iaHandler")
public class ImmediateActionHandler {

	private static Logger logger = Logger.getLogger("de.jsfpraxis.detail.events.ImmediateActionHandler");
	
	private String data;
	
	
	public String speichern() {
		logger.info("speichern() aufgerufen");
		return null;
	}
	
	public String abbrechen() {
		logger.info("abbrechen() aufgerufen");
		return null;
	}

	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	
}
