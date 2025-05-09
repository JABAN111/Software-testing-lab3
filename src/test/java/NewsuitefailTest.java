// Generated by Selenium IDE

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import tpo.labs.Utils;

public class NewsuitefailTest {
  private static Utils utils;
  private static WebDriver driver;

  @BeforeAll
  public static void setUp() {
    utils = new Utils();
    utils.setupDriver();
    driver = utils.getDriver();
  }

  @AfterAll
  public static void tearDown() {
    driver.quit();
  }

  @Test
  public void fail() {
    driver.get("https://www.meetup.com/ru-RU/");
    driver.manage().window().setSize(new Dimension(1728, 1079));
    driver.findElement(By.xpath("//a[contains(text(),\'Зарегистрироваться\')]")).click();
    {
      {
        {
          WebElement element = driver.findElement(By.xpath("//button[@id=\'email-register\']/span"));
          Actions builder = new Actions(driver);
          builder.moveToElement(element).perform();
        }
      }
    }
    driver.findElement(By.xpath("//button[@id=\'email-register\']/span")).click();
    driver.findElement(By.xpath("//input[@id=\'name\']")).sendKeys("negr");
    driver.findElement(By.xpath("//input[@id=\'email\']")).click();
    driver.findElement(By.xpath("//input[@id=\'email\']")).sendKeys("negr@negr.negr");
    driver.findElement(By.xpath("//div[@id=\'modal\']/div/div/div/div/section/form/div[2]/div[3]/div/div")).click();
    driver.findElement(By.xpath("//input[@id=\'new-password\']")).click();
    driver.findElement(By.xpath("//input[@id=\'new-password\']"))
        .sendKeys("opkcdsopfdaisopfiopdsfiopsidpofiopdsfiopidsopf");
    driver.findElement(By.xpath("//div[@id=\'modal\']/div/div/div/div/section/form/div[2]/div[4]/div[2]/label"))
        .click();
    driver.switchTo().defaultContent();

    driver.findElement(By.xpath("//button[@name=\'submitRegistrationButton\']")).click();
    {
      WebElement element = driver.findElement(By.xpath("//button[@name=\'submitRegistrationButton\']"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
  }
}
