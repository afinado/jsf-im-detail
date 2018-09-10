package de.jsfpraxis.detail.events;

import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlInputTextarea;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

public class ActionListener1 implements ActionListener {

	public void processAction(ActionEvent ae) throws AbortProcessingException {
		HtmlInputTextarea text = null;
		List<UIComponent> components = ae.getComponent().getParent().getChildren();
		for (UIComponent element : components) {
			if (element.getId().equals("textarea")) {
				text = (HtmlInputTextarea) element;
			}
		}
		text.setValue(text.getValue() + "processAction() von ActionListener1 aufgerufen.\n");
	}
}
