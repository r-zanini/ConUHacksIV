package controllers;

import models.users.User;
import models.users.User_id;
import play.mvc.*;

import views.html.*;

import java.time.LocalDate;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {
    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(views.html.home.render());
    }

    public Result login(){
        return ok(views.html.login.render());
    }
    public Result loginFR(){
        ctx().session().put("user", "m.tester");
        return index();
    }

    public Result loginEN() {
        ctx().session().put("user", "s.tamang");
        return index();
    }

    public Result services(){
        return ok(views.html.services.render());
    }
    public Result activities(){
        return ok(views.html.activities.render());
    }

    public Result initialize(){
        if(User_id.find.byId("r.zanini")==null){
            User_id admin = new User_id();
            admin.uName = "r.zanini";
            admin.password = "123";
            admin.fName = "Rodrigo";
            admin.lName = "Zanini";
            admin.userType = 2;
            admin.dob = LocalDate.parse("1988-10-05");
            admin.address = "123 De Maisonneuve";
            admin.postalCode = "H0H0H0";
            admin.email = "my@email.com";
            admin.preferredLanguage = 1;
            admin.phone = "123 456-7890";
            admin.save();
            User_id user1 = new User_id();
            user1.uName = "s.tamang";
            user1.password = "123";
            user1.fName = "Sonam";
            user1.lName = "Tamang";
            user1.userType = 0;
            user1.dob = LocalDate.parse("1998-10-01");
            user1.address = "321 De Maisonneuve";
            user1.postalCode = "H1H1H1";
            user1.email = "his@email.com";
            user1.preferredLanguage = 1;
            user1.phone = "123 456-7890";
            user1.save();
            User user1User = new User();
            user1User.userId = "s.tamang";
            user1User.readEN = 10;
            user1User.spokenEN = 10;
            user1User.readFR = 5;
            user1User.spokenFR = 4;
            user1User.ethnicity = "Nepal";
            user1User.confirmed = true;
            user1User.buddyEnabled = true;
            User_id user2 = new User_id();
            user2.uName = "m.tester";
            user2.password = "123";
            user2.fName = "My";
            user2.lName = "Tester";
            user2.userType = 0;
            user2.dob = LocalDate.parse("1980-01-01");
            user2.address = "456 De Maisonneuve";
            user2.postalCode = "H3H3H3";
            user2.email = "our@email.com";
            user2.preferredLanguage = 2;
            user2.phone = "123 456-7890";
            user2.save();
            User user2User = new User();
            user2User.userId = "m.tester";
            user2User.readEN = 5;
            user2User.spokenEN = 6;
            user2User.readFR = 10;
            user2User.spokenFR = 10;
            user2User.ethnicity = "Russia";
            user2User.confirmed = true;
            user2User.buddyEnabled = true;
        }
        return index();
        //return ok(views.html.layouts.main.render("Home", play.twirl.api.Html.apply("Page has been initialized")));
    }

}
