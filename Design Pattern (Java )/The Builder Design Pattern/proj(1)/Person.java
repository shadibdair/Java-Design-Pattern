// import DefaultPerson.Builder;
public interface Person {
	
	String getFirstName();
	String getLastName();
	String getPhoneNumber();
	int getAge();
	String getAddress();
	
	class DefaultPerson implements Person{
		
		// Required parameters
		private final String firstName;
		private final String lastName;
		
		// Optional parameters
		protected String phoneNumber;
		protected String address;
		protected int age;
		
		
		public DefaultPerson(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}


		protected DefaultPerson(Builder builder) {
			
			this(builder.getFirstName(), builder.getLastName());
			this.phoneNumber = builder.phoneNumber;
			this.address = builder.address;
			this.age = builder.age;
		}

		
		public String getPhoneNumber() {
			return this.phoneNumber;
		}


		public String getAddress() {
			return this.address;
		}


		public int getAge() {
			return this.age;
		}

		public String getFirstName() {
			return this.firstName;
		}


		public String getLastName() {
			return this.lastName;
		}
		
		@Override
		public String toString() {
			StringBuilder stringBuilder = new StringBuilder();
			stringBuilder.append("Name: " + this.firstName + " " + this.lastName + " ");
			stringBuilder.append(" Phone: " + this.phoneNumber + " ");
			stringBuilder.append(" age: " + this.age + " ");
			stringBuilder.append(" Address: " + this.address);
			
			return stringBuilder.toString();
		}
	
	}
	// inner class
	class Builder extends DefaultPerson{		
		public Builder(String firstName, String lastName) {
			super(firstName, lastName);
		}
		public Builder phone(String phone) {
			this.phoneNumber = phone;
			return this;
		}
		public Builder address(String address) {
			this.address = address;
			return this;
		}
		public Builder age(int age) {
			this.age = age;
			return this;
		}
				
		public Person build() {
			return new DefaultPerson(this);
		}
	}	
}
