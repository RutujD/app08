package app08.com.test;

public class Employee {
	private String employeeNumber;
    private String lastName;
    private String firstName;
    private String gender;

    public Employee(String employeeNumber, String lastName, String firstName, String gender) {
        this.employeeNumber = employeeNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.gender = gender;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGender() {
        return gender;
    }

}
