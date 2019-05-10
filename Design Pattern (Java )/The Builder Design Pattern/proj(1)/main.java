import org.omg.CORBA.ObjectHolder;

public class main {

	public static void main(String[] args) {

		Person olPerson = new Person.Builder("Shadi", "Bdair")
				.phone("007")
				.address("Valladolid")
				.age(21)
				.build();
		
		System.out.println(olPerson);
	}

}


// Name: Shadi Bdair  Phone: 007  age: 21  Address: Valladolid