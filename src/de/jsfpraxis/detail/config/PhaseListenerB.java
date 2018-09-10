package de.jsfpraxis.detail.config;

import java.util.logging.Logger;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

public class PhaseListenerB implements PhaseListener {
	
	private static Logger log = Logger.getLogger("de.jsfpraxis.detail.config.PhaseListenerB"); 

	public PhaseId getPhaseId() {
		return PhaseId.RENDER_RESPONSE;
	}

	public void afterPhase(PhaseEvent pe) {
		log.info("PhaseListernerB PhaseId after ist : " + pe.getPhaseId());
	}

	public void beforePhase(PhaseEvent pe) {
		log.info("PhaseListernerB PhaseId before ist : " + pe.getPhaseId());
	}

}
