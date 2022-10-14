package pageObject.teamPage;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.BasePage;

public class CheckInsPage extends BasePage {

    public CheckInsPage(WebDriver driver){
        super(driver);
    }

    /**
     * Button Element
     */
    @FindBy(css = ".GlobalActionButton_container__EJ7Lh")
    private WebElement createCheckInsBtn;

    @FindBy(css = ".btn.btn-success")
    private WebElement startCollectinAnswersBtn;

    @FindBy(xpath = "//div[@class='RoundActionMenu_container__2ta8s RoundActionMenu_medium__3rLho']")
    private WebElement roundActionMenu;

    @FindBy(xpath = "(//div[@class='QuestionMenu_menu__3nDO6'])[2]")
    private WebElement archiveThisQuestionBtn;

    /**
     * Input Element
     */
    @FindBy(xpath = "//input[@class='form-control']")
    private WebElement textFieldQuestion;

    /**
     * Get Element
     */
    @FindBy(xpath = "//div[@class='BreadcrumbContainer_separateRoute__26-Ut']/span")
    private WebElement getTextCheckInsBreadcrumb;

    @FindBy(xpath = "//div[@class='OverviewOptionButton_container__M-oKs']//p")
    private WebElement getPageCheckIns;

    @FindBy(id = "notistack-snackbar")
    private WebElement successAlert;

    @FindBy(xpath = "//a[@class='LinkNoDecor_Link__3DEkL'][1]")
    private WebElement questionContainer;



    @FindBy(xpath = "//div[@class='QuestionPage_archivedSection__1VczP']")
    private WebElement archivedLabel;

    public String getTextCheckInsBreadCrumb(){
        return getTextElement(getTextCheckInsBreadcrumb);
    }

    public String getPageCheckIns(){
        return getTextElement(getPageCheckIns);
    }

    public String getTextCheckInBtn(){
        return getTextElement(createCheckInsBtn);
    }

    /**
     * CI_003
     */
    public void clickCreateCheckInBtn() {
        clickElement(createCheckInsBtn);
    }
    public String getTextStartCollectingBtn(){
       return getTextElement(startCollectinAnswersBtn);
    }

    /**
     * CI_004
     */

    public void inputQuestion(String question){
        waitVisibilityElement(getPageCheckIns);
        clickElement(textFieldQuestion);
        textFieldQuestion.sendKeys(question);
    }

    public void clickStartCollectingAnswerBtn() {
        waitVisibilityElement(getTextCheckInsBreadcrumb);
        clickElement(startCollectinAnswersBtn);
    }

    public String verifySuccessAlert(){
        return getTextElement(successAlert);
    }

    /**
     * CI-007
     */
    public CheckInsPage selectQuestionToBeArchived(String titleQuestion) {
        waitVisibilityElement(questionContainer);
        boolean isTrue = readText(questionContainer).contains(titleQuestion);
        if (isTrue == true) {
            clickElement(questionContainer);
            clickElement(roundActionMenu);
            clickElement(archiveThisQuestionBtn);
        }
        return this;
    }

//    public boolean getQuestionIsArchived() {
//        return isElementDisplayed(archivedLabel);
//    }

}













