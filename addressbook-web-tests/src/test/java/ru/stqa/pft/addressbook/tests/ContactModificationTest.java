package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTest extends TestBase {

  @Test
  public void testModificationContact(){
    app.getContactHelper().gotoHomePage();
    app.getContactHelper().initModificationContact();
    app.getContactHelper().fillСontactForm(new ContactData("Sergey", "Pavlov", "xek0", "Kovrov", "89209314185", "sergg-ps@yandex.ru", "1991"));
    app.getContactHelper().submitСontactCreation();
    app.getContactHelper().returnToСontactPage();
  }
}
