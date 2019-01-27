package models;

import io.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FeedbackService extends Model {
	@Id
	private String id;
	@Column(nullable = false, updatable = false)
	private String giver;
	@Column(nullable = false, updatable = false)
	private String serviceID;
	private boolean confirmFR;
	private boolean confirmNoFR;
	private boolean confirmEN;
	private boolean confirmNoEN;
	private int score;
	private String comment;

	public FeedbackService() {}

	public String getGiver() {return giver;}
	public void setGiver(String giver) {this.giver = giver;}
	public String getServiceID() {return serviceID;}
	public void setServiceID(String serviceID) {this.serviceID = serviceID;}
	public boolean isConfirmFR() {return confirmFR;}
	public void setConfirmFR(boolean confirmFR) {this.confirmFR = confirmFR;}
	public boolean isConfirmNoFR() {return confirmNoFR;}
	public void setConfirmNoFR(boolean confirmNoFR) {this.confirmNoFR = confirmNoFR;}
	public boolean isConfirmEN() {return confirmEN;}
	public void setConfirmEN(boolean confirmEN) {this.confirmEN = confirmEN;}
	public boolean isConfirmNoEN() {return confirmNoEN;}
	public void setConfirmNoEN(boolean confirmNoEN) {this.confirmNoEN = confirmNoEN;}
	public int getScore() {return score;}
	public void setScore(int score) {this.score = score;}
	public String getComment() {return comment;}
	public void setComment(String comment) {this.comment = comment;}
}
