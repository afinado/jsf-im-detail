package de.jsfpraxis.detail.i18n;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.event.AjaxBehaviorEvent;

@ManagedBean//(name = "myLocaleHandler")
@SessionScoped // sonst bei jedem Request die Default-Lokalisierung
public class MyLocaleHandler implements Serializable {
	
	private static Logger logger = Logger.getLogger("de.jsfpraxis.detail.i18n.MyLocaleHandler");
	
	private String locale;
	
	
	public MyLocaleHandler() {
		locale = FacesContext.getCurrentInstance().getApplication().getDefaultLocale().toString();
	}

	
	public List<String> getLocales() {
		logger.info("getLocales() aufgerufen");
		List<String> l = new ArrayList<String>();
		for (Iterator<Locale> iter = FacesContext.getCurrentInstance().getApplication().getSupportedLocales(); iter.hasNext(); ) { 
			l.add(iter.next().toString());
		}
		return l;
	}
	
	
	public String changeLocale() {
		logger.info("changeLocale() aufgerufen");
		FacesContext.getCurrentInstance().getViewRoot().setLocale(new Locale(locale));
		return null;
	}

	public void toggle(ActionEvent ae) {
		logger.info("toggle() aufgerufen");
		logger.info("locale ist " + locale);
		if (locale.equals("de")) {
			locale = "en";
			FacesContext.getCurrentInstance().getViewRoot().setLocale(new Locale("en"));
			logger.info("auf en gesetzt");
		} else if (locale.equals("en")){
			locale = "de";
			FacesContext.getCurrentInstance().getViewRoot().setLocale(new Locale("de"));
			logger.info("auf de gesetzt");
		} else {
			logger.info("Falsche Locale");
		}
	}
	
	public void ajaxBehaviorListener(AjaxBehaviorEvent abe) {
		logger.info("'ajaxBehaviorListener(" + abe.getClass().getCanonicalName() + ")' aufgerufen");
		FacesContext.getCurrentInstance().renderResponse();

	}
	
	public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}

	
}
