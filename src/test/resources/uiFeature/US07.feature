Feature: US07_Home_Page_Navigate_to_the_Correct_Page

  #User goes to https://www.amazon.com/
  #User selects "Amazon Prime" at the bottom of the home page
  #Verify the "prime" on the page


  Scenario: User verify that the links in any row or column of the links at the bottom of the home page navigate to the correct page
      Given User navigate to amazon home page "amazonUrl"
       And User seleck Alexa as "Alexa" at the bottom of the home page
       Then Verify the prime "Alexa" on the page
