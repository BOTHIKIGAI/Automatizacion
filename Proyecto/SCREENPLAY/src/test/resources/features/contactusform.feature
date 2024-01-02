Feature: Contact Us Form
  As a web user, you will complete a contact form

  Scenario: Validation of the "Save time and money" form without entering an email address
    Given the user is on the page
    When the user submits the form
    Then the user will see an error message on the page

  Scenario: Validation of the "Save time and money" form with numbers
    Given the user is on the page
    When the user enters numbers in the input
    Then the user will see an error message on the page

  Scenario: Validation of "Save time and money" form letters
    Given the user is on the page
    When the user enters a letters
    Then the user will see an error message on the page

  Scenario: Validation of the "Save time and money" form with symbols
    Given the user is on the page
    When the user enters a symbols
    Then the user will see an error message on the page

  Scenario: Validation of "Save time and money" form with alphanumeric
    Given the user is on the page
    When the user enters alphanumeric data
    Then the user will see an error message on the page

  Scenario: Validación of the "Save Time and Money" form with mailing
    Given the user is on the page
    When the user enters his email
    Then the user sees a confirmation message