package gov.uk.check.visa.cucumber.steps;

import gov.uk.check.visa.cucumber.Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class VisaConformationSteps {

    @Given("I am om UK tourism page")
    public void iAmOmUKTourismPage() {
    }

    @When("I click on accept cookie button")
    public void iClickOnAcceptCookieButton() {
        new StartPage().acceptAllCookies();
    }

    @And("I click on start now button")
    public void iClickOnStartNowButton() {
        new StartPage().clickOnStartNowButton();
    }
    @And("I click on Continue button")
    public void iClickOnContinueButton() {
        new SelectNationalityPage().clickOnContinueButton();
    }

    @And("I  select reason {string}")
    public void iSelectReasonTourism(String tourism) {
        new ReasonForTravelPage().selectReasonForVisit(tourism);
    }

    @And("I click on Continue tourism button")
    public void iClickOnContinueTourismButton() {
        new ReasonForTravelPage().clickOnContinueButton();
    }

    @Then("I Verify result {string}")
    public void iVerifyResultYouWillNotNeedAVisaToComeToTheUK(String result) {
        Assert.assertEquals(new ResultPage().getResultMessageTourism(), result, "able to verify message");
    }



    @And("I click on Continue Nbutton")//second method
    public void iClickOnContinueNbutton() {
        new SelectNationalityPage().clickOnContinueButton();
    }
    @When("I  Click on start button")
    public void iClickOnStartButton() {
        new StartPage().clickOnStartNowButton();
    }

    @And("I  select reason Work, academic visit or business {string}")
    public void iSelectReasonWorkAcademicVisitOrBusiness(String business) {
        new ReasonForTravelPage().selectReasonForVisit(business);
    }

    @And("I click on Continue visit button")
    public void iClickOnContinueVisitButton() {
        new  ReasonForTravelPage().clickOnContinueButton();

    }

    @And("I Select intended to stay for {string}")
    public void iSelectIntendedToStayFor(String stay) {
        new DurationOfStayPage().selectLengthOfStay(stay);

    }

    @And("I click on Continue stay button")
    public void iClickOnContinueStayButton() {
       new DurationOfStayPage().clickOnContinueButton();
    }

    @And("I Select have planning to work for {string}")
    public void iSelectHavePlanningToWorkFor(String professional) {
       new WorkTypePage().selectJobTypes(professional);

    }

    @And("I click on Continue work button")
    public void iClickOnContinueWorkButton() {
        new  WorkTypePage().clickOnContinueButton();
    }

    @Then("I Verify result a {string}")
    public void iVerifyResultA(String result) {
        Assert.assertEquals(new ResultPage().getResultMessageHealthCare(), result, "able to verify message");
    }

    @And("I  select a nationality {string}")
    public void iSelectANationality(String nationality) {
        new SelectNationalityPage().selectNationalityFromDropDown(nationality);

    }


    @Then("I Verify result b {string}")//3 method
    public void iVerifyResultB(String result1) {
        Assert.assertEquals(new ResultPage().getResultMessageFamily(), result1, "able to verify message");
    }
    }

