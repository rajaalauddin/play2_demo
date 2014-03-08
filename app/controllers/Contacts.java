package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import play.*;
import play.mvc.*;
import views.html.*;
import java.util.Arrays;
import java.util.List;
import models.Contact;
import play.data.Form;

public class Contacts extends Controller {
	
	static Form<Contact> contactForm = new Form(Contact.class);

	public static Result index() {
		//List<String> names = Arrays.asList("James", "Johnson", "Mike", "Phil");
		List<Contact> contacts = Contact.find.all();
		return ok(index.render("Play 2", contacts, contactForm));
		//return TODO;
	}

	public static Result create() {

		Form<Contact> form = contactForm.bindFromRequest(request());

		if(!form.hasErrors()) {
			form.get().save();
			return redirect(routes.Contacts.index());
		} else {
			return badRequest(index.render("Play 2", Contact.find.all(), form));
		}
		
	}

	public static Result edit(Long id) {
		return TODO;
	}

	public static Result update(Long id) {
		return TODO;
	}

	public static Result delete(Long id) {
		return TODO;
	}

}