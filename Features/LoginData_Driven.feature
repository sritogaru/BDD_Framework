Feature: Data Driven Testing for Login
  I want to use this template for my feature file

  @DataDriven
  Scenario Outline: Login with multiple data
    Given I want to open chrome browser
    And open Demo webshop applicaion with url "https://demowebshop.tricentis.com"
    And click on Login link
    When enter username as "<username>" And enter password as "<password>"
    And click on Login button
    And click on "<username>"
    Then we should able to see "My account - Customer info" text on screen
    And user should also be able to see "Logout" option on right side of the page

    Examples: 
      | username             | password  |
      | sriven@gmail.com     | Test@123  |
      | venakteshs@gmail.com | Test@1234 |
