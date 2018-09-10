package de.jsfpraxis.detail.mb;

import java.util.logging.Logger;

public class MBSessionScopeHandler {

	private static Logger logger = Logger.getLogger("de.jsfpraxis.detail.el.MBSessionScopeHandler");
	
	public MBSessionScopeHandler() {
		logger.info("MBSessionScopeHandler() aufgerufen");
	}

	public String toString() {
		return getClass().getSimpleName() + "@" + hashCode();
	}
}
