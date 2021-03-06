package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class СontactCreationTests extends TestBase {

  @Test
  public void testContactCreationTests() throws Exception {
    app.getContactHelper().gotoCreateСontactPage();
    app.getContactHelper().fillСontactForm(new ContactData("Sergey", "Pavlov", "xek0", "Kovrov", "89209314185", "sergg-ps@yandex.ru", "1991"));
    app.getContactHelper().submitСontactCreation();
    app.getContactHelper().returnToСontactPage();
  }

}
