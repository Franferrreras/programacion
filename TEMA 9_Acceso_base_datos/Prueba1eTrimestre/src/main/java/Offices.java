public class Offices {

    private int officeCode;
    private String city;
    private String phone;
    private String addresLine1;
    private String addresLine2;
    private String state;
    private String country;
    private String postalCode;
    private String territory;

    public Offices(int officeCode, String city, String phone, String addresLine1, String addresLine2, String state, String country, String postalCode, String territory) {
        this.officeCode = officeCode;
        this.city = city;
        this.phone = phone;
        this.addresLine1 = addresLine1;
        this.addresLine2 = addresLine2;
        this.state = state;
        this.country = country;
        this.postalCode = postalCode;
        this.territory = territory;
    }

    public int getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(int officeCode) {
        this.officeCode = officeCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddresLine1() {
        return addresLine1;
    }

    public void setAddresLine1(String addresLine1) {
        this.addresLine1 = addresLine1;
    }

    public String getAddresLine2() {
        return addresLine2;
    }

    public void setAddresLine2(String addresLine2) {
        this.addresLine2 = addresLine2;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getTerritory() {
        return territory;
    }

    public void setTerritory(String territory) {
        this.territory = territory;
    }

    @Override
    public String toString() {
        return "Offices{" +
                "officeCode=" + officeCode + "\n" +
                ", city='" + city + '\'' + "\n" +
                ", phone='" + phone + '\'' + "\n" +
                ", addresLine1='" + addresLine1 + '\'' + "\n" +
                ", addresLine2='" + addresLine2 + '\'' + "\n" +
                ", state='" + state + '\'' + "\n" +
                ", country='" + country + '\'' + "\n" +
                ", postalCode='" + postalCode + '\'' + "\n" +
                ", territory='" + territory + '\'' + "\n" +
                '}' + "\n" ;
    }
}
