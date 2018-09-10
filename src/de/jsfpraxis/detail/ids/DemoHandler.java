package de.jsfpraxis.detail.ids;

import java.util.List;
import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.component.html.HtmlForm;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.context.FacesContext;


@ManagedBean//(name = "demoHandler")
@RequestScoped
public class DemoHandler {
	
	private static Logger logger = Logger.getLogger("de.jsfpraxis.detail.ids.DemoHandler");
	
	private String eingabe;

	public String ok() {
		UIViewRoot view = FacesContext.getCurrentInstance().getViewRoot();
		HtmlForm form = (HtmlForm) view.findComponent("form");
		printComponents(form, 0);
		return null;
	}
	
	/*
	 * Für Beispiel ohne explizite Ids
	 */
	public String okWithoutId() {
		UIViewRoot view = FacesContext.getCurrentInstance().getViewRoot();
		for (UIComponent component : view.getChildren()) {
			if (component instanceof HtmlForm) {
				printComponents(component, 0);
			}
		}
		//aufgabeWerteingabe();
		return "";
	}

	/**
	 * Ausgabe mit Einrückung entsprechend Baumtiefe
	 */
	void printComponents(UIComponent comp, int indent) {
		String space = "";
		for (int i = 0; i < indent; i++) space += " ";
		logger.info("Komponente: " + space + comp.getId() + " " + comp);
		if (comp.getChildCount() != 0) {
			for (UIComponent component : comp.getChildren()) {
				printComponents(component, indent + 4);
			}
		}
	}

	
	/*
	 * Ändern der Aufforderung zur Werteingabe 
	 */
	public void aufgabeWerteingabe() {
		FacesContext context = FacesContext.getCurrentInstance();
		UIViewRoot view = context.getViewRoot();
		for (UIComponent component : view.getChildren()) {
			if (component instanceof HtmlForm) {
				List<UIComponent> children = component.getChildren();
				for (UIComponent component2 : children) {
					if (component2 instanceof HtmlOutputText) {
						((HtmlOutputText) component2).setValue("Bitte geben Sie einen Text ein!");
					}
				}
			}
		}
	}
	
	
	public String getEingabe() {
		return eingabe;
	}

	public void setEingabe(String eingabe) {
		this.eingabe = eingabe;
	}

}
