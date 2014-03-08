package controllers;

import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result token(Long id) {
    	return ok("This is a token based route " + id);
    }

    public static Result regex(Long id) {
    	return ok("This is a regex based route " + id);
    }

    public static Result clob(String path) {
    	return ok("Im a teapot!");
    }

}
