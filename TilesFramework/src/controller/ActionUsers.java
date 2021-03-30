package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;

import model.User;
import service.Service_user;

public class ActionUsers extends MappingDispatchAction {

	public ActionForward addUserMethod(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		User user = (User) form;
		Service_user service_user = new Service_user();
		service_user.addUserService(user);
		return mapping.findForward("addmethod");
	}

}
