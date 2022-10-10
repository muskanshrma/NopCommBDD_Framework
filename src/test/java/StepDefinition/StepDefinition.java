package StepDefinition;

import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class StepDefinition {
    WebDriver driver;

    @Given("User is on Login Page")
    public void User_is_on_Login_Page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.saucedemo.com/");
    }

    @When("User enter {string} and {string}")
    public void User_enter_username_and_password(String uname, String pass) {
        driver.findElement(By.id("user-name")).sendKeys(uname);
        driver.findElement(By.id("password")).sendKeys(pass);
    }

    @And("User click on login button")
    public void User_click_on_login_button() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("^User is on Inventory page$")
    public void User_is_on_Inventory_page() {
        String act = driver.getCurrentUrl();
        String ext = "https://www.saucedemo.com/inventory.html";
        driver.close();
        Assert.assertEquals(ext, act);
    }

    @Then("User is on Home page")
    public void Then_User_is_on_Home_page() {
        String act = driver.getCurrentUrl();
        String ext = "https://www.saucedemo.com/";
        driver.close();
        Assert.assertEquals(ext, act);
    }
}