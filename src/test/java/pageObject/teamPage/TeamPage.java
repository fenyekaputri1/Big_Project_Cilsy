package pageObject.teamPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.BasePage;

public class TeamPage extends BasePage {

    public TeamPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//h1[normalize-space()='QA-14-BP-C']")
    private WebElement getTextTeamHeader;

    @FindBy(xpath = "//div[@class='OverviewOptionButton_container__M-oKs']//p")
    private WebElement verifyTeamPage;

    @FindBy(xpath = "(//div[@class='BoxMenu_container__1flgD'])[1]")
    private WebElement selectGroupChat;

    @FindBy(xpath = "(//div[@class='BoxMenu_container__1flgD'])[4]")
    private WebElement selectBoard;

    @FindBy(xpath = "(//div[@class='BoxMenu_container__1flgD'])[5]")
    private WebElement selectCheckIns;

    public String getTextTeamheader() {
        return getTextElement(getTextTeamHeader);
    }

    public void selectGroupChat(){
        clickElement(selectGroupChat);
    }

    public void selectBoard(){
        clickElement(selectBoard);
    }

    public void selectCheckIns(){
        clickElement(selectCheckIns);
    }

    public String getTitleTeam(){
        return getTextElement(verifyTeamPage);
    }
}

