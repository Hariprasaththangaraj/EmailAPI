package com.server.main.user.request;

public class Emailrequest {

	private String emailid;
	private String subject;
	private String body;

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Emailrequest(String emailid, String subject, String body) {
		super();
		this.emailid = emailid;
		this.subject = subject;
		this.body = body;
	}

	public Emailrequest() {

	}

}
