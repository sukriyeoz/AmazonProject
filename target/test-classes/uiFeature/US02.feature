Feature: US02_SignIn


Background:
  Given User navigate to amazon home page "amazonUrl"
  And User click on Sign-in button

  Scenario: TC01_User should be able to enter with valid credential

       And User enter valid email as "validEmail" then click on continue button
       And User enter valid password as "validPassword" then click Sign-in button
       Then User verify that page navigate to amazon home page


   Scenario: TC02_User should not be able to enter with invalid credential

       And User enter invalid email as "invalidEmail" then click on continue button
       Then Verify the alert mesaj "There was a problem"



  Scenario: TC03_User should not be able to enter with invalid credential

      And User enter valid email as "email" then click on continue button
      And User enter invalid password as "invalidPassword" then click Sign-in button
      Then Verify the alert mesaj "There was a problem"
