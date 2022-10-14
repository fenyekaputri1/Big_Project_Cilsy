package pageObject.teamPage;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pageObject.BasePage;

public class BoardPage extends BasePage {

    public BoardPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='BreadcrumbContainer_separateRoute__26-Ut']/span")
    private WebElement verifyBoardName;

    /**
     * Button Element
     */
    @FindBy(css = ".Button_container__1WNuB")
    private WebElement addListButton;

    @FindBy(xpath = "(//div[@class='ListContainer_ListContainer__buttonBottom__2kZAI'])[1]")
    private WebElement addCardButton;

    @FindBy(css = ".ManageDesc_sectionEmptyDesc__md0ll")
    private WebElement buttonNotes;

    @FindBy(css = ".Button_container__1WNuB")
    private WebElement createListButton;

    @FindBy(xpath = "(//div[@class='ListCard_ListContainer__listCardsSection__3GBpr']/div/div/div/div[1])[last()]")
    private WebElement buttonLastCard;

    @FindBy(xpath = "(//div[@class='ListCard_ListContainer__listCardsSection__3GBpr']/div/div/div/div[1])[last()-3]")
    private WebElement buttonLastCard1;

    @FindBy(css = ".btn-success")
    private WebElement buttonSave;

    @FindBy(xpath = "//button[contains(.,'Members')]")
    private WebElement buttonMembers;

    @FindBy(css = ".ManageMultipleMembersContainer_ManageMultipleMembersContainer__teamMember__2gp8L")
    private WebElement selectMembers;

    @FindBy(css = ".Main_container__3r1Cm")
    private WebElement buttonApplyMembers;

    @FindBy(xpath = "//div[@class='ManageMultipleMembersContainer_ManageMultipleMembersContainer_Header_10i5j']/*[name()='svg']")
    private WebElement buttonCloseMembers;

    @FindBy(xpath = "//button[contains(.,'Labels')]")
    private WebElement buttonLabels;

    @FindBy(css = ".ToggleLabels_plusButton__3YgnQ")
    private WebElement buttonAddLabels;

    @FindBy(xpath = "//div[29]")
    private WebElement selectColors;

    @FindBy(css = ".btn-success")
    private WebElement buttonCreateLabels;

    @FindBy(xpath = "//button[@class='Main_container__3r1Cm']")
    private WebElement buttonApplyLabels;

    @FindBy(xpath = "//div[@class='ManageLabelsContainer_ManageLabelsContainer__Header__2ZJCk']/*[name()='svg']")
    private WebElement buttonCloseLabels;


    @FindBy(xpath = "//div[@class='GlobalActionButton_outlinedContainer__DLFAv'][2]")
    private WebElement buttonArchivedItems;

    @FindBy(className = "btn-dark")
    private WebElement buttonSwitchInArchived;

    @FindBy(className = "btn-light")
    private WebElement buttonRestoreList;

    @FindBy(xpath = "(//div[@class='ListContainer_headerSection__more__3On04'])[last()]")
    private WebElement buttonOptionList;

    @FindBy(xpath = "(//div[@class='ListMenu_bodySection__1jhZS'])/div/div/div[2]")
    private WebElement buttonArchiveList;

    @FindBy(css = ".Main_container__1eDyl")
    private WebElement buttonComment;

    @FindBy(xpath = "//button[.='Post']")
    private WebElement buttonPost;

    @FindBy(xpath = "//button[contains(.,'Attach File')]")
    private WebElement buttonAttachFile;

    /**
     * Input Element
     */
    @FindBy(name = "name")
    private WebElement inputListName;

    @FindBy(className = "form-control")
    private WebElement inputCardName;

    @FindBy(css = ".fr-element")
    private WebElement inputNotes;

    @FindBy(className = "Main_primary__1LaSp")
    private WebElement inputMemberName;

