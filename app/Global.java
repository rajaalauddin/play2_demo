import play.GlobalSettings;
import play.Application;
import models.Contact;

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
}