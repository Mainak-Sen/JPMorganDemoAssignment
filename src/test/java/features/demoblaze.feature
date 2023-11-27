Feature: Validating the functionalities of Demoblaze application

  Scenario: Validating the functionality of Demoblaze application
    Given User is on the URL: "https://www.demoblaze.com/"
    When User clicks on category "Phones"
    And User clicks on phone name "Samsung galaxy s6"
    Then Add to cart button should be visible and product name should be "Samsung galaxy s6"

