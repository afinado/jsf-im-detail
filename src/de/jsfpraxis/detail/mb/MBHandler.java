package de.jsfpraxis.detail.mb;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.faces.component.html.HtmlOutputText;

public class MBHandler {

	private static Logger logger = Logger.getLogger("de.jsfpraxis.detail.mb.MBHandler");
	
	private String title;
	private Double pi;
	private List<String> urls = new ArrayList<String>();
	private HtmlOutputText ueberschrift;

	
	public MBHandler() {
		logger.info("Konstruktor MBHandler() aufgerufen");
	}


	public String ok() {
		ueberschrift.setValue("Ganz wichtige URLs");
		return "success";
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}


	public List<String> getUrls() {
		return urls;
	}
	public void setUrls(List<String> urls) {
		this.urls = urls;
	}

	
	public Double getPi() {
		return pi;
	}
	public void setPi(Double pi) {
		this.pi = pi;
	}

	
	public HtmlOutputText getUeberschrift() {
		return ueberschrift;
	}
	public void setUeberschrift(HtmlOutputText ueberschrift) {
		this.ueberschrift = ueberschrift;
	}
}
