package de.jsfpraxis.detail.events;

import java.util.logging.Logger;

import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import javax.faces.event.PhaseListener;

/**
 *  Einfacher Phase-Listener, der zu Beginn und am Ende 
 *  jeder Phase die Phasen-Id ausgibt.
 *  Dazu muss er in faces-config.xml registriert werden,
 *  oder mit <f:phaseListener>
 */
public class MyPhaseListener implements PhaseListener {
	
	private static Logger log = Logger.getLogger("de.jsfpraxis.detail.events.MyPhaseListener"); 

	public PhaseId getPhaseId() {
		// wir sind an allen Phasen interessiert
		return PhaseId.ANY_PHASE;
	}

	public void afterPhase(PhaseEvent pe) {
		log.info("After Phase : " + pe.getPhaseId());
	}

	public void beforePhase(PhaseEvent pe) {
		log.info("Before Phase : " + pe.getPhaseId());
	}

}
