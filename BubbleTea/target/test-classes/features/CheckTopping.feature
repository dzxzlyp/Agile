Feature: US_002 Check the information of a topping
  As a client
  I want to know if a topping is contained in a certain bubble tea
  So that I can enjoy the preferred topping with this bubble tea

  Scenario Outline: verify the topping content of a certain bubble tea
    Given the client want to have the topping <nameTopping>
    When the name of bubble tea <nameBT>
    Then tell him the content condition <isContain>
    Examples:
      |nameTopping|nameBT|isContain|
      |"Bubble"   |"Avril"|"Yes !"|
      |"Taro"     |"Neige"|"Yes !"|
      |"Bubble"   |"Neige"|"No..."|