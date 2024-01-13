Feature: Test Fb appl

  @Register
  Scenario: Test Register page
    Given user open "Chrome" browser
    When user is on register page
    And user enter valid "Trunal","Gawade","Trunalgawade123@gmail.com" and "Trunal123"
    And user select DOB as "3","Sep","1998" and select gender as "Male"
