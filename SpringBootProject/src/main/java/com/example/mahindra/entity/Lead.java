package com.example.mahindra.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

@Entity
@Table

public class Lead {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long leadID;

    

    @Column(nullable = false)
    private String firstName;

    @Column
    private String middleName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false)
    @Size(min=10,max=10)
    private String mobileNumber;

    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private Date dob;

    @Column(nullable = false, unique = true)
    @Email
    private String email;

	public Long getLeadID() {
		return leadID;
	}

	public void setLeadID(Long leadID) {
		this.leadID = leadID;
	}

	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Lead(Long leadID, Integer leadId2, String firstName, String middleName, String lastName,
			@Size(min = 10, max = 10) String mobileNumber, String gender, Date dob, @Email String email) {
		super();
		this.leadID = leadID;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
		this.dob = dob;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Lead [leadID=" + leadID + ", firstName=" + firstName + ", middleName="
				+ middleName + ", lastName=" + lastName + ", mobileNumber=" + mobileNumber + ", gender=" + gender
				+ ", dob=" + dob + ", email=" + email + "]";
	}
    
    
}
