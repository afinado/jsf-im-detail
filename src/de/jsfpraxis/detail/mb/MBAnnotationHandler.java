package de.jsfpraxis.detail.mb;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.NoneScoped;


/*
 * Bitte beachten Sie, dass diese Bean NICHT in der faces-config.xml steht.
 */
@ManagedBean(name = "mbAnnotationHandler")
// @RequestScoped
// @ViewScoped
// @SessionScoped
// @ApplicationScoped
public class MBAnnotationHandler {

	private static Logger logger = Logger.getLogger("de.jsfpraxis.detail.mb.MBAnnotationHandler");

	@ManagedProperty(value = "Annotierte Managed-Beans")
	private String title;
	
	@ManagedProperty(value = "3.1415")
	private Double pi;

	@ManagedProperty(value = "#{urls.urls}")
	private List<String> urls;

	public MBAnnotationHandler() {
		logger.info("Konstruktor MBAnnotationHandler() aufgerufen");
	}

	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	

	public Double getPi() {
		return pi;
	}
	public void setPi(Double pi) {
		this.pi = pi;
	}

	
	public List<String> getUrls() {
		return urls;
	}

	public void setUrls(List<String> urls) {
		this.urls = urls;
	}

	
	@ManagedBean(name = "urls")
	@NoneScoped
	public static class Urls {

		public List<String> getUrls() {
			return Arrays.asList(new String[] {
					"http://java.sun.com/docs/books/jls/index.html",
					"http://java.sun.com/j2ee/javaserverfaces",
					"http://java.sun.com/javase",
					"http://www.jsfpraxis.de" });
		}
	}

}
