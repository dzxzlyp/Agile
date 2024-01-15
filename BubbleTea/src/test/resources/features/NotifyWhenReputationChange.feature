Feature: US_002 Notify author when reputation of his edition house's reputation change
  As an author
  I would like to be informed of promotion changes
  So that I can take advantage of discounts when I order a bubble tea.

  Scenario: Notification des auteurs lors d'un changement de reputation
    Given une maison d'édition avec une réputation "Faible"
    And un auteur dans cette maison d'édition avec le nom "Xavier"
    When la réputation de la maison d'édition devient "Forte"
    Then l'auteur Xavier est notifié des changements de promotion

