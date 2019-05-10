
public class main {

	public static void main(String[] args) {
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Hello Everyone")
		.append(" I Know you")
		.append(" this is the END");
		
		System.out.println(stringBuilder);
		
		User Shadi = new User.UserBuilder("Shadi", "Bdair")
				.address("426, Spain ")
				.age(21)
				.phoneNumber("007")
				.build();
		
		System.out.println(Shadi);
	}

}


//Hello Everyone I Know you this is the END
//Name: Shadi Bdair
//Age: 21 Phone: 007 Address: 426, Spain 
