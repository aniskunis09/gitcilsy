package objectRepository;

import org.openqa.selenium.By;

public class pageBoard {
    By pageDropdownBoard = By.xpath("//android.widget.Button[@content-desc='Board']");
    By btnAddList =  By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.widget.Button");
    By inputBoardName = By.xpath("//*/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText");
    By btnsubmitBoard = By.xpath("//android.widget.Button[@content-desc='Submit']");
    public By getPageDropdownBoard() {
        return pageDropdownBoard;
    }
    public By getBtnAddList() {
        return btnAddList;
    }
    public By getInputBoardName() {
        return inputBoardName;
    }
    public By getBtnsubmitBoard() {
        return btnsubmitBoard;
    }
    public By getCtnBoardName(String boardName) {
        By ctnBoardName = By.xpath("//android.view.View[@content-desc='" + boardName + "']");
        return ctnBoardName;
    }


    By btnAddNewCard = By.xpath("(//android.widget.Button[@content-desc='Add new card'])");
    By inputCardName = By.xpath("//android.view.View[@content-desc='Private Card]/android.widget.EditText");
    By tickOnCard = By.xpath("//android.view.View[@content-desc='Private Card']/android.widget.EditText/android.view.View");
    public By getBtnAddNewCard() {
        return btnAddNewCard;
    }
    public By getInputCardName() {
        return inputCardName;
    }
    public By getTickOnCard() {
        return tickOnCard;
    }
    public By getCtnCard(String cardName) {
        By ctnCardName = By.xpath("//android.widget.Button[contains(@content-desc,'" + cardName + "')]");
        return ctnCardName;
    }



}
