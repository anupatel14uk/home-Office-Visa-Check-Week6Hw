package gov.uk.check.visa.cucumber.Pages;

import gov.uk.check.visa.cucumber.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

;


public class ResultPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You will not need a visa to come to the UK')]")
    WebElement verifyResultTourism;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You need a visa to work in health and care')]")
    WebElement verifyResultHealthCare;
    @CacheLookup
    @FindBy(xpath = "//h2[contains(text(),'You may need a visa')]")
    WebElement verifyResultFamily;


    public String getResultMessageTourism() {
        return getTextFromElement(verifyResultTourism);
    }
    public String getResultMessageHealthCare() {
        return getTextFromElement(verifyResultHealthCare);
    }
    public String getResultMessageFamily() {
        return getTextFromElement(verifyResultFamily);
    }

}
