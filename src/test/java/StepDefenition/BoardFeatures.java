package StepDefenition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pageObject.teamPage.BoardPage;
import pageObject.teamPage.TeamPage;

import static StepDefenition.HookStep.driver;

public class BoardFeatures {

    private final BoardPage board = new BoardPage(driver);


    /**
     * Board-001
     */
    @Given("User already on kanban board page")
    public void alreadyOnKanbanBoardPage(){
        new TeamPage(driver).selectBoard();
        Assert.assertEquals("Kanban Board", board.verifyBoardName());

    }

    @And("User click add list")
    public void userClickAddList() {
        board.addNewList();
    }
    @And("User type list name {string}")
    public void userTypeListName(String listName) throws InterruptedException {
        board.getListName(listName);
    }
    @When("User click create button")
    public void clickCreateBtn() {
        board.createListBtn();
    }
    @Then("User should be success create new list")
    public void successCreateNewList() {
        Assert.assertEquals(board.getListName(), "Big Project 8");
    }

    /**
     * Board-002
     */
    @And("User not fill list name")
    public void emptyListName() {
        board.addListEmptyName();
    }

    @Then("User should be failed create new list")
    public void failedCreateNewList() {
        Assert.assertEquals(board.getPopUpMessage(),"List name cannot be empty");
        String popup = board.getPopUpMessage();
        System.out.println(popup);
    }

    /**
     * Board-003
     */
    @And("User click add card icon")
    public void addCardIcon(){
        board.addNewCardButton();
    }

    @And("User type card name {string}")
    public void cardName(String cardName){
        board.inputCardName(cardName);
    }

    @When("User click add card button")
    public void addCardButton(){
        board.addNewList();
    }

    @Then("User should be success add new card")
    public void successAddNewCard() {
        Assert.assertEquals(board.getCardName(), "Test Case 7");
        Assert.assertEquals(board.getPopUpMessage(),"Creating card is success");
    }

    /**
     * Board-004
     */
    @And("User not fill card name")
    public void emptyCardName(){
        board.addCardEmptyName();
    }

    @Then("User should be failed add card")
    public void failedAddCard() {
        Assert.assertEquals(board.getPopUpMessage(),"Card name cannot be empty");
        String popup = board.getPopUpMessage();
        System.out.println(popup);
    }

    /**
     * Board-005
     */
    @And("User click small card")
    public void clickSmallCard() {
        board.buttonLastCard();
    }

    @And("User click notes button")
    public void clickNotesButton() {
        board.addNotes();
    }
    @And("User fill notes {string}")
    public void fillNotes(String notes) {
        board.getNotes(notes);
    }

    @When("User click save")
    public void clickSave() {
        board.saveNotesButton();
    }
    @Then("User should be success fill notes")
    public void successFillNotes() {
        Assert.assertEquals(board.getTextNotes(), "Update card is success");
    }

    /**
     * Board-006
     */
    @When("User click menu attach file")
    public void clickMenuAttachFile() throws InterruptedException {
        board.addAttachmentsOnSmallCard();
    }
    @Then("User should be success attached the files")
    public void successAttachedTheFiles() {
        board.getAttachFiles();
    }

    /**
     * Board-007
     */
    @And("User click add card members")
    public void addCardMembers() {
        board.addCardMembers();
    }

    @And("User type team members {string}")
    public void typeTeamMembers(String members) {
        board.getTeamMember(members);
    }
    @And("User select team members")
    public void selectTeamMembers() {
        board.selectMembers();
    }
    @When("User click apply members button")
    public void clickApplyMembersButton() {
        board.applyMembersButton();
    }
    @Then("User should be success add new members")
    public void successAddNewMembers() {
        Assert.assertTrue(board.memberIsDisplayed());
    }

    /**
     * Board-008
     */

    @And("User click labels card")
    public void clickLabelsCard() {
        board.addNewLabels();
    }
    @And("User type label name {string}")
    public void typeLabelName(String labels) {
        board.getLabelsName(labels);
    }

    @When("User click create label button")
    public void clickCreateLblBtn() {
        board.createLabels();
    }

    @Then("User should be success add labels")
    public void successAddLabels() {
        Assert.assertEquals(board.getLabels(),"Test 6");
        board.closeLabels();
    }

    /**
     * Board-009
     */
    @And("User not fill labels name")
    public void notFillLabelsName() throws InterruptedException {
        board.createLabelUsingEmptyData();
    }

    @Then("Then User should be can't add labels")
    public void cantAddLabels() {
        Assert.assertEquals(board.getPopUpMessage(),"Label name cannot be empty");
        String popup = board.getPopUpMessage();
        System.out.println(popup);
    }

    /**
     * Board-010
     */
    @And("User fill add comments {string}")
    public void user_fill_add_comments(String comments){
        board.commentOnCard(comments);
    }
    @When("User click post button")
    public void user_click_post_button() {
        board.buttonPostComment();
    }
    @Then("User should be success create new comments")
    public void user_should_be_success_create_new_comments(){
        Assert.assertEquals(board.getComment(), "Completed the card part I");
    }

    /**
     * Board-016
     */
    @When("User click archive menu")
    public void user_click_archive_menu() {
        board.archivedList();
    }
    @Then("User should be success archived the card")
    public void user_should_be_success_archived_the_card() {
        Assert.assertEquals(board.getPopUpMessage(),"Big project list has been moved to archived");
    }

    /**
     * Board-018
     */
    @When("User restore cards from archived items {string}")
    public void restoreCardsFromArchivedItems(String list) throws InterruptedException {
        board.restoreList(list);
    }
    @Then("User Should be success unarchived lists")
    public void successUnarchivedlists() {
        Assert.assertEquals(board.getPopUpMessage(), "Unarchiving list with cards is success");
    }

}
