package controllers;

import models.users.User;
import models.users.UserGhost;
import models.users.User_id;
import play.data.Form;
import play.data.FormFactory;
import play.db.ebean.Transactional;
import play.mvc.*;

import javax.inject.Inject;

public class UserController extends Controller {
	private final FormFactory formFactory;

	@Inject
	public UserController(FormFactory formFactory) {this.formFactory = formFactory;}

	public Result profile() {
		User_id uid = User_id.find.byId(ctx().session().get("user"));
		UserGhost ghost = new UserGhost();
		ghost.address = uid.address;
		ghost.fName = uid.fName;
		ghost.uName = uid.uName;
		ghost.lName = uid.lName;
		ghost.email = uid.email;
		ghost.phone = uid.phone;
		ghost.address = uid.address;
		Form<UserGhost> userGhostForm = formFactory.form(UserGhost.class).fill(ghost);
		return ok(views.html.profile.render(userGhostForm));
	}

	public Result getBlankUser(){
		Form<UserGhost> userGhostForm = formFactory.form(UserGhost.class);
		return ok();
	}

	public Result getBlankChild(){
		UserGhost ghost = new UserGhost();
		User_id parent = User_id.find.byId(ctx().session().get("user"));
		ghost.parent1 = parent.uName;
		ghost.address = parent.address;
		Form<UserGhost> userGhostForm = formFactory.form(UserGhost.class).fill(ghost);
		return ok();
	}

	@Transactional
	public Result registerUser(){
		Form<UserGhost> userGhostForm = formFactory.form(UserGhost.class).bindFromRequest();
		if(userGhostForm.hasErrors()) return badRequest();      //ADD THE VIEW
		UserGhost ghost = userGhostForm.get();
		if(User_id.find.byId(ghost.uName)!=null){
			flash("warning","That username is already taken");
			return ok();                                        //ADD THE VIEW
		}
		ghost.userType = 0;
		User_id user_id = new User_id(ghost);
		User user = new User(ghost);
		user_id.save();
		user.save();
		ghost = null;
		return ok();
	}

	public Result getBlankAdmin(){
		Form<UserGhost> userGhostForm = formFactory.form(UserGhost.class);
		return ok();
	}

	public Result registerAdmin(){
		return ok();
	}

	public Result getBlankDataViewer(){
		Form<UserGhost> userGhostForm = formFactory.form(UserGhost.class);
		return ok();
	}

	public Result registerDataViewer(){
		return ok();
	}

	public Result getBlankFeedbackService(String serviceID){
		return ok();
	}

	public Result createFeedbackService(){
		return ok();
	}

	public Result getBlankFeedbackUser(String userID) {
		User_id uid = User_id.find.byId(userID);
		UserGhost ghost = new UserGhost();
		ghost.address = uid.address;
		ghost.fName = uid.fName;
		ghost.uName = uid.uName;
		ghost.lName = uid.lName;
		ghost.email = uid.email;
		ghost.phone = uid.phone;
		ghost.address = uid.address;
		Form<UserGhost> userGhostForm = formFactory.form(UserGhost.class).fill(ghost);
		return ok(views.html.feedbackBuddy.render(userGhostForm));
	}

	public Result createFeedbackUser() {
		return ok();
	}
}
