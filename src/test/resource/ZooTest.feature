Feature: To test the high level function of zoo website

  Background:
    Given I am on my zoo site

  @zoo
  Scenario: To set the start date
    When I click on "Adoption"
    Then I set the start date to "Today"
    Then I go to close the browser

#   @zoo
#   Scenario: To populate the contact form
#      When I click on "Contact"
#      Then I populate the contact form
#      Then I go to close the browser
