Feature: Reservation
  The user makes a reservation

  Scenario:Successful reservation
    Given the user is on the register page
    When the user enters his credentials and searched for the reservation
    Then the user can see the reservation cancellation interface
