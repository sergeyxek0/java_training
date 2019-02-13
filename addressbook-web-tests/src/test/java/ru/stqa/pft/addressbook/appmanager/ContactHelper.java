package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase{

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void returnToСontactPage() {
    click(By.linkText("Logout"));
  }

  public void submitСontactCreation() {
    click(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Notes:'])[1]/following::input[1]"));
  }

  public void fillСontactForm(ContactData contactDate) {
    type(By.name("firstname"), contactDate.getFirstname());
    type(By.name("lastname"), contactDate.getLastname());
    type(By.name("nickname"), contactDate.getMickname());
    type(By.name("address"), contactDate.getCity());
    type(By.name("mobile"), contactDate.getPhone());
    type(By.name("email"), contactDate.getEmail());
    type(By.name("byear"), contactDate.getBirthyear());
  }

  public void gotoCreateСontactPage() {
    click(By.linkText("add new"));
  }

  public void selectContact() {
    click(By.name("selected[]"));
  }

  public void deleteSelectedContact() {
    click(By.xpath("//*[@id=\"content\"]/form[2]/div[2]/input"));
  }

  public void gotoHomePage() {
    click(By.linkText("home"));
  }

  public void allertAcceptDeletion() {
    alertAccept();
  }

  public void initModificationContact() {
    click(By.xpath("//*[@id=\"maintable\"]/tbody/tr[2]/td[8]/a/img"));
  }
}
