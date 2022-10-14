package StepDefenition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObject.teamPage.GroupChatPage;
import pageObject.teamPage.TeamPage;

import static StepDefenition.HookStep.driver;

public class GrouChatStep {

    private final GroupChatPage groupChat = new GroupChatPage(driver);

    /**
     * GC_001
     */
    @Given("User already on group chat page")
    public void landingOnGroupChat() {
        new TeamPage(driver).selectGroupChat();
        Assert.assertEquals(groupChat.getPageGroupChat(),"Group Chat");
    }

    @And("User type a message {string}")
    public void typeMessage(String message) throws InterruptedException {
        groupChat.inputMessage(message);
    }

    @When("User click send button")
    public void clickSendButton() {
        groupChat.buttonSendMessage();
    }

    @Then("User should be success send a message")
    public void successSendAMessage() throws InterruptedException {
        Assert.assertEquals(groupChat.getLastMessage(),"Haloooo");
    }

    /**
     * GC_002
     */
    @When("User deleted an existing chat message")
    public void deletedExistingChatMessage() {
        groupChat.deleteMessage();
    }
    @Then("User should be success delete message {string}")
    public void successDeleteMessage(String message) {
        Assert.assertEquals(groupChat.getLastDeleteChat(), message);
    }
    @Then("Appear pop up message {string}")
    public void popUpMessage(String popUpMessage) {
        Assert.assertEquals(groupChat.getPopUpMessage(), popUpMessage);
    }

    /**
     * GC_003
     */

    @When("User attach the files")
    public void attachTheFiles() throws InterruptedException {
        groupChat.attachFile();
    }

    @Then("User should be success attach files")
    public void ShouldBeSuccessAttachFiles() throws InterruptedException {
        Assert.assertEquals(groupChat.getSuccessAttachFiles(),"Upload attachments is success");
    }

}
