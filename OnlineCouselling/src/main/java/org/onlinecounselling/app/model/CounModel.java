package org.onlinecounselling.app.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "coun")
public class CounModel {
	
	public CounModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CounModel(int counId, String userName, String firstName, String lastName, int age, String email,
			long phoneNumber, long mark_12th, long mark_10th, String college, long cutoff) {
		super();
		this.counId = counId;
		this.userName = userName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.mark_12th = mark_12th;
		this.mark_10th = mark_10th;
		this.college = college;
		this.cutoff = cutoff;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "coun_id")
	private int counId;
	
	@Column(name = "username", nullable = false, unique = true)
	private String userName;
	
	@Column(name = "first_name", nullable = false)
	private String firstName;

	@Column(name = "last_name", nullable = false)
	private String lastName;
	
	@Column(name = "age", nullable = false)
	private int age;
	
	@Column(name = "email", nullable = false)
	private String email;
	
	@Column(name = "phone_number", nullable = false)
	private long phoneNumber;
	
	@Column(name = "12th_mark", nullable = false)
	private long mark_12th;
	
	@Column(name = "10th_mark", nullable = false)
	private long mark_10th;
	
	@Column(name = "college", nullable = false)
	private String college ;
	
	@Column(name = "cutoff", nullable = false)
	private long cutoff;

	public int getCounId() {
		return counId;
	}

	public void setCounId(int counId) {
		this.counId = counId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public long getMark_12th() {
		return mark_12th;
	}

	public void setMark_12th(long mark_12th) {
		this.mark_12th = mark_12th;
	}

	public long getMark_10th() {
		return mark_10th;
	}

	public void setMark_10th(long mark_10th) {
		this.mark_10th = mark_10th;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public long getCutoff() {
		return cutoff;
	}

	public void setCutoff(long cutoff) {
		this.cutoff = cutoff;
	}

	@Override
	public String toString() {
		return "CounModel [counId=" + counId + ", userName=" + userName + ", firstName=" + firstName + ", lastName="
				+ lastName + ", age=" + age + ", email=" + email + ", phoneNumber=" + phoneNumber + ", mark_12th="
				+ mark_12th + ", mark_10th=" + mark_10th + ", college=" + college + ", cutoff=" + cutoff + "]";
	}
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="id")
	private UserModel um;

	public UserModel getUm() {
		return um;
	}

	public void setUm(UserModel um) {
		this.um = um;
	}
	
}
