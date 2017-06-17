Feature: Check the page title

#  Scenario: Check page title for Contact page
#    Given I am on Qrious website
#    When I navigate to the "menu-item-209"
#    Then I check page title is "Contact"
#    And I close the browser
#
#  Scenario: Check page title for About page
#    Given I am on Qrious website
#    When I navigate to the "menu-item-48"
#    Then I check page title is "About"
#    And I close the browser
#
#  Scenario: Check page title for News page
#    Given I am on Qrious website
#    When I navigate to the "menu-item-24691"
#    Then I check page title is "News"
#    And I close the browser

  Scenario Outline: Check page title for News page
    Given I am on Qrious website
    When I navigate to the <Link>
    Then I check page title is <Title>
    And I close the browser
    Examples:
      | Link | Title |
      | menu-item-209 | Contact |
      | menu-item-48 |  About |
      | menu-item-24691 | News |
