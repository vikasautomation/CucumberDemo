

@tag
Feature: Login to the Application 


  @tag1
  Scenario: Login to the application with valid credentials
    Given User launch the application.
    When User redirect to the url "https://admin-demo.nopcommerce.com/login"
    When User enter the email as "admin@yourstore.com" and password as "admin"
    And  Click on login button
    Then User will be on Homepage
    When User click on logout link
    Then Page title should be "Your store. Login"
    Then Close browser
    
     Scenario Outline: Login to the application with credentials DDT
    Given User launch the application.
    When User redirect to the url "https://admin-demo.nopcommerce.com/login"
    When User enter the email as "<email>" and password as "<password>"
    And  Click on login button
    Then User will be on Homepage
    When User click on logout link
    Then Page title should be "Your store. Login"
    Then Close browser
    
    
    Examples: 
    |type|email|password|
    |User1|admin@yourstore.com|admin|
   	|User2|test@yourstore.com|admin|
   
    

