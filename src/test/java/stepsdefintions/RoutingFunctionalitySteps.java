package stepsdefintions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class RoutingFunctionalitySteps {
    public WebDriver driver ;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\chromedriver-win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Given("I am on the app HomePage")
    public void iAmOntheappHomePage(){
        driver.get("https://qaroutingtest.ccbp.tech/");
    }

    @When("I click on the about page")
    public void clickOnAboutsection(){
        driver.findElement(By.cssSelector("ul.nav-items-list :nth-child(2)")).click();
    }

    @Then("As a result Redirected to the about page visible")
    public void redirectedToAboutPage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe("https://qaroutingtest.ccbp.tech/about"));

        String currentURL  = driver.getCurrentUrl();
        Assert.assertEquals(currentURL,"https://qaroutingtest.ccbp.tech/about");
    }


    @When("I click on the contact page")
    public void clickOnContactsection(){
        driver.findElement(By.cssSelector("ul.nav-items-list :nth-child(3)")).click();
    }

    @Then("As a result Redirected to the contact page visible")
    public void redirectedToContactPage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe("https://qaroutingtest.ccbp.tech/contact"));

        String currentURL  = driver.getCurrentUrl();
        Assert.assertEquals(currentURL,"https://qaroutingtest.ccbp.tech/contact");
    }

    @And("I click on home page")
    public void clickOnHomePage(){
        driver.findElement(By.cssSelector("ul.nav-items-list :nth-child(1)")).click();

    }

    @Then("As a result Redirected to the home page visible")
    public void redirectedToHomePage(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe("https://qaroutingtest.ccbp.tech/"));

        String currentURL  = driver.getCurrentUrl();
        Assert.assertEquals(currentURL,"https://qaroutingtest.ccbp.tech/");
    }

}
