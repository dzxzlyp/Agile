Feature: US_001 Make a bubble tea
  As a vendor
  I want to set a name and a price for each bubble tea
  So that I can list products that I sell and give some promotions

  Scenario Outline: calculate automatically the price after promotion
    Given the price of bubble tea <nameBT> is <priceBT>
    When the vendor give a promotion <prom>
    Then the final price <finalPriceBT> should be calculated
    Examples:
      |nameBT|priceBT|prom|finalPriceBT|
      |"Avril"|6.5   |0.5 |7.0         |
      |"Neige"|7     |-0.5|6.5         |