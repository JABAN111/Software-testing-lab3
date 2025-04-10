// Generated by Selenium IDE


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import tpo.labs.Utils;

import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class SearchTest {

  private Map<String, Object> vars;
  private static JavascriptExecutor js;
  private static Utils utils;
  private static WebDriver driver;
  @BeforeAll
  public static void setUp(){
    utils = new Utils();
    utils.setupDriver();
    driver = utils.getDriver();
    //   wait = utils.getWaitTime();
      js = utils.getJsExecutor();

    //  homePage = new HomePage(driver);
  }

  @Test
  public void search() {
    driver.get("https://www.meetup.com/ru-RU/");
    driver.manage().window().setSize(new Dimension(853, 1064));
    {
      WebElement element = driver.findElement(By.xpath("//div[@id=\'page\']/header/div/div/div/div[3]/div/div/button/div"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.xpath("//main[@id=\'main\']/div[2]/div/div/div/a"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.xpath("//main[@id=\'main\']/div[2]/div/div/div/a")).click();
    driver.findElement(By.xpath("//form[@id=\'search-form\']/div/div/div/input")).click();
    driver.findElement(By.xpath("//form[@id=\'search-form\']/div/div/div/input")).sendKeys("Go");
    {
      WebElement element = driver.findElement(By.cssSelector("#search-button .injected-svg"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector("#search-button .injected-svg")).click();
    {
      WebElement element = driver.findElement(By.xpath("//button[@id=\'location-search-submit\']"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    js.executeScript("window.scrollTo(0,241)");

  }
}
