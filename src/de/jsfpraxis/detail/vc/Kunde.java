package de.jsfpraxis.detail.vc;

import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

/**
 * Klasse als Beispiel fuer Bean Validation
 */
public class Kunde {

	@NotNull
	@Size(min = 3, max = 30)
	private String vorname;
	
	@NotNull
	@Size(min = 3, max = 30)
	private String nachname;
	
	
	@Past(groups = NichtVolljaehrigGruppe.class)
	@Volljaehrig(groups = VolljaehrigGruppe.class)
	private Date geburtstag;
	
	@Min(0)
	@Max(value = 1000, groups = NichtVolljaehrigGruppe.class)
	private Integer kreditlimit;
	
	
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	
	public Date getGeburtstag() {
		return geburtstag;
	}
	public void setGeburtstag(Date geburtstag) {
		this.geburtstag = geburtstag;
	}
	
	public Integer getKreditlimit() {
		return kreditlimit;
	}
	public void setKreditlimit(Integer kreditlimit) {
		this.kreditlimit = kreditlimit;
	}
	
	@Override
	public String toString() {
		return "Kunde [geburtstag=" + geburtstag + ", kreditlimit="
				+ kreditlimit + ", nachname=" + nachname + ", vorname="
				+ vorname + "]";
	}

	
	
	
}
