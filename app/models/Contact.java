package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import play.db.ebean.*;
import static play.data.validation.Constraints.*;

@Entity
public class Contact extends Model {
	
	@Id
	Long id;

	@Required
	String name;

	@Required
	@Email
	String emailAddress;

	public static Finder<Long, Contact> find = new Finder<Long, Contact>(Long.class, Contact.class);
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}	
}