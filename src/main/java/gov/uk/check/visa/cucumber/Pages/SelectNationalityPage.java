package gov.uk.check.visa.cucumber.Pages;

import gov.uk.check.visa.cucumber.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;


public class SelectNationalityPage extends Utility {
    @CacheLookup
    @FindBy(tagName = "select")
    WebElement selectNationality;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;


    public void selectNationalityFromDropDown(String nationality) {
               selectByVisibleTextFromDropDown(selectNationality, nationality);
    }

    public void clickOnContinueButton() {
               clickOnElement(continueButton);
    }

}
