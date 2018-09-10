package de.jsfpraxis.detail.vc;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

public class EingabeHandler {

	private String textValue;
	private Long longValue;
	private Double doubleValue;
	private Integer menueauswahl;
	private String email1;
	private String email2;
	
	public String abschicken() {
		return null;
	}

	public boolean validateText(String text) {
		return true;
	}

	
	public void validateEmail(FacesContext context, UIComponent component,
			Object value) throws ValidatorException {
		if (!((String) value).matches(".+@.+\\..+")) {
			throw new ValidatorException(new FacesMessage("Fehlerhafte E-Mail-Syntax"));
		}
	}
	
	public int getMin() {
		// hier eine komplizierte Minimumberechnung
		return 3;
	}

	public int getMax() {
		// hier eine komplizierte Maximumberechnung
		return 7;
	}
	
		// ab hier Getter und Setter
	public Double getDoubleValue() {
		return doubleValue;
	}
	public void setDoubleValue(Double doubleValue) {
		this.doubleValue = doubleValue;
	}

	public String getTextValue() {
		return textValue;
	}
	public void setTextValue(String textValue) {
		this.textValue = textValue;
	}

	public Long getLongValue() {
		return longValue;
	}
	public void setLongValue(Long longValue) {
		this.longValue = longValue;
	}

	public Integer getMenueauswahl() {
		return menueauswahl;
	}
	public void setMenueauswahl(Integer menueauswahl) {
		this.menueauswahl = menueauswahl;
	}

	public String getEmail1() {
		return email1;
	}
	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public String getEmail2() {
		return email2;
	}
	public void setEmail2(String email2) {
		this.email2 = email2;
	}
	
}