//    @FindBy(xpath = "//div[@class='CardDetailContainer_box__3ALFs']//input[1]")
//    private WebElement inputAttachFile;

    @FindBy(xpath = "//div[@class='ManageAttachments_askDropContainer__aTIyn']")
    private WebElement inputAttachFile;

    /**
     * Get Element
     */
    @FindBy(xpath = "//div[@class='ListContainer_headerSection__title__text__36H_r']/h1")
    private WebElement getListName;

    @FindBy(xpath = "(//div[@class='ListCard_ListDroppable__1sdGc']//div[1]//h1)[1]")
    private WebElement getCardName;

    @FindBy(id = "notistack-snackbar")
    private WebElement getPopUpMessage;

    @FindBy(xpath = "//div[@class='fr-view']")
    private WebElement getTextNotes;

    @FindBy(xpath = "//div[@class='Members_container__3tjFi']/div[last()-1]")
    private WebElement getLastMembers;

    @FindBy(xpath = "(//div[@class='Label_label__block__3aY7I']/p)[last()]")
    private WebElement getLabels;

    @FindBy(xpath = "(//div[@class='ManageAttachments_titleSection__3I823']/h1)[1]")
    private WebElement getAttachFileName;

    @FindBy(xpath = "//div[@class='fr-view']")
    private WebElement getComment;


    /**
     * Board-001
     */
    public String verifyBoardName() {
        return getTextElement(verifyBoardName);
    }

    public void addNewList() {
        waitVisibilityElement(verifyBoardName);
        clickElement(addListButton);
    }

    public void getListName(String listName) throws InterruptedException {
        inputListName.sendKeys(listName);
    }

    public void createListBtn() {
        clickElement(createListButton);
    }

    public String getListName() {
        return getTextElement(getListName);
    }

    public String getPopUpMessage() {
        return getTextElement(getPopUpMessage);
    }

    /**
     * Board-002
     */
    public void addListEmptyName(){
        waitVisibilityElement(verifyBoardName);
        setTextElement(inputListName,"");
    }

    /**
     * Board-003
     */
    public void addNewCardButton(){
        waitVisibilityElement(addCardButton);
        System.out.println("add card button"  + addCardButton);
        clickElement(addCardButton);
    }

    public void inputCardName(String cardName){
        inputCardName.sendKeys(cardName);
    }

    public String getCardName(){
        return getTextElement(getCardName);
    }

    /**
     * Board-004
     */
    public void addCardEmptyName(){
        waitVisibilityElement(verifyBoardName);
        setTextElement(inputCardName,"");
    }

    /**
     * Board-005
     */
    public void buttonLastCard(){
        waitVisibilityElement(verifyBoardName);
        clickElement(buttonLastCard);
    }

    public void addNotes(){
        clickElement(buttonNotes);
    }

    public void getNotes(String notes){
        inputNotes.sendKeys(notes);
    }

    public void saveNotesButton(){
        clickElement(buttonSave);
    }

    public String getTextNotes(){
        return getTextElement(getTextNotes);
    }

    /**
     * Board-006
     */
    public void addAttachmentsOnSmallCard() throws InterruptedException {
        Thread.sleep(4000);
//        ((JavascriptExecutor) driver)
//                .executeScript(
//                        "document.evaluate('//div[5]//input[1]', document, null," +
//                                "XPathResult.FIRST_ORDERED_NODE_TYPE,null,).singleNodeValue" +
//                                ".setAttribute('style', 'display: block;')");
//        setTextElement(inputAttachFile, "/Users/fenyekaputri/Documents/Picture/beach.jpeg");
       buttonAttachFile.sendKeys("/Users/fenyekaputri/Documents/Picture/Menara Eiffel.jpeg");
    }

    public String getAttachFiles() {
        return getTextElement(getAttachFileName);
    }

    /**
     * Board-007
     */
    public void addCardMembers(){
        waitVisibilityElement(verifyBoardName);
        clickElement(buttonMembers);
    }

    public void getTeamMember(String members){
        inputMemberName.sendKeys(members);
    }

    public void selectMembers(){
        clickElement(selectMembers);
    }

    public void applyMembersButton(){
        clickElement(buttonApplyMembers);
    }

    public boolean memberIsDisplayed() {
        return isElementDisplayed(getLastMembers);
    }

    public void closeAddMembers(){
        clickElement(buttonCloseMembers);
    }

    /**
     * Board-008
     */
    public void addNewLabels(){
        waitVisibilityElement(verifyBoardName);
        clickElement(buttonLabels);
        clickElement(buttonAddLabels);
    }

    public void getLabelsName(String labels){
        inputCardName.sendKeys(labels);
        clickElement(selectColors);
    }

    public void createLabels(){
        clickElement(buttonCreateLabels);
    }

    public String getLabels() {
        return getTextElement(getLabels);
    }

    public void closeLabels(){
        clickElement(buttonCloseLabels);
    }

    /**
     * Board-009
     */
    public void createLabelUsingEmptyData() throws InterruptedException {
        waitVisibilityElement(verifyBoardName);

        clickElement(buttonLastCard);
        clickElement(buttonLabels);
        clickElement(buttonAddLabels);
        setTextElement(inputCardName,"");
        clickElement(buttonCreateLabels);
    }

    /**
     * Board-010
     */
    public void commentOnCard(String comment){
        clickElement(buttonComment);
        setTextElement(inputNotes, (comment));
    }

    public void buttonPostComment(){
        clickElement(buttonPost);
    }

    public String getComment(){
        return getTextElement(getComment);
    }


    /**
     * Board-016
     */
    public void archivedList(){
        waitVisibilityElement(verifyBoardName);

        clickElement(buttonOptionList);
        clickElement(buttonArchiveList);
    }

    /**
     * Board-018
     */
    public void restoreList(String list) throws InterruptedException {
        waitVisibilityElement(verifyBoardName);

        clickElement(buttonArchivedItems);
        Thread.sleep(1000);
        inputCardName.sendKeys(list);
        clickElement(buttonSwitchInArchived);
        clickElement(buttonRestoreList);
    }

}














