Feature: US08_Create_And_Delete_ShoppingList

#User goes to https://www.amazon.com/
#User hover over  "Account List " button
#User select " Create a list "  from dropdown and click
#User send a list name to the "Shopping Link" textbox
#User click the "Create List" button
#Verify the list name is appeared
#User click " ...More" and select "Manage List"
#User enter password and Sign-in button
#User scrollDown the Manage List
#User click the " Delete list"
#Verify the " confirm delete"  alert and click yes


  Scenario: User should be able to create and delete shoppingList
  Given User navigate to amazon home page "amazonUrl"
   And  User hover over  "Account List " button
   And User select " Create a list "  from dropdown and click
   And User send a list name to the "Shopping Link" textbox
   And User click the "Create List" button
   Then Verify the list name is appeared
   And User click the More button as " ...More" and select "Manage List"
   And User enter valid password as "validPassword" then click Sign-in button
   And User scrollDown the Manage List
   And User click the " Delete list"
   Then Verify the " confirm delete"  alert and click yes










