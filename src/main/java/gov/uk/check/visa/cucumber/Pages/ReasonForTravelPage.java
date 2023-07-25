package gov.uk.check.visa.cucumber.Pages;

import gov.uk.check.visa.cucumber.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ReasonForTravelPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-radios']//label")
    List<WebElement> selectReason;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;



    public void selectReasonForVisit(String reason) {


        for (WebElement reasonForVisit : selectReason) {
            if (reasonForVisit.getText().equalsIgnoreCase(reason)) {
                clickOnElement(reasonForVisit);
                break;
            }
        }
    }

    public void clickOnContinueButton() {

        clickOnElement(continueButton);
    }
}
