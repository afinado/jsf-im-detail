package de.jsfpraxis.detail.ids;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIViewRoot;
import javax.faces.component.html.HtmlInputText;
import javax.faces.context.FacesContext;


@ManagedBean(name = "inputHandler")
@RequestScoped
public class InputHandler {

	private String eingabe;

	/**
	 * Action-Methode
	 */
	public String abschicken() {
		UIViewRoot view = FacesContext.getCurrentInstance().getViewRoot();
		HtmlInputText eingabeKomponente = (HtmlInputText) view.findComponent("meinFormular:eingabe");

		if (eingabe.equals("")) {
			//eingabeKomponente.setStyle("background-color: red;");
			eingabeKomponente.setStyle("background-image: url(../../images/eingabe-erforderlich.png);");
		} else {
			eingabeKomponente.setStyle("background-image: null;");
		}
		return "";
	}
	
	public String getEingabe() {
		return eingabe;
	}

	public void setEingabe(String eingabe) {
		this.eingabe = eingabe;
	}
}
