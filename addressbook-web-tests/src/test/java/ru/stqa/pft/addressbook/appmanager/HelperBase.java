package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;

public class HelperBase {
  protected WebDriver wd;

  public HelperBase(WebDriver wd) {

    this.wd = wd;
  }

  protected void click(By locator) {

    wd.findElement(locator).click();
  }

  protected void type(By Locator, String text) {
    click(Locator);
    wd.findElement(Locator).clear();
    wd.findElement(Locator).sendKeys(text);
  }

  private boolean isAlertPresent() {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  protected void alertAccept(){
    wd.switchTo().alert().accept();
  }
}
