package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
	
	private SimpleDateFormat sfd= new SimpleDateFormat ("dd/MM/yyyy");
	private String name;
	private String email;
	private Date birthday;
	
	public Cliente(String name, String email, Date birthday) {
		this.name = name;
		this.email = email;
		this.birthday = birthday;
		this.sfd=sfd;
	}
	
	public Cliente() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public SimpleDateFormat getSfd() {
		return sfd;
	}

	public void setSfd(SimpleDateFormat sfd) {
		this.sfd = sfd;
	}

	@Override
	public String toString() {
		return "Cliente [ name=" + name + ", email=" + email + ", birthday=" + sfd.format(birthday) + "]";
	}
	
	
	

}
