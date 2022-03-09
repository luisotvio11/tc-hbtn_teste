import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Person {

	private String name;
	private String surname;
	private int birthDate;
	private boolean anotherCompanyOwner;
	private boolean pensioner;
	private boolean publicServer;
	private float salary;

	public String fullName() {

		return name + " " + surname;

	}

	public Person(String name, String surname, int birthDate, boolean anotherCompanyOwner, boolean pensioner,
			boolean publicServer) {
		super();
		this.name = name;
		this.surname = surname;
		this.birthDate = birthDate;
		this.anotherCompanyOwner = anotherCompanyOwner;
		this.pensioner = pensioner;
		this.publicServer = publicServer;
	}

	public float calculateYearlySalary() {

		return salary * 12;

	}

	public int calculateAge() {

		return LocalDate.now().getYear() - birthDate;

	}

	public boolean isMEI() {

		if (calculateYearlySalary() < 130000 && calculateAge() >= 18) {

			return anotherCompanyOwner == false && pensioner == false && publicServer == false;
		}

		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
	}

	public boolean isAnotherCompanyOwner() {
		return anotherCompanyOwner;
	}

	public void setAnotherCompanyOwner(boolean anotherCompanyOwner) {
		this.anotherCompanyOwner = anotherCompanyOwner;
	}

	public boolean isPensioner() {
		return pensioner;
	}

	public void setPensioner(boolean pensioner) {
		this.pensioner = pensioner;
	}

	public boolean isPublicServer() {
		return publicServer;
	}

	public void setPublicServer(boolean publicServer) {
		this.publicServer = publicServer;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
