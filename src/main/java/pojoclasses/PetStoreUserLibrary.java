package pojoclasses;

public class PetStoreUserLibrary {
	
		public  int id;  
		public  String username;
		public PetStoreUserLibrary() {
			
		}
		public String firstName;
		public String lastName;
		public String email;
		public String password; 
		public String  phone;
		 int userStatus;
		public PetStoreUserLibrary(int id, String username, String firstName, String lastName, String email,
				String password, String phone, int userStatus) {
			super();
			this.id = id;
			this.username = username;
			this.firstName = firstName;
			this.lastName = lastName;
			this.email = email;
			this.password = password;
			this.phone = phone;
			this.userStatus = userStatus;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
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
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public int getUserStatus() {
			return userStatus;
		}
		public void setUserStatus(int userStatus) {
			this.userStatus = userStatus;
		}
		

}