public class Employees {

    private int employeeNumber;
    private String lastName;
    private String firstName;
    private String extension;
    private String email;
    private String officeCode;
    private int reposrtTo;
    private String jobTitle;


    public Employees(int employeeNumber, String lastName, String firstName, String extension, String email, String officeCode, int reposrtTo, String jobTitle) {
        this.employeeNumber = employeeNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.extension = extension;
        this.email = email;
        this.officeCode = officeCode;
        this.reposrtTo = reposrtTo;
        this.jobTitle = jobTitle;
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
    }

    public int getReposrtTo() {
        return reposrtTo;
    }

    public void setReposrtTo(int reposrtTo) {
        this.reposrtTo = reposrtTo;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "employeeNumber=" + employeeNumber + "\n" +
                ", lastName='" + lastName + '\'' +  "\n" +
                ", firstName='" + firstName + '\'' + "\n" +
                ", extension='" + extension + '\'' + "\n" +
                ", email='" + email + '\'' + "\n" +
                ", officeCode='" + officeCode + '\'' + "\n" +
                ", reposrtTo=" + reposrtTo + "\n" +
                ", jobTitle='" + jobTitle + '\'' + "\n" +
                '}' + "\n" ;
    }
}
