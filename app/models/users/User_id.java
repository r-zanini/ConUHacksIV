package models.users;

import io.ebean.Finder;
import io.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class User_id extends Model {
	@Id
	public String uName;
	@Column(nullable = false)
	public String fName;
	@Column(nullable = false)
	public String lName;
	@Column(nullable = false)
	public String password;
	@Column(nullable = false)
	public LocalDate dob;
	@Column(nullable = false)
	public String email;
	@Column(nullable = false)
	public String phone;
	@Column(nullable = false)
	public String address;
	@Column(nullable = false)
	public String postalCode;
	public int preferredLanguage;  //1==French, 2==English
	public int userType;           //2==Admin, 1==DataViewer, 0==User

	public static Finder<String, User_id> find = new Finder<>(User_id.class);

	public User_id(){}
	public User_id(UserGhost ghost){
		uName = ghost.uName;
		fName = ghost.fName;
		lName = ghost.lName;
		password = ghost.password;
		dob = LocalDate.parse(ghost.dob);
		email = ghost.email;
		phone = ghost.phone;
		address = ghost.address;
		postalCode = ghost.postalCode;
		preferredLanguage = ghost.preferredLanguage;
		userType = ghost.userType;
	}
	public boolean checkPassword(String toCheck){return password.equals(toCheck);}
}
