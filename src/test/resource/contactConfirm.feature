Feature: To test contact form works when there are no errors

  @web
  Scenario: Check form is validated when there are no errors
    Given I am on my zoo website
    When I click on the contact link
    And Populate the contact form
      | Fields | Value |
      | Name   | jack Liu |
      | Address|  Happy   |
      | Email  |  qiruioqghjkvhklkh@hotmail.com |
    Then I should be on the contact confirmation page
