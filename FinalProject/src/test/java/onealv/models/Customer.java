package onealv.models;

public class Customer {

    String firstName;
    String lastName;
    String eMail;
    String phoneNumber;
    String receiveNews;

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

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getReceiveNews() {
        return receiveNews;
    }

    public void setReceiveNews(String receiveNews) {
        this.receiveNews = receiveNews;
    }
}
