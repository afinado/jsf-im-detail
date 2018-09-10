package de.jsfpraxis.detail.config;

import java.io.Serializable;
import java.util.Map;
import java.util.logging.Logger;

import javax.faces.FactoryFinder;
import javax.faces.application.Application;
import javax.faces.application.ApplicationFactory;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;

public class ConfigHandler implements Serializable {
	
	private static final long serialVersionUID = 1L;


	private static Logger logger = Logger.getLogger("de.jsfpraxis.detail.config.ContextHandler");

	
	private static Application application;
	
	static {
		ApplicationFactory factory = (ApplicationFactory) FactoryFinder.getFactory(FactoryFinder.APPLICATION_FACTORY);
		application = factory.getApplication();
	}
	
	
	public String getStateSavingMethod() {
		//return FacesContext.getCurrentInstance().getExternalContext().getInitParameter("javax.faces.STATE_SAVING_METHOD");
		return application.getStateManager().isSavingStateInClient(FacesContext.getCurrentInstance()) ? "client" : "server";
	}

	
	public String getConfigFiles() {
		return FacesContext.getCurrentInstance().getExternalContext().getInitParameter("javax.faces.CONFIG_FILES");
	}
	
	
	public String getProjectStage() {
		//return FacesContext.getCurrentInstance().getExternalContext().getInitParameter("javax.faces.PROJECT_STAGE");
		return application.getProjectStage().toString();
	}
	
	
	public String getPartialStateSaving() {
		//return FacesContext.getCurrentInstance().getExternalContext().getInitParameter("javax.faces.PARTIAL_STATE_SAVING");
		return FacesContext.getCurrentInstance().getAttributes().get("partialStateSaving").toString();
	}
	
	public void handleEvent(ComponentSystemEvent cse) {
		Map<Object, Object> attributes = FacesContext.getCurrentInstance().getAttributes();
		for (Object key : attributes.keySet()) {
			logger.info(key.toString() + ": " + attributes.get(key).toString());
		}
	}
}
