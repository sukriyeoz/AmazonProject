Feature: US03_AllMenu


  Scenario: US03_TC01_User should be able to select from the All menu and see the subcategories
    Given User navigate to amazon home page "amazonUrl"
    And   User click on All drop down menu
    And User click on a category as "Prime Video"
    Then Verify that there are 12 subcategory under the tab
    Then User verifies the title of all subcategories

