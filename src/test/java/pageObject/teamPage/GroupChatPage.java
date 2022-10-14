package pageObject.teamPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.BasePage;

public class GroupChatPage extends BasePage {

    public GroupChatPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Input Element
     */
    @FindBy(xpath = "//div[@class='fr-element fr-view']")
    private WebElement typeMessage;

    /**
     * Get Element
     */
    @FindBy(xpath = "//div[@class='OverviewOptionButton_container__M-oKs']//p")
    private WebElement getPageGroupChat;

    @FindBy(xpath = "(//div[@class='fr-view']/p)[1]")
    private WebElement getLastMessage;

    @FindBy(xpath = "(//div[@class='Message_content__21YIN']/i)[1]")
    private WebElement getLastDeleteChat;

    @FindBy(id = "notistack-snackbar")
    private WebElement getPopUpMessage;

    @FindBy(xpath = "//div[@class='SnackbarItem-wrappedRoot css-96yce9']")
    private WebElement getAttachFiles;

    /**
     * Button Element
     */
    @FindBy(className = "CreateMessage_send__2f1ZQ")
    private WebElement buttonSendMessage;

    @FindBy(xpath = "(//div[@class='Message_iconOption__3F-Ru'])[1]")
    private WebElement buttonMessageOption;

    @FindBy(className = "MessageMenuPopUp_menu__1rkRG")
    private WebElement buttonDeleteMessage;

    @FindBy(css = ".btn")
    private WebElement buttonConfirmDelete;

    @FindBy(xpath = "//input[@type='file']")
    private WebElement attachChatButton;

    public String getPageGroupChat() {
        return getTextElement(getPageGroupChat);
    }

    public String getLastMessage() throws InterruptedException {
        Thread.sleep(2000);
        return getTextElement(getLastMessage);
    }

    public String getLastDeleteChat() {
        return getTextElement(getLastDeleteChat);
    }

    public String getPopUpMessage() {
        return getTextElement(getPopUpMessage);
    }


    /**
     * GC_001
     */
    public void inputMessage(String message) throws InterruptedException {
        Thread.sleep(1000);
        typeMessage.sendKeys(message);
    }

    public void buttonSendMessage() {
        clickElement(buttonSendMessage);
    }

    /**
     * GC_002
     */
    public void deleteMessage(){
        clickElement(getLastMessage);
        clickElement(buttonMessageOption);
        clickElement(buttonDeleteMessage);
        clickElement(buttonConfirmDelete);
    }

    /**
     * GC_003
     */
    public void attachFile() throws InterruptedException {
        Thread.sleep(3000);
        attachChatButton.sendKeys("/Users/fenyekaputri/Documents/Picture/people.jpeg");
    }

    public String getSuccessAttachFiles(){
        return getTextElement(getAttachFiles);
    }

}
