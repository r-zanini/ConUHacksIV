package models.users;

public class UserGhost {
	public String uName;
	public String fName;
	public String lName;
	public String password;
	public String dob;
	public String email;
	public String phone;
	public String address;
	public String postalCode;
	public int preferredLanguage;  //1==French, 2==English
	public int userType;           //2==Admin, 1==DataViewer, 0==User
	public String organization;
	public String occupation;
	public String educationLevel;
	public String ethnicity;
	public String parent1;
	private int parent1Link;
	public String parent2;
	private int parent2Link;
	public int spokenFR;
	public int readFR;
	public int spokenEN;
	public int readEN;
	public boolean confirmed;
	public boolean buddyEnabled;
}
