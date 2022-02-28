Feature: US05_Filtering_And_Sorting_Product

 # TC01-User navigate to Amazon home page
  #User enter "nutella" as a  key word to the search bar and click search icon
  #User click the "Free Shipping by Amazon" checksbox
  #Verify the "Free Shipping by Amazon" text visible on items

  # TC02-User navigate to Amazon home page
  #User enter "nutella" as a  key word to the search bar and click search icon
  #User click the "Short by :Featured"  dropdown
  #User select the "Price: Low to Hight"
  #Verify the all item are arranged asc order




 Scenario: TC01_User should be able to use filters in the product listing process
   Given User navigate to amazon home page "amazonUrl"
   And  User enter "Nutella" as a key word to the search bar and click the search icon
   And User clicks the "FREE Shipping" checksbox
     Then Verify the "FREE Shipping" text visible on items


Scenario: User should be able to use sorting in the product listing process
  Given User navigate to amazon home page "amazonUrl"
  And  User enter "Nutella" as a key word to the search bar and click the search icon
    And User clicks the "Short by :Featured" dropdown
    And User selects the "Price: Low to High"
    Then Verify the all item are arranged asc order





