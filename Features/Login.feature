
Feature: Login with valid credentials
  I want to use this template for my feature file

  @smoke
  Scenario: Login Tricentis Demo WebShop application
    Given I want to open chrome browser
    And open Demo webshop applicaion with url "https://demowebshop.tricentis.com"
    And click on Login link
    When enter username as "sriven@gmail.com" And enter password as "Test@123"
    And click on Login button
    And click on username "sriven@gmail.com"
    Then we should able to see "My account - Customer info" text on screen 
    And user should also be able to see "Logout" option on right side of the page