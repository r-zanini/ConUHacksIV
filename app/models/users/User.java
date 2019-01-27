package models.users;

import io.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User extends Model {
	@Id
	public String userId;
	public String occupation;      //to be changed to Occupation object reference
	public String educationLevel;  //to be changed to EducationLevel object reference
	public String ethnicity;       //to be changed to Ethnicity object reference
	@Column(updatable = false)
	public String parent1;
	@Column(updatable = false)
	public int parent1Link;
	@Column(updatable = false)
	public String parent2;
	@Column(updatable = false)
	public int parent2Link;
	public int spokenFR;
	public int readFR;
	public int spokenEN;
	public int readEN;
	public boolean confirmed = false;
	public boolean buddyEnabled = false;
	//public List<FeedbackUser> userFeedbackReceived;
	//public List<FeedbackUser> userFeedbackDone;
	//public List<FeedbackService> serviceFeedbackDone;


	public User() {}
	public User(UserGhost ghost){
		userId = ghost.uName;
		occupation = ghost.occupation;
		educationLevel = ghost.educationLevel;
		ethnicity = ghost.ethnicity;
		parent1 = ghost.parent1;
		parent2 = ghost.parent2;
		spokenFR = ghost.spokenFR;
		spokenEN = ghost.spokenEN;
		readFR = ghost.readFR;
		readEN = ghost.readEN;
	}

	public String getUserId() {return userId;}
	public void setUserId(String userId) {this.userId = userId;}
	public String getOccupation() {return occupation;}
	public void setOccupation(String occupation) {this.occupation = occupation;}
	public String getEducationLevel() {return educationLevel;}
	public void setEducationLevel(String educationLevel) {this.educationLevel = educationLevel;}
	public String getEthnicity() {return ethnicity;}
	public void setEthnicity(String ethnicity) {this.ethnicity = ethnicity;}
	public String getParent1() {return parent1;}
	public void setParent1(String parent1) {this.parent1 = parent1;}
	public String getParent2() {return parent2;}
	public void setParent2(String parent2) {this.parent2 = parent2;}
	public int getSpokenFR() {return spokenFR;}
	public void setSpokenFR(int spokenFR) {this.spokenFR = spokenFR;}
	public int getReadFR() {return readFR;}
	public void setReadFR(int readFR) {this.readFR = readFR;}
	public int getSpokenEN() {return spokenEN;}
	public void setSpokenEN(int spokenEN) {this.spokenEN = spokenEN;}
	public int getReadEN() {return readEN;}
	public void setReadEN(int readEN) {this.readEN = readEN;}
	public boolean isConfirmed() {return confirmed;}
	public void setConfirmed(boolean confirmed) {this.confirmed = confirmed;}
	public boolean isBuddyEnabled() {return buddyEnabled;}
	public void setBuddyEnabled(boolean buddyEnabled) {this.buddyEnabled = buddyEnabled;}
}
