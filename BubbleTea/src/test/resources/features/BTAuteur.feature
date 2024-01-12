Feature: Bubble Tea Author
  Scenario: The favorite bubble tea
    Given An author favorite bubble tea is "Brown Sugar"
    When I search for his favorite bubble tea
    Then It should be "Brown Sugar"
