package StepDefenition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pageObject.teamPage.CheckInsPage;
import pageObject.teamPage.TeamPage;

import static StepDefenition.HookStep.driver;

public class CheckInStep {

    private final CheckInsPage checkIns = new CheckInsPage(driver);

    /**
     * CI-001
     */

    @Given("User is on team page")
    public void isOnTeamPage() {
        Assert.assertEquals(new TeamPage(driver).getTextTeamheader(), "QA-14-BP-C");

    }
    @When("User go to Check Ins page through box menu")
    public void UserGoToCheckInsPageThroughBoxMenu() {
        new TeamPage(driver).selectCheckIns();
    }
    @Then("User should see create CheckIn button")
    public void ShouldSeeCreateCheckInButton() {
        Assert.assertEquals(checkIns.getTextCheckInsBreadCrumb(),"Check-Ins");
        Assert.assertEquals(checkIns.getTextCheckInBtn(),"Create CheckIn");
    }

    /**
     * CI-003
     */
    @Given("User is on the Check Ins Page")
    public void isOnTheCheckInsPage() {
        new TeamPage(driver).selectCheckIns();
        Assert.assertEquals(checkIns.getPageCheckIns(),"Check In");
    }

    @When("User go to New Question Page through Create CheckIn button")
    public void UserGoToNewQuestionPageThroughCreateCheckInButton() {
        checkIns.clickCreateCheckInBtn();
    }

    @Then("User should see start collecting answers button")
    public void shouldSeeStartCollectingAnswersButton() {
       Assert.assertEquals(checkIns.getTextStartCollectingBtn(),"Start collecting answers");
    }

    /**
     * CI-004
     */
    @Given("User is on the new question page")
    public void isOnTheNewQuestionPage() {
        new TeamPage(driver).selectCheckIns();
        Assert.assertEquals(checkIns.getPageCheckIns(),"Check In");
        checkIns.clickCreateCheckInBtn();
        Assert.assertEquals(checkIns.getTextCheckInsBreadCrumb(),"Create Check-in");
    }

    @When("User fill the Question title with alphabetic {string}")
    public void fillTheQuestionTitleWithAlphabetic(String alphabet) {
        checkIns.inputQuestion(alphabet);
    }

    @And("User create question through Start collecting answers button")
    public void createQuestionThroughStartCollectingAnswersButton(){
        checkIns.clickStartCollectingAnswerBtn();
    }

    @Then ("User should be success create new question")
    public void shouldBeSuccessCreateNewQuestion(){
        Assert.assertEquals(checkIns.verifySuccessAlert(), "Create question successful");
    }

    /**
     * CI-007
     */
    @When("User choose one of question to be archived {string}")
    public void user_choose_one_of_question_to_be_archived(String alphabet) {
        checkIns.selectQuestionToBeArchived(alphabet);
//        Assert.assertTrue(checkIns.getQuestionIsArchived());
    }
    @Then("User should be success archived the question")
    public void user_should_be_success_archived_the_question() {
        Assert.assertEquals(checkIns.verifySuccessAlert(), "Archive Question successful");
    }







}
