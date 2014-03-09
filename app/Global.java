import models.Contact;
import play.Application;
import play.GlobalSettings;

import play.*;
import play.mvc.*;
import play.mvc.Http.*;
import play.libs.F.*;

import static play.mvc.Results.*;
import views.html.*;

public class Global extends GlobalSettings {
	
	@Override
	public void onStart(Application application) {
		Contact james = new Contact();

		james.setName("James Milner");
		james.setEmailAddress("john@wisc.edu");
		james.save();

		Contact phil = new Contact();

		phil.setName("Phil Milner");
		phil.setEmailAddress("phil@wisc.edu");
		phil.save();

		Contact robert = new Contact();

		robert.setName("Robert Milner");
		robert.setEmailAddress("robert@wisc.edu");
		robert.save();

		Contact steven = new Contact();

		steven.setName("Steven Milner");
		steven.setEmailAddress("steven@wisc.edu");
		steven.save();
	}

	@Override
	public Promise<SimpleResult> onHandlerNotFound(RequestHeader request) {
        return Promise.<SimpleResult>pure(notFound(
            notfoundpage.render()
        ));
    }
//	
//	@Override
//	public Result onHandlerNotFound(Http.RequestHeader requestHeader) {
//		return Results.notFound(views.html.notFound.render());
//	}
}