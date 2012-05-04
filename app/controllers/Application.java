package controllers;

import play.*;
import play.mvc.*;
import eu.delving.templates.java.GroovyTemplatesController;
import eu.delving.templates.java.GroovyTemplatesController.*;

import views.html.*;

public class Application extends GroovyTemplatesController {
  
  private static final String message = "Your new application is ready.";
  
  public static Result indexScala() {
    return ok(index.render("Scala", message));
  }

  public static Result indexGroovy() {
    return ok(Template("index.html").params("templateLanguage", "Groovy", "message", message).render());
  }

  public static Result indexMustache() {
    //todo
    return ok();
  }
  
}