package resources;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Base {


    public WebDriver initializeDriver() throws IOException {

        System.setProperty("webdriver.chrome.driver","/Users/raghguru/Desktop/Selenium-Dpka/chromedriver");
        WebDriver driver = new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return driver;
    }



}
