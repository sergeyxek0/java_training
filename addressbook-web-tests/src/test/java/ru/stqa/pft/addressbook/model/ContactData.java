package ru.stqa.pft.addressbook.model;

public class ContactData {
  private final String firstname;
  private final String lastname;
  private final String mickname;
  private final String city;
  private final String phone;
  private final String email;
  private final String birthyear;

  public ContactData(String firstname, String lastname, String mickname, String city, String phone, String email, String birthyear) {
    this.firstname = firstname;
    this.lastname = lastname;
    this.mickname = mickname;
    this.city = city;
    this.phone = phone;
    this.email = email;
    this.birthyear = birthyear;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public String getMickname() {
    return mickname;
  }

  public String getCity() {
    return city;
  }

  public String getPhone() {
    return phone;
  }

  public String getEmail() {
    return email;
  }

  public String getBirthyear() {
    return birthyear;
  }
}
