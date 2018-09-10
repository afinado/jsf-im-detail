package de.jsfpraxis.detail.mb;

import java.util.List;

import javax.faces.component.UIComponent;
import javax.faces.component.UISelectItem;
import javax.faces.component.html.HtmlSelectOneMenu;

public class ComponentBindingHandler {

	//private static Logger logger = Logger.getLogger("de.jsfpraxis.detail.el.MBViewScopeHandler");
	
	private String item;
	private HtmlSelectOneMenu menu;
	
	public String delete() {
		UIComponent found = null;
		List<UIComponent> children = menu.getChildren();
		for (UIComponent component : children) {
			UISelectItem item = (UISelectItem) component;
			if (menu.getValue().equals(item.getItemValue())) {
				found = component;
			}
		}
		menu.getChildren().remove(found);
		return null;
	}
	
	
	public String add() {
		UISelectItem si = new UISelectItem();
		si.setItemLabel(item);
		si.setItemValue("value");
		menu.getChildren().add(si);
		return null;
	}

	
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}


	public HtmlSelectOneMenu getMenu() {
		return menu;
	}
	public void setMenu(HtmlSelectOneMenu menu) {
		this.menu = menu;
	}

}
