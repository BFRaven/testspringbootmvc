package mvc.models;


public class ContactModel {

    private Integer contactId;
    private String firstName;
    private String lastName;
    private String  address;
    private String  city;
    private String  state;
    private String  zipCode;

    //region CONSTRUCTOR

    public ContactModel() {}


    //endregion



    //region GETTERS/SETTERS

    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    //endregion

    //region TO HELP WITH DEBUGGING

    public String ToString() {
        return "FirstName: " + this.firstName + "LastName: " + this.lastName + " - Address: " + this.address + ", " + this.city + ", " + this.state + ", " + this.zipCode;
    }


    //endregion
}
