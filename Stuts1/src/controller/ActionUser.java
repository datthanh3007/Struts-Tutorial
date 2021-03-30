package controller;

import java.util.List;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;

import model.User;
import userservice.UserService;
@WebServlet("/deleteUser")
public class ActionUser extends MappingDispatchAction   {
	
	public ActionForward addUser(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		return mapping.findForward("adduser");
	}

	public ActionForward addUserMethod(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		User user = (User) form;
		UserService service = new UserService();
		service.addUser(user);
		return mapping.findForward("addusermethod");
	}
	public ActionForward editUserMethod(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		User user = (User) form;
		UserService service = new UserService();
		service.editUser(user);
		return mapping.findForward("editusermethod");
	}

	public ActionForward FindUser(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		 int id =Integer.valueOf(request.getParameter("userid")); 
			/* int id1 = 1; */
		UserService userService = new UserService();
		User user = userService.getUserbyID(id);
		/* System.out.println(user.getName()); */
		request.setAttribute("keyUser", user);
		return mapping.findForward("finduser");
	}

	public ActionForward listUser(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		/* int id =Integer.valueOf(request.getParameter("userid")); */
		UserService userService = new UserService();
		List<User> users = userService.getUser();
		/* System.out.println(user.getName()); */
		request.setAttribute("listU", users);
		return mapping.findForward("listuser");
	}
	
	public ActionForward deleteUser(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		UserService service = new UserService();
		
		int id =Integer.valueOf(request.getParameter("userid"));
			/* service.deleteUser(id); */
		  
			System.out.println("aaaa");
		return mapping.findForward("deleteuser");
	}
	public ActionForward updateUser(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		UserService service = new UserService();
		int id =Integer.valueOf(request.getParameter("userid"));
		User user = service.getUserbyID(id);
		request.setAttribute("update", user);
		return mapping.findForward("updateuser");
	}


}
