package de.jsfpraxis.detail.mb;

import java.io.Serializable;
import java.util.logging.Logger;

public class MBViewScopeHandler implements Serializable {

	private static Logger logger = Logger.getLogger("de.jsfpraxis.detail.el.MBViewScopeHandler");
	
	public MBViewScopeHandler() {
		logger.info("MBViewScopeHandler() aufgerufen");
	}

	public String toString() {
		return getClass().getSimpleName() + "@" + hashCode();
	}
}
