  Feature: Title of your feature
  I want to use this template for my feature file

  @DataDriven_Excel
  Scenario Outline: Data Driven Testing with Excel
    Given I want to open chrome browser
    And open Demo webshop applicaion with url "https://demowebshop.tricentis.com"
    And click on Login link
    Then check user able to login by passing uname and passwd with excel row "<row_index>"

    Examples: 
      | row_index |
      |         1 |
      |         2 |
      |         3 |
      |         4 |
