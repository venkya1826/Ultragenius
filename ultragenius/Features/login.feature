Feature:Create New Customer Account

Scenario: Successful account creation
    Given user Launch Chrome browser
    When user open url "https://magento.softwaretestingboard.com/"
    Then page Title should be "Home Page"
    Then user click Create an Account button 
    When the user enters valid first name, last name, email, and password
    And clicks the Create an Account button
    And the user should see a success message "Thank you for registering with Main Website Store."
    Then Click on singOut button

Scenario: singIn Application 
    Given user Launch Chrome browser
    When user open url "https://magento.softwaretestingboard.com/"
    When Click on SingIn option 
    Then  page Title should be "Customer Login" 
    And User enter Email and Password 
    Then Click on SingIn
    When  page Title should be "Home Page"
  