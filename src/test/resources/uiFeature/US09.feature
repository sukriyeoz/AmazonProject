Feature: US09_add_And_Delete_in_ShoppingList

#  User navigate to Amazon home page
#  User sends  "sunglasses" text to search bar
#  User clicks first item
#  User should be click Add to List
#  User click the " View your list" button
#  Verify the sunglesses is displayed
#  User clicks the three dot dropdown and select "delete"
#  Verify the sunglesses is not displayed


  Scenario: User should be able to add and delete products in shoppingList
    Given User navigate to amazon home page "amazonUrl"
    And User enter "sunglesses" as a key word to the search bar and click the search icon
    And User click the first item
    And User should be click "Add to List" button
    And User click the " View your list" button
    Then Verify the sunglesses is displayed
    And User clicks the three dot dropdown and select "delete"
    Then Verify the sunglesses is not displayed

