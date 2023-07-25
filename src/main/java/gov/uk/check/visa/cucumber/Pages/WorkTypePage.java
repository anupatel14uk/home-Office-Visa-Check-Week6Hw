package gov.uk.check.visa.cucumber.Pages;

import gov.uk.check.visa.cucumber.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WorkTypePage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement continueButton;
    @CacheLookup
    @FindBy(xpath = "//div[@class='govuk-radios']//label")
    List<WebElement> selectTypesOfJob;


    public void selectJobTypes(String job) {
        for (WebElement jobType : selectTypesOfJob) {
            if (jobType.getText().equalsIgnoreCase(job)) {
                clickOnElement(jobType);
                break;
            }
        }
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }

}
