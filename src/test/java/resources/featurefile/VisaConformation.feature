@regression
Feature: Visa Confirmation Test
  As user I want to login into home office website

  @smoke
  Scenario: User should an Australian Coming To UK For Tourism page successfully
    Given I am om UK tourism page
    When  I click on accept cookie button
    And   I click on start now button
    And   I  select a nationality "Australia"
    And   I click on Continue button
    And   I  select reason "Tourism or visiting family and friends"
    And   I click on Continue tourism button
    Then  I Verify result "You will not need a visa to come to the UK"

@senity
  Scenario: a Chile an Coming To The UK For Work And Plans On Staying For Longer Than Six Months
    Given I am om UK tourism page
    When  I  Click on start button
    And   I click on accept cookie button
    And   I  select a nationality "Chile"
    And   I click on Continue Nbutton
    And   I  select reason Work, academic visit or business "Work, academic visit or business"
    And   I click on Continue visit button
    And   I Select intended to stay for "longer than 6 months"
    And   I click on Continue stay button
    And   I Select have planning to work for "Health and care professional"
    And   I click on Continue work button
    Then  I Verify result a "You need a visa to work in health and care"

  @regression
  Scenario:  Columbian National Coming To The UK To Join A Partner For A Long Stay They Do Have An Article10Or20Card
    Given I am om UK tourism page
    When  I click on accept cookie button
    And   I click on start now button
    And   I  select a nationality "Colombia"
    And   I click on Continue button
    And   I  select reason "Join partner or family for a long stay"
    And   I click on Continue tourism button
    Then  I Verify result b "You may need a visa"
