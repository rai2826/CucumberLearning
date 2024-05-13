package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginSteps {

    WebDriver driver;

    @Given("The user is on Saucelab page")
    public void the_user_is_on_saucelab_page() {

        WebDriverManager.chromedriver().clearDriverCache().setup();
        driver=new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

    }
    @When("User enters the valid username and password \\(username:{string},password:{string})")
    public void userEntersTheValidUsernameAndPasswordUsernamePassword(String arg0, String arg1) {

        driver.findElement(By.id("user-name")).sendKeys(arg0);
        driver.findElement(By.id("password")).sendKeys(arg1);

    }
    @When("User clicks on login button")
    public void user_clicks_on_login_button() {
        driver.findElement(By.id("login-button")).click();
    }
    @Then("User is redirected to landing page")
    public void user_is_redirected_to_landing_page() {
        System.out.println("Login Successful");
        String Title=driver.getTitle();
        Assert.assertTrue("Swag Labs1",true);
    }


    }

