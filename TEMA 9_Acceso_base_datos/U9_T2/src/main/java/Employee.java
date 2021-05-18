public class Employee {

    private final Integer employeeId;
    private final String lastName;
    private final String firstName;
    private final String email;
    private final String officeCode;
    private final String specialitation;


    public Employee(Integer employeeid, String lastName, String firstName, String email, String officeCode, String specialitation) {
        this.employeeId = employeeid;
        this.lastName = lastName;
        this.firstName = firstName;
        this.email = email;
        this.officeCode = officeCode;
        this.specialitation = specialitation;
    }

    public Integer getEmployeeid() {
        return employeeId;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getEmail() {
        return email;
    }

    public String getOfficeCode() {
        return officeCode;
    }

    public String getSpecialitation() {
        return specialitation;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeid=" + employeeId +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", email='" + email + '\'' +
                ", officeCode='" + officeCode + '\'' +
                ", specialitation='" + specialitation + '\'' +
                '}';
    }
}
