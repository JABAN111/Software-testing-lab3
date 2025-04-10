package tpo.labs;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class Utils {
    public WebDriver driver;
    public JavascriptExecutor js;
    public Map<String, Object> vars;
    public WebDriverWait wait;

    public void setupDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));
        driver.manage().window().setSize(new Dimension(1050, 716));
        js = (JavascriptExecutor) driver;
        vars = new HashMap<>();
        driver.get("https://www.meetup.com/ru-RU/");
    }

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWaitTime() {
        return wait;
    }

    public JavascriptExecutor getJsExecutor() {
        return js;
    }

    public Map<String, Object> getVars() {
        return vars;
    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    public void switchToFrameWithLocator(By element) {
        List<WebElement> frames = driver.findElements(By.tagName("iframe"));
        for (WebElement frame : frames) {
            driver.switchTo().frame(frame);
            List<WebElement> elements = driver.findElements(element);

            if (!elements.isEmpty()) {
                System.out.println("Нужный frame найден!");
                return;
            }
            driver.switchTo().defaultContent();
        }
        throw new NoSuchElementException("Frame с элементом не найден!");
    }

}
