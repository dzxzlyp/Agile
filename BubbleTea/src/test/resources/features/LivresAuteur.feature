Feature: Author's book
  Scenario: I have written X books
    Given An author wrote the following books:
      | Harry Potter 1 |
      | Harry Potter 2 |
      | Harry Potter 3 |
      | Harry Potter 4 |
      | Harry Potter 5 |
      | Harry Potter 6 |
    When I search for my reputation
    Then My reputation is "Moyen"

