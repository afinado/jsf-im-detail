package de.jsfpraxis.detail.mb;

import java.util.logging.Logger;

public class MBRequestScopeHandler {

	private static Logger logger = Logger.getLogger("de.jsfpraxis.detail.el.MBViewScopeHandler");
	
	public MBRequestScopeHandler() {
		logger.info("MBViewScopeHandler() aufgerufen");
	}

	public String toString() {
		return getClass().getSimpleName() + "@" + hashCode();
	}
}
