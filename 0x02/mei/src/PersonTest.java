import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTest {

	Person person;

	@BeforeEach
	public void setup() {
		person = new Person("Paul", "McCartney", 2000, true, true, true);
	}

	@Test
	public void show_full_name() {

		assertEquals("Paul McCartney", person.fullName());
	}

	@Test
	public void test_calculateYearlySalary() {
		person.setSalary(1200);
        assertEquals(14400f, person.calculateYearlySalary());
	}

	@Test
	public void person_is_MEI() {

		person.setPensioner(false);
		person.setAnotherCompanyOwner(false);
		person.setPublicServer(false);
		assertTrue(person.isMEI());
	}

	@Test
	public void person_is_not_MEI() {

		assertFalse(person.isMEI());

	}

}
