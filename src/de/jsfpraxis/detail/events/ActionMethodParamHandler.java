package de.jsfpraxis.detail.events;

import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ActionMethodParamHandler {

	private static Logger logger = Logger.getLogger("de.jsfpraxis.detail.events.ActionMethodParamHandler");
	
	
	public String action() {
		logger.info("action() aufgerufen");
		return null;
	}

	public String action(String text) {
		logger.info("action(String \"" + text +"\") aufgerufen");
		return null;
	}
	
	public String action(Integer i) {
		logger.info("action(Integer " + i  +") aufgerufen");
		return null;
	}
	
	public Integer[] getNumbers() {
		return new Integer[] {1,2,3,4,5,6,7,8,9,10};
	}

}
