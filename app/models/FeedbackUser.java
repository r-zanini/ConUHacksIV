package models;

import io.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FeedbackUser extends Model {
	@Id
	private String id;
	@Column(nullable = false, updatable = false)
	private String giver;
	@Column(nullable = false, updatable = false)
	private String receiver;
	private int scoreFR;
	private int scoreEN;
	private int scoreFriendliness;
	private String personality;
	private int scoreChanceToRepeat;
	private String comments;
	private boolean incidentOccurred;
	private String incidentDescription;

	public FeedbackUser() {}

	public String getId() {return id;}
	public void setId(String id) {this.id = id;}
	public String getGiver() {return giver;}
	public void setGiver(String giver) {this.giver = giver;}
	public String getReceiver() {return receiver;}
	public void setReceiver(String receiver) {this.receiver = receiver;}
	public int getScoreFR() {return scoreFR;}
	public void setScoreFR(int scoreFR) {this.scoreFR = scoreFR;}
	public int getScoreEN() {return scoreEN;}
	public void setScoreEN(int scoreEN) {this.scoreEN = scoreEN;}
	public int getScoreFriendliness() {return scoreFriendliness;}
	public void setScoreFriendliness(int scoreFriendliness) {this.scoreFriendliness = scoreFriendliness;}
	public String getPersonality() {return personality;}
	public void setPersonality(String personality) {this.personality = personality;}
	public int getScoreChanceToRepeat() {return scoreChanceToRepeat;}
	public void setScoreChanceToRepeat(int scoreChanceToRepeat) {this.scoreChanceToRepeat = scoreChanceToRepeat;}
	public String getComments() {return comments;}
	public void setComments(String comments) {this.comments = comments;}
	public boolean isIncidentOccurred() {return incidentOccurred;}
	public void setIncidentOccurred(boolean incidentOccurred) {this.incidentOccurred = incidentOccurred;}
	public String getIncidentDescription() {return incidentDescription;}
	public void setIncidentDescription(String incidentDescription) {this.incidentDescription = incidentDescription;}
}
