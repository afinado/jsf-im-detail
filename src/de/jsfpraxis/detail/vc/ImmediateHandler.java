package de.jsfpraxis.detail.vc;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

@ManagedBean
@SessionScoped
public class ImmediateHandler implements Serializable {

	private static Logger logger = Logger.getLogger("de.jsfpraxis.detail.vc.ImmediateHandler");
	
	private static final String LANG1 = "Deutsch";
	private static final String LANG2 = "Englisch";
	
	private String address;
	private String language = LANG1;
	private Map<String, String> addressLabels;
	private Map<String, String> languageLabels;


	
	public ImmediateHandler() {
		logger.info("Neuer ImmediateHandler erzeugt");
		addressLabels = new HashMap<String, String>(2);
		addressLabels.put(LANG1, "Anschrift");
		addressLabels.put(LANG2, "Address");
		languageLabels = new HashMap<String, String>(2);
		languageLabels.put(LANG1, "Sprache");
		languageLabels.put(LANG2, "Language");
	}

	public Integer action() {
		logger.info("abschicken() aufgerufen");
		return null;
	}


	public void languageChanged(ValueChangeEvent vce) {
		logger.info("languageChanged() aufgerufen");
		logger.info("Neuer Wert: " + vce.getNewValue());
		language = (String) vce.getNewValue();
		FacesContext.getCurrentInstance().renderResponse();
	}

	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	
	public String[] getLanguages() {
		return new String[] { LANG1, LANG2};
	}

	
	public Map<String, String> getAddressLabels() {
		return addressLabels;
	}

	
	public Map<String, String> getLanguageLabels() {
		return languageLabels;
	}
	

}
