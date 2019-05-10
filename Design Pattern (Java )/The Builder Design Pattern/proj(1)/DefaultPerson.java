//
//public class DefaultPerson implements Person{
//	
//	// Required parameters
//	private final String firstName;
//	private final String lastName;
//	
//	// Optional parameters
//	protected String phoneNumber;
//	protected String address;
//	protected int age;
//	
//	
//	public DefaultPerson(String firstName, String lastName) {
//		this.firstName = firstName;
//		this.lastName = lastName;
//	}
//
//
//	protected DefaultPerson(Builder builder) {
//		
//		this(builder.getFirstName(), builder.getLastName());
//		this.phoneNumber = phoneNumber;
//		this.address = address;
//		this.age = age;
//	}
//
//	
//	public String getPhoneNumber() {
//		return this.phoneNumber;
//	}
//
//
//	public void setPhoneNumber(String phoneNumber) {
//		this.phoneNumber = phoneNumber;
//	}
//
//
//	public String getAddress() {
//		return this.address;
//	}
//
//
//	public void setAddress(String address) {
//		this.address = address;
//	}
//
//
//	public int getAge() {
//		return this.age;
//	}
//
//
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//
//	public String getFirstName() {
//		return this.firstName;
//	}
//
//
//	public String getLastName() {
//		return this.lastName;
//	}
//	
//	// inner class
//	class Builder extends DefaultPerson{
//		public Builder(String firstName, String lastName) {
//			super(firstName, lastName);
//		}
//		public Builder phone(String phone) {
//			this.phoneNumber = phone;
//			return this;
//		}
//		public Builder address(String address) {
//			this.address = address;
//			return this;
//		}
//		public Builder age(int age) {
//			this.age = age;
//			return this;
//		}
//		
//		public Person build() {
//			return new DefaultPerson(this);
//		}
//	}
//	
//	
//}
