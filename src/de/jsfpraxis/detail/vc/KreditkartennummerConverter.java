package de.jsfpraxis.detail.vc;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

/**
 * Konvertierer für Kreditkartennummern.
 * Es soll sowohl das Leerzeichen als auch das '-' als Trenner verwendet
 * werden können.
 */
@FacesConverter("kreditkartenkonvertierer")
//@FacesConverter(forClass = de.jsfpraxis.detail.vc.Kreditkartennummer.class)
public class KreditkartennummerConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		// wir prüfen nur ein bisschen und lassen den Rest den Konstruktor machen
		Kreditkartennummer nummer = null;
		String[] quads = null;
		if (value.indexOf('-') != -1) {
			quads = value.trim().split("-");
		} else {
			quads = value.trim().split(" ");
		}
		if (quads.length != 4) {
			FacesMessage message = 
				new FacesMessage(FacesMessage.SEVERITY_ERROR, 
						"Keine Kreditkartennummer", "Keine Kreditkartennummer");
			throw new ConverterException(message);
		}
		try {
			nummer = new Kreditkartennummer(quads[0], quads[1], quads[2], quads[3]);	
		} catch (Exception e) {
			FacesMessage message = 
				new FacesMessage(FacesMessage.SEVERITY_ERROR, 
						"Keine Kreditkartennummer", "Keine Kreditkartennummer");
			throw new ConverterException(message);
		}
		return nummer;
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		return ((Kreditkartennummer) value).toString();
	}

}
