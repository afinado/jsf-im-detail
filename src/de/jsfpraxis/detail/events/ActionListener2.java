package de.jsfpraxis.detail.events;

import java.util.Iterator;
import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlInputTextarea;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

public class ActionListener2 implements ActionListener {

	public void processAction(ActionEvent ae) throws AbortProcessingException {
		HtmlInputTextarea text = null;
		List<UIComponent> components = ae.getComponent().getParent().getChildren();
		for (Iterator<UIComponent> iter = components.iterator(); iter.hasNext();) {
			UIComponent element = (UIComponent) iter.next();
			if (element.getId().equals("textarea")) {
				text = (HtmlInputTextarea) element;
			}
		}
		text.setValue(((String) text.getValue())
				.concat("processAction() von ActionListener2 aufgerufen.\n"));
	}
}
