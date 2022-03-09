import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest {

	Person person;

	@BeforeEach
	public void setup() {
		person = new Person("Paul", "McCarney", 2000, true, true, true);
	}

	@Test
	public void show_full_name() {

		assertEquals("Paul McCartney", person.fullName());
	}

	@Test
	public void test_calculateYearySalary() {
		person.setSalary(1200);
		assertEquals(14000, person.calculateYearlySalary());
	}

	@Test
	public void person_is_MEI() {

		person.setAnotherCompanyOwner(false);
		person.setPensioner(false);
		person.setPublicServer(false);

		assertTrue(person.isMEI());
	}

	public void person_is_not_MET() {

		person.setAnotherCompanyOwner(true);
		person.setPensioner(true);
		person.setPublicServer(true);

		assertFalse(person.isMEI());

	}

}
