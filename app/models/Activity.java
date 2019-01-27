package models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Activity {
	@Id
	private String id;
	@Column(nullable = false)
	private String name;
	private String address;
	@Column(nullable = false)
	private String city;
	private String postalCode;
	@Column(nullable = false)
	private String url;
	private boolean FR;
	private boolean EN;
	private LocalDate dateStart;
	private LocalDate dateEnd;
	private int priceMin;
	private int priceMax;
}
