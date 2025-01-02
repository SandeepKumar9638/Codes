package com.example.demo.entity;

import java.util.Arrays;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer_details")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
//	@Column(name ="customer_Id")
	private long customerId;
	
	
	@Column(name = "customer_Status")
	private String customerStatus;
	
	@Column(name="registration_Fees")
	private String registrationFees;
	
	
	@Column(name="card_holder_Name")
	private String cardHolderName;
	
	@Column(name= "card_No")
	private int cardNo;
	
	@Column(name="cashReciept_No")
	private int cashRecieptNo;
	
	@Column(name="mothers_Median")
	private String mothersMedian;
	
	@Column(name="is_Kin_Address")
	private String isKinAddress;
	
	@Column(name="photo_Id_Card")
	private String photoIdCard;
	
	@Column(name="is_Temporary_Address")
	private String isTemporaryAddress;
	
	@Column(name="is_Permenent_Address")
	private String isPermenentAddress;
	
	@Column(name = "image",length=124814)
	private byte[] image;
	
	@OneToOne (cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "customer_books")
	private Books books;
	
	public Books getBooks() {
		return books;
	}
	public void setBooks(Books books) {
		this.books = books;
	}
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "customer_cars")
	private Cars cars;
	
	public Cars getCars() {
		return cars;
	}
	public void setCars(Cars cars) {
		this.cars = cars;
	}
	 
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "customer_animals")
	private Animals animals ;
	
	public Animals getAnimals() {
		return animals;
	}
	public void setAnimals(Animals animals) {
		this.animals = animals;
	}
	
	// this r for customer entity
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}
	public Customer(String customerStatus, String registrationFees, String cardHolderName, int cardNo,
			int cashRecieptNo, String mothersMedian, String isKinAddress, String photoIdCard, String isTemporaryAddress,
			String isPermenentAddress,byte[] image) {
		super();
		this.customerStatus = customerStatus;
		this.registrationFees = registrationFees;
		this.cardHolderName = cardHolderName;
		this.cardNo = cardNo;
		this.cashRecieptNo = cashRecieptNo;
		this.mothersMedian = mothersMedian;
		this.isKinAddress = isKinAddress;
		this.photoIdCard = photoIdCard;
		this.isTemporaryAddress = isTemporaryAddress;
		this.isPermenentAddress = isPermenentAddress;
		this.image = image;
	}
	public Long getCustomerId() {
		return customerId;
		
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}


	public String getCustomerStatus() {
		return customerStatus;
	}

	public void setCustomerStatus(String employeeStatus) {
		this.customerStatus = employeeStatus;
	}

	public String getRegistrationFees() {
		return registrationFees;
	}

	public void setRegistrationFees(String registrationFees) {
		this.registrationFees = registrationFees;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}

	public int getCardNo() {
		return cardNo;
	}

	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}

	public int getCashRecieptNo() {
		return cashRecieptNo;
	}

	public void setCashRecieptNo(int cashRecieptNo) {
		this.cashRecieptNo = cashRecieptNo;
	}

	public String getMothersMedian() {
		return mothersMedian;
	}

	public void setMothersMedian(String mothersMedian) {
		this.mothersMedian = mothersMedian;
	}

	public String getIsKinAddress() {
		return isKinAddress;
	}

	public void setIsKinAddress(String isKinAddress) {
		this.isKinAddress = isKinAddress;
	}

	public String getPhotoIdCard() {
		return photoIdCard;
	}

	public void setPhotoIdCard(String photoIdCard) {
		this.photoIdCard = photoIdCard;
	}

	public String getIsTemporaryAddress() {
		return isTemporaryAddress;
	}

	public void setIsTemporaryAddress(String isTemporaryAddress) {
		this.isTemporaryAddress = isTemporaryAddress;
	}

	public String getIsPermenentAddress() {
		return isPermenentAddress;
	}

	public void setIsPermenentAddress(String isPermenentAddress) {
		this.isPermenentAddress = isPermenentAddress;
	}
	

	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public Customer() {
		super();
		 
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerStatus=" + customerStatus + ", registrationFees="
				+ registrationFees + ", cardHolderName=" + cardHolderName + ", cardNo=" + cardNo + ", cashRecieptNo="
				+ cashRecieptNo + ", mothersMedian=" + mothersMedian + ", isKinAddress=" + isKinAddress
				+ ", photoIdCard=" + photoIdCard + ", isTemporaryAddress=" + isTemporaryAddress
				+ ", isPermenentAddress=" + isPermenentAddress + ", image=" + Arrays.toString(image) + ", books="
				+ books + ", cars=" + cars + ", animals=" + animals + "]";
	}
	public Customer save(Customer customer) {
		
		return null;
	}

	
}


