package de.jsfpraxis.detail.events;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;

@ManagedBean(name = "vceHandler")
@SessionScoped
public class ValueChangeEventHandler implements Serializable {

	private String text = "";
	private String ausgabe = "";
	private int reqNb = 0;
	private int reqNbChanged = 0;

	public void textChanged(ValueChangeEvent vce) {
		ausgabe = "Text hat sich geändert. " 
			+ "War: '" + vce.getOldValue() + "'. " 
			+ "Ist: '" + vce.getNewValue() + "'.";
		reqNbChanged = reqNb;
	}

	public String ok() {
		if (reqNb != reqNbChanged)
			ausgabe = "";
		reqNb++;
		return "";
	}

	// ab hier nur Getter und Setter
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getAusgabe() {
		return ausgabe;
	}

	public void setAusgabe(String ausgabe) {
		this.ausgabe = ausgabe;
	}

}
