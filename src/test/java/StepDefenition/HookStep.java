package StepDefenition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import pageObject.HomePage;
import pageObject.teamPage.TeamPage;

public class HookStep {

    protected static WebDriver driver;

    @Given("User login with existing email")
    public void loginWithExistingEmail(){
        driver.get("https://staging.cicle.app/signin");
        driver.navigate().refresh();

    }
    @When("User navigate to home page")
        public void navigateToHomePage(){
        new HomePage(driver)
                .selectCompany();

    }
    @And("User select the team")
    public void selectTheTeam(){
        new HomePage(driver)
                .selectTeam();
        Assert.assertEquals(new TeamPage(driver).getTitleTeam(), "Overview");

    }

    @Before
    public void setup(){
        ChromeOptions chrome_options = new ChromeOptions();
        chrome_options.addArguments("--disable-extensions");
        chrome_options.addArguments("--disable-popup-blocking");
        chrome_options.addArguments("--profile-directory=Default");
        chrome_options.addArguments("--ignore-certificate-errors");
        chrome_options.addArguments("--disable-plugins-discovery");
//        chrome_options.addArguments("--incognito");
        chrome_options.addArguments("user_agent=DN");
        chrome_options.addArguments("user-data-dir=/Users/fenyekaputri/Library/Application Support/Google/Chrome/");
        chrome_options.addArguments("--profile-directory=Default");
        System.setProperty("webdriver.chrome.driver", "/Users/fenyekaputri/Downloads/chromedriver");
       // driver = new ChromeDriver();
        driver = new ChromeDriver(chrome_options);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }
//    @After
//    public void quit(){
//        driver.quit();
//        driver.close();
//    }
}
