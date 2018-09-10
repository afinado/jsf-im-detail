package de.jsfpraxis.detail.mb;

import java.util.logging.Logger;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean(eager = true)
@ApplicationScoped
public class MBApplicationScopeHandler {

	private static Logger logger = Logger.getLogger("de.jsfpraxis.detail.mb.MBApplicationScopeHandler");

	public MBApplicationScopeHandler() {
		logger.info("Instanz von " + this.getClass().getCanonicalName() + " erzeugt.");
	}
	
	
	
}
