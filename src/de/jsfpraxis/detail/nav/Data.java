package de.jsfpraxis.detail.nav;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Data {

	private static Logger logger = Logger.getLogger("de.jsfpraxis.detail.nav.Data");
	
	private Integer wert;
	
	private Integer percentage = 0;

	public Integer getPercentage() {
		logger.info("getPercentage() returns " + percentage);
		return percentage;
	}

	public void setPercentage(Integer percentage) {
		logger.info("setPercentage(" + percentage + ")");
		this.percentage = percentage;
	}
	
	public List<Integer> getData() {
		List<Integer> list = new ArrayList<Integer>(percentage);
		for (int i = 0; i < percentage; i++) {
			list.add(i);
		}
		return list;
	}

	
	
	public Integer getWert() {
		return wert;
	}
	public void setWert(Integer wert) {
		this.wert = wert;
	}

	
}
