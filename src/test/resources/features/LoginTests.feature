Feature: Login tests
  Background: Home page of GapoWork
    Given Login form in login page

  @DataTableHeaders
  Scenario: Login using valid account that registered in personal and corporate account type
     Given Login page is displayed
    When Input credentials to login with headers table
      | Email                | Password  | Account Type           |
      | cafe24h01@cafe24h.gq | 12345678a | personal and corporate |
    And Click selanjutnya button

#  @SimplyDataTable
#  Scenario: Login to using valid account that registered in personal account type
#    Given Login page is displayed
#    When Input credentials to login without headers
#      | your@email.com | Yourp@ssw0rd | personal |
#    And Click selanjutnya button