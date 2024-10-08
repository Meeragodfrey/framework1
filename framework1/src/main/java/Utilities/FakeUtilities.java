package Utilities;

import com.github.javafaker.Faker;

public class FakeUtilities {

	public String getFakeFirstName() {

		Faker faker = new Faker();  

		String firstName = faker.name().firstName();
		return firstName;

	}
	public String getFakeSecondName() {

		Faker faker = new Faker();
 
		String lastName = faker.name().lastName(); 
		return lastName;

	}
}
