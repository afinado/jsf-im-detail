package de.jsfpraxis.detail.events;

import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.event.ComponentSystemEvent;

@ManagedBean
public class SystemEventHandler {

	private static Logger log = Logger.getLogger("de.jsfpraxis.detail.events.SystemEventHandler"); 
	
	
	
	public SystemEventHandler() {
		log.info("Konstruktor SystemEventHandler() aufgerufen");
	}



	public void handleEvent(ComponentSystemEvent event) {
		log.info("handleEvent() aufgerufen " + event.getClass().getCanonicalName());
	}
	
    public void beforeEncode(ComponentSystemEvent event) {
    	log.info("beforeEncode() aufgerufen " + event.getClass().getCanonicalName());
//        UIOutput output = (UIOutput)event.getComponent();
//        output.setValue("The '" + event.getClass().getName() + "' event fired!");
    }
}
