package de.jsfpraxis.detail.events;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;

/**
 * Berechnet n! für große Zahlen.
 */
@ManagedBean(name = "fakHandler")
@SessionScoped
public class FakultaetHandler {

	private static final int N_MAX = 1000;
	private int n;
	private BigInteger fakultaet;
	
	public void nChanged(ValueChangeEvent vce) {
		fakultaet = Fakultaet.fakultaet(new BigInteger(vce.getNewValue().toString()));
	}
	
	/**
	 * Liste von SelectItems potentieller Argumente
	 */
	public List<SelectItem> getArguments() {
		List<SelectItem> l = new ArrayList<SelectItem>();
		for (int i = 0; i < N_MAX; i++)
			l.add(new SelectItem(i, String.valueOf(i)));
		return l;
	}

	// ab hier nur Getter und Setter
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public BigInteger getFakultaet() {
		return fakultaet;
	}

	public void setFakultaet(BigInteger fakultaet) {
		// auskommentiert, damit der berechnete Wert nicht 
		// vom alten Wert überschrieben wird.
		// this.fakultaet = fakultaet;
	}
}
