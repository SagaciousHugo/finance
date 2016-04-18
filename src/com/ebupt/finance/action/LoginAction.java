package com.ebupt.finance.action;
import com.ebupt.finance.dao.BaseDaoHibernate4;
import com.ebupt.finance.domain.User;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	
	private String username;
	private String password;
	private String login;
	private BaseDaoHibernate4 baseDaoHibernate4;
	
	public BaseDaoHibernate4 getBaseDaoHibernate4() {
		return baseDaoHibernate4;
	}

	public void setBaseDaoHibernate4(BaseDaoHibernate4 baseDaoHibernate4) {
		this.baseDaoHibernate4 = baseDaoHibernate4;
	}

	private User user;
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String userLogin()throws Exception {
		User temp = baseDaoHibernate4.get(User.class, 1);
		if (getUsername().equals(temp.getUsername())
				&& getPassword().equals(temp.getPassword()) )
			{
				ActionContext.getContext().getSession()
					.put("user" , temp.getNickname());
				return SUCCESS;
			}
			return ERROR;
	}
}
