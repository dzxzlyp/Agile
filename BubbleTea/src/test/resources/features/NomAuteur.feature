Feature: Nom Auteur
  Scenario: L'auteur change son nom
    Given My name is "Lisa"
    When I change my name to "J.K. Rowling"
    Then My name should be "J.K. Rowling"
