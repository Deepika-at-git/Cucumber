package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import resources.Base;

import java.io.IOException;

public class stepDefinition extends Base {

    WebDriver driver = initializeDriver();

    public stepDefinition() throws IOException {
    }

    @Given("^User should be on Target Home landing page$")
    public void userShouldBeOnTargetHomeLandingPage() {


        driver.get("https://facebook.com/");


    }

    @When("^User logs into the application with valid username and password$")
    public void userLogsIntoTheApplicationWithValidUsernameAndPassword() throws InterruptedException {


        driver.findElement(By.id("email")).sendKeys("dpka3012@gmail.com");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("******");

    }

    @Then("^Home page is displayed$")
    public void homePageIsDisplayed() {
        driver.findElement(By.xpath("//button[@name='login']")).click();
    }

    @And("^Search tab is displayed$")
    public void searchTabIsDisplayed() {
        Assert.assertTrue(driver.findElement(By.xpath("//input[@type='search']")).isDisplayed());
    }


}
