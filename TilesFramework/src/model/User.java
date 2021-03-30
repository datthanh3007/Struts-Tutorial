package model;



import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class User extends ActionForm {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
private	String name;
private int age;
private String address;
private String sex;
private String job;

public User() {
	super();
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getAddress() {	
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getSex() {
	return sex;
}
public void setSex(String sex) {
	this.sex = sex;
}
public String getJob() {
	return job;
}
public void setJob(String job) {
	this.job = job;
}
@Override
public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
	// TODO Auto-generated method stub
	return super.validate(mapping, request);
}

	

}
