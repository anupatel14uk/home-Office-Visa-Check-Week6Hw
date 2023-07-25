package gov.uk.check.visa.cucumber.Pages;

import gov.uk.check.visa.cucumber.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class StartPage extends Utility {
    private static final Logger log = LogManager.getLogger(StartPage.class.getName());
    public StartPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(partialLinkText = "Start n")
    WebElement startNowButton;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Accept additional cookies')]")
    WebElement acceptCookies;



    public void clickOnStartNowButton() {
        clickOnElement(startNowButton);
    }

    public void acceptAllCookies() {
        clickOnElement(acceptCookies);
    }

}
