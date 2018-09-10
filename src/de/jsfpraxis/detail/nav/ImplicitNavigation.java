package de.jsfpraxis.detail.nav;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ImplicitNavigation {

	public String implizitNach()  {
		return "implizit-nach";
	}

	public String implizitNachXhtml()  {
		return "implizit-nach.xhtml";
	}

	public String implizitNachXhtmlRedirect()  {
		return "implizit-nach.xhtml?faces-redirect=true";
	}

	public String implizitNachJsf()  {
		return "implizit-nach.jsf";
	}

	public String implizitNachIrgendwas()  {
		return "implizit-nach.irgendwas";
	}

	
}
