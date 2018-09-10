package de.jsfpraxis.detail.vc;

import java.util.ResourceBundle;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.LengthValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

public class MeldungenHandler {

	private String text;

	/**
	 * Dieser Validierer prüft für die Input-Komponente bei vorhandenem
	 * LengthValidator, ob Min/Max gerade so erreicht wurden und erzeugt dann
	 * eine Info-Message.
	 */
	public void validateText(FacesContext context, UIComponent component,
			Object value) throws ValidatorException {
		int min = 0, max = 0;
		int length = ((String) value).length();
		Validator[] validator = ((UIInput) component).getValidators();
		String mb = context.getApplication().getMessageBundle();
		ResourceBundle rb = ResourceBundle.getBundle(mb);
		for (int i = 0; i < validator.length; i++) {
			if (validator[i] instanceof LengthValidator) {
				LengthValidator lv = (LengthValidator) validator[i];
				min = lv.getMinimum();
				max = lv.getMaximum();
				if (length == min || length == max) {
					String message = rb.getString("de.jsfpraxis.MINMAX");
					String messageDetail = rb
							.getString("de.jsfpraxis.MINMAX_detail");
					context.addMessage(component.getClientId(context),
							new FacesMessage(FacesMessage.SEVERITY_INFO,
									message, messageDetail));
				}
			}
		}
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
