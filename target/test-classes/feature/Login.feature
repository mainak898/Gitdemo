Feature: Application Login

  Scenario: Homepage default login
    Given User is on Netbanking landing page
    When User login to application using username="Mak" and password="1234"
    And Homepage is populated
    Then Cards displayed are "true"

  Scenario: Homepage default login
    Given User is on Netbanking landing page
    When User login to application using username="Kam" and password="1235"
    And Homepage is populated
    Then Cards displayed are "false"
