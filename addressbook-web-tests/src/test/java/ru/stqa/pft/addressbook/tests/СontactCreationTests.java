package ru.stqa.pft.addressbook.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import ru.stqa.pft.addressbook.model.ContactData;

public class СontactCreationTests extends TestBase {

  @Test
  public void testContactCreationTests() throws Exception {
    app.getContactHelperl().gotoCreateСontactPage();
    app.getContactHelperl().fillСontactForm(new ContactData("Sergey", "Pavlov", "xek0", "Kovrov", "89209314185", "sergg-ps@yandex.ru", "1991"));
    app.getContactHelperl().submitСontactCreation();
    app.getContactHelperl().returnToСontactPage();
  }

}
