Feature: verify submenu and click using mouseover action
  Background:
  Given I am on the HomePage with url "https://www.next.co.uk/" with page heading "Next Official Site: Online Fashion, Kids Clothes & Homeware"
@submenu
  Scenario Outline: verify submenu option
    When I am able to move cursor on "<Menu>"
    When I am able to click "<Submenu>"
    Then I am moved to the particular productPage with appropriate "<SubmenuPageHeading>"

    Examples:
      | Menu   | Submenu     | SubmenuPageHeading           |
      | home   | Living Room | Living Room Furniture |
      | brands | Joules      | Joules                |
