package model;

public class BoomUser {

	public BoomUser() {
		// TODO Auto-generated constructor stub
	}

 
	 private String address;
	 private float create_date;
	 
	 private String facebook_Id;
	 private String facebook_name;
	 private String image;
	 private String name;
	 private String os;
	 private String phone_number;
	 private String response_key;
	
	 private String user_id;

	 private int number_of_bombs;
	 public int getNumber_of_bombs() {
		  return number_of_bombs;
		 }
	 
	 // Getter Methods 

	 public String getAddress() {
	  return address;
	 }

	 public float getCreate_date() {
	  return create_date;
	 }

	 

	 public String getFacebook_Id() {
	  return facebook_Id;
	 }

	 public String getFacebook_name() {
	  return facebook_name;
	 }

	 public String getImage() {
	  return image;
	 }

	 public String getName() {
	  return name;
	 }

	 public String getOs() {
	  return os;
	 }

	 public String getPhone_number() {
	  return phone_number;
	 }

	 public String getResponse_key() {
	  return response_key;
	 }

	 

	 public String getUser_id() {
	  return user_id;
	 }

	 // Setter Methods 

	 public void setAddress(String address) {
	  this.address = address;
	 }

	 public void setCreate_date(float create_date) {
	  this.create_date = create_date;
	 }

	 
	 public void setFacebook_Id(String facebook_Id) {
	  this.facebook_Id = facebook_Id;
	 }

	 public void setFacebook_name(String facebook_name) {
	  this.facebook_name = facebook_name;
	 }

	 public void setImage(String image) {
	  this.image = image;
	 }

	 public void setName(String name) {
	  this.name = name;
	 }

	 public void setOs(String os) {
	  this.os = os;
	 }

	 public void setPhone_number(String phone_number) {
	  this.phone_number = phone_number;
	 }

	 public void setResponse_key(String response_key) {
	  this.response_key = response_key;
	 }

	 

	 public void setUser_id(String user_id) {
	  this.user_id = user_id;
	 }
	 public void setNumber_of_bombs(int number_of_bombs) {
		 this.number_of_bombs = number_of_bombs;
		 }
	}