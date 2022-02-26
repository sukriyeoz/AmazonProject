Feature: US06_Is_Total_Price_And_Basket_Price_Same

#User goes to https://www.amazon.com/
#And User enter "nutella" as a key word to the search bar and click the seacrh icon
#User clicks on the first nutella product and clicks on  "Add to cart" button
#User clear the search bar (double click)-Not write method for this line
#User enters "baklava" product in search bar and clicks search button
#User clicks on the first baklava product and clicks on "Add to cart"button
#Verify the subtotal of the products and "current total" in the cart is same





  Scenario: User should be able to choose random products and add to cart.
  User should see that the total price of the added products and the total in the basket are the same

        Given User navigate to amazon home page "amazonURl"
          And User enters "product1" as a key word to the search bar and click the seacrh icon
          And User clicks on the first "product" product and clicks on "Add to cart" button
          And User enters "product2" product in search bar and clicks search button
          And User clicks on the first "product" product and clicks on the "Add to cart" button
          Then Verify the subtotal of the products and "current total" in the cart is same






