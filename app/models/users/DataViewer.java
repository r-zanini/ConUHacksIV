package models.users;

import javax.persistence.Column;

public class DataViewer {
	private User_id userId;
	@Column(nullable = false)
	private String organization;
}
