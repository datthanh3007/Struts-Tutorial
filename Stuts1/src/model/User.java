package model;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class User extends ActionForm {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String address;
	public User() {
		super();	
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
		ActionErrors actionErrors = new ActionErrors();
		if(getName()==null || getName().length()<=6) {
			/* actionErrors.add("user.name.required",new ActionMessage("Try agian !")); */
			actionErrors.add("user.name.required",new ActionMessage("error.user.name.required"));
		}
		if(getAddress()==null || getAddress().length()<=2) {
		//	actionErrors.add("user.age.invalid",new ActionMessage("Try again !"));
		actionErrors.add("user.age.invalid",new ActionMessage("error.user.age.invalid"));
		}
		return actionErrors;
	}

}
