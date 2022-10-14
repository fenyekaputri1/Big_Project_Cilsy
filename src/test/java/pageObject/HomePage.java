package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[.='Sekolah QA']")
    private WebElement selectCompany;
    @FindBy(xpath = "//p[.='Sekolah QA']")
    private WebElement getSekolahQAName;


    @FindBy(xpath = "//div[@class='DashboardPage_container__2bMGZ']/div[@class='DashboardPage_DashboardPage__flex__2rA7e']" +
            "/a[@href='/companies/61eba2c85080f47b25ddc8f8/teams/632e858a3c6e10177263cc74']")
    private WebElement selectTeam;


    public HomePage selectCompany(){
        clickElement(selectCompany);
        return this;
   }

    public String getSekolahQAName(){
        return getTextElement(getSekolahQAName);

    }

    public void selectTeam(){
        clickElement(selectTeam);
    }







}
