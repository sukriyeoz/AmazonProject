Feature: US04_Search_Product

  #User navigate to Amazon home page
  #User enter "nutella" as a  key word to the search bar and click search icon
  #User verfify that all result contains "nutella" key word

  Scenario: When the user searches for a product, all listed products must contain the searched word

      Given User navigate to amazon home page "amazonUrl"
      And User enter "Nutella" as a key word to the search bar and click the seacrh icon
     Then Verify that all search result contains "Nutella"

