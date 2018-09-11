package de.jsfpraxis.detail.nav;

import java.io.IOException;
import java.util.logging.Logger;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;

public class NavigationsHandler {

	private static Logger log = Logger.getLogger("de.jsfpraxis.detail.nav.NavigationsHandler");
	
	private String eingabe;
	
	private int wert = 23;
	
	public String verteiler() {
		if (eingabe.equals("rot"))
			return "rot";
		else if (eingabe.equals("gelb"))
			return "gelb";
		else if (eingabe.equals("blau"))
			//return "/pages/nav/blau.hugo";
			return "/pages/nav/blau.xhtml?faces-redirect=true";
		else {
			log.info("bitte nochmal");
			eingabe = "bitte nochmal";
		}
		return "/pages/nav/hauptseite.xhtml";
	}
	
	public String rot() {
		return "rot";
	}
	
	public String dasBuch() {
		FacesContext context = FacesContext.getCurrentInstance(); 
		ExternalContext ec = context.getExternalContext();
		try {
			ec.redirect("http://www.jsfpraxis.de");
		} catch (IOException e) {
			return "failure";
		}
		context.responseComplete();
		return "success";
	}

	
	public void handleEvent(ComponentSystemEvent cse) {
		log.info("handleEvent() aufgerufen " + cse.getClass().getCanonicalName());
	}
	
	
	public String returnsNull() {
		log.info("return null");
		return null;
	}
	
	public String getEingabe() {
		return eingabe;
	}

	public void setEingabe(String eingabe) {
		this.eingabe = eingabe;
	}

	
	public int getWert() {
		return wert;
	}

	
}
