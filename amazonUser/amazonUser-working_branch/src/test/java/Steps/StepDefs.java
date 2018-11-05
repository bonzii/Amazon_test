package Steps;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import java.lang.Throwable;

public class StepDefs{


    WebDriver driver;

    @Before
    public void setDriver() {
//        WebDriver driver; //local variable
        System.setProperty("webdriver.chrome.driver", "/C:/drivers/chromedriver.exe");

        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        this.driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);

    }

    @Given("^Amazon\\.co\\.uk is open$")
    public void amazon_co_uk_is_open() throws Throwable {
        driver.get("https://www.amazon.co.uk/");
        driver.manage().window().maximize();

    }

    @When("^I click on the sign in button$")
    public void i_click_on_the_sign_in_button() throws Throwable {
        driver.findElement(By.id("nav-link-yourAccount")).click();

    }

    @When("^I enter a valid Email$")
    public void i_enter_a_valid_Email() throws Throwable {
        driver.findElement(By.id("ap_email")).sendKeys("learnrubyagain@gmail.com");

    }

    @When("^click the continue button$")
    public void click_the_continue_button() throws Throwable {
        driver.findElement(By.id("continue")).click();

    }

    @When("^type in my password$")
    public void type_in_my_password() throws Throwable {
       driver.findElement(By.id("ap_password")).sendKeys("LearnRubyAgain2018");

    }

    @When("^click the sign in button$")
    public void click_the_sign_in_button() throws Throwable {
        driver.findElement(By.id("signInSubmit")).click();
    }

    @Then("^I am logged into my account$")
    public void i_am_logged_into_my_account() throws Throwable {

    }

    }

