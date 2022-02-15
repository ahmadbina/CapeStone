@retail @regression
Feature: - for this feature you have to have an existing account

  Background: 
    Given User is on Retail website
    And User click on MyAccount
    When User click on Login
    And User enter username 'userName' and password 'password'
    And User click on Login button
    Then User should be logged in to MyAccount dashboard

  #@register
  Scenario: Register as an Affiliate user with Cheque Payment Method
    When User click on ‘Register for an Affiliate Account’ link
    When User fill affiliate form with below information
      | company | website         | taxID   | paymentMethod   |
      | Walmart | www.walmart.com | 5364123 | Nabi |
    And User check on About us check box
    And User click on Continue button
    Then User should see a success message

 # @edit
  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on ‘Edit your affiliate informationlink
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName | abaNumber | swiftCode | accountName | accountNumber |
      | NBC      | USA456    |  32545887 | Kabir Ahmad |   21365989877 |
    And User click on Continue button to pay
    Then User should see a success message for payment

  #@editcount
  Scenario: Edit your account Information
    When User click on ‘Edit your account information’ link
    And User modify below information
      | firstname | lastName | email              | telephone  |
      | Ali       | Agha     | ali_agha@gmail.com | 5718945623 |
    And User click on continue button
    Then User should see a message ‘Success: Your account has been successfully updated.’
