package de.jsfpraxis.detail.events;

import java.util.logging.Logger;

import javax.faces.event.AbortProcessingException;
import javax.faces.event.SystemEvent;
import javax.faces.event.SystemEventListener;



//@ListenerFor(systemEventClass = PostConstructApplicationEvent.class) // geht nicht in 2.0.2
public class MySystemEventListener implements SystemEventListener {

	private static Logger log = Logger.getLogger("de.jsfpraxis.detail.events.MySystemEventListener"); 
	
	
	public MySystemEventListener() {
		log.info("Konstruktor MySystemEventListener() aufgerufen"); 	
	}

	@Override
	public boolean isListenerForSource(Object object) {
		log.info("isListenerForSource() aufgerufen: " + object.getClass().getCanonicalName()); 
		return true;
	}

	@Override
	public void processEvent(SystemEvent se) throws AbortProcessingException {
		log.info("processEvent() aufgerufen: " + se.getClass().getCanonicalName()); 
	}

}
