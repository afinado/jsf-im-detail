package de.jsfpraxis.detail.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "i18nHandler")
@RequestScoped
public class I18nHandler {

	private double value = 0.0;

	/**
	 * Gibt die aktuelle Lokalisierung zurück. Im Beispiel
	 * <code>de<code> oder <code>en</code>.
	 */
	public String save() {
		Locale locale = FacesContext.getCurrentInstance().getViewRoot()
				.getLocale();
		return locale.toString();
	}


	public String getTitle() {
		FacesContext context = FacesContext.getCurrentInstance();
		ResourceBundle rb = context.getApplication().getResourceBundle(context, "msg");
		return rb.getString("title");
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}
}
