/*
 *  (c) Bernd Müller, www.jsfpraxis.de
 */
package de.jsfpraxis.detail.el;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.faces.application.Application;
import javax.faces.context.FacesContext;

public class ELHandler {

	private static Logger logger = Logger.getLogger("de.jsfpraxis.detail.el.ELHandler");
	
	private String name = "Übungen mit der Expression-Language";
	private Integer jahr = Integer.parseInt(new java.text.SimpleDateFormat("yyyy").format(new java.util.Date()));
	private String[] array = new String[]{ "eins", "zwei", "drei" };
	private Map<String, String> map = new HashMap<String, String>();
	
	public ELHandler() {
		super();
		map.put("eins", "Erster Map-Eintrag");
		map.put("zwei", "Zweiter Map-Eintrag");
		map.put("drei", "Dritter Map-Eintrag");
	}

	public Integer getTestAusdruck() {
		// depricated in JSF 1.2:
//		FacesContext context = FacesContext.getCurrentInstance();
//		Application app = context.getApplication();
//		Long l = (Long) app.createValueBinding("#{17 + 4}").getValue(context);
		
		FacesContext faces = FacesContext.getCurrentInstance();
		Application app = faces.getApplication();
		ExpressionFactory expressionFactory = app.getExpressionFactory();
		ELContext el = faces.getELContext();
		Integer val = (Integer) expressionFactory.createValueExpression(el, "#{17 + 4}", Integer.class).getValue(el);
		
		// Test JSF-EL und JSP-EL
		logger.info("\"#{17 + 4}\" = " + expressionFactory.createValueExpression(el, "#{17 + 4}", Integer.class).getValue(el));
		logger.info("\"${17 + 4}\" = " + expressionFactory.createValueExpression(el, "${17 + 4}", Integer.class).getValue(el));
		
		// Beispielhafter Zugriff auf Session-Objekt
		logger.info("Session: " + expressionFactory.createValueExpression(el, "#{session}", Object.class).getValue(el));
		logger.info("Session-Klasse: " + expressionFactory.createValueExpression(el, "#{session}", Object.class).getValue(el).getClass().getCanonicalName());
		return val;
	}
	
	
	// Ab JSP 2.1 (JSR 245) Maintenance Review 2 sind Methodenparameter erlaubt
	
	public String methodWithOneParam(String param) {
		return param + " " + param;
	}
	
	public String methodWithTwoParams(String param1, int param2) {
		return param1 + " " + param2;
	}
	
	public List<Integer> getList() {
		//gibt Fehler: return Arrays.asList(new Integer[] { 1, 2, 3, 4, 5, 6, 7});
		List<Integer> list = new ArrayList<Integer>();
		list.add(1); list.add(2); list.add(3); list.add(4); list.add(5);
		return list; 
	}

	
	// ab hier nur einfache Getter und Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getJahr() {
		return jahr;
	}

	public void setJahr(Integer jahr) {
		this.jahr = jahr;
	}

	public String[] getArray() {
		return array;
	}

	public void setArray(String[] array) {
		this.array = array;
	}

	public Map<String, String> getMap() {
		return map;
	}

	public void setMap(Map<String, String> map) {
		this.map = map;
	}



	
}
