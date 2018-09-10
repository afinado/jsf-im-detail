package de.jsfpraxis.detail.i18n;

import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.PhaseEvent;

@ManagedBean
public class PhaseListener {

	private static Logger logger = Logger.getLogger("de.jsfpraxis.detail.i18n.PhaseListener");
	
	public void beforePhase(PhaseEvent event) {
		logger.info("beforePhase() " + event.getPhaseId());
		logger.info("locale: " + FacesContext.getCurrentInstance().getViewRoot().getLocale());
	}
	
	public void afterPhase(PhaseEvent event) {
		logger.info("afterPhase() " + event.getPhaseId());
		logger.info("locale: " + FacesContext.getCurrentInstance().getViewRoot().getLocale());
	}
}
