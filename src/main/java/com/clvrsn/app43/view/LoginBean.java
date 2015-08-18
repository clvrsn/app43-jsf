package com.clvrsn.app43.view;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import com.clvrsn.app43.entity.User;

@ManagedBean
public class LoginBean {

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	private User user = new User();

	public String actionLogin() {

		System.out.println(user.getEmail());

		addMessage("Success", "Usuário autenticado com sucesso");
		return "login";
	}

	public void addMessage(String summary, String detail) {
		FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, detail);
		FacesContext.getCurrentInstance().addMessage(null, message);
	}
}