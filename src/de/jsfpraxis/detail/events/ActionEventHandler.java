package de.jsfpraxis.detail.events;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "aeHandler")
public class ActionEventHandler {

	private String text = "";
	
	public String ok() {
		return "success";
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
}
