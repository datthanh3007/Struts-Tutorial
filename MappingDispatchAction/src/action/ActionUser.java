package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.MappingDispatchAction;
import Model.User;
public class ActionUser extends MappingDispatchAction{
	public ActionForward addUser(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
    	User usermodel = (User) form;
    	usermodel.setName("THANH DAT");
    	usermodel.setAdd("Ha Noi");
        return mapping.findForward("add");
    }
	public ActionForward viewUser(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
		String name = request.getParameter("name");
		String add = request.getParameter("add");
    	User usermodel = (User) form;
    	usermodel.setName(name);
    	usermodel.setAdd(add);
        return mapping.findForward("view");
    }
	public ActionForward deleteUser(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
    	User usermodel = (User) form;
    	usermodel.setName("THANH DAT");
    	usermodel.setAdd("HN");
        return mapping.findForward("delete");
    }

}
