Feature: verify search button
  Background:
    Given I am on the HomePage with url "https://www.next.co.uk/" with page heading "Next Official Site: Online Fashion, Kids Clothes & Homeware"

  @search
  Scenario Outline: verify search button with valid input
    When I am able to search "<product>"
    When I am able to click search icon
    Then I should be redirected to the particular product page with appropriate "\"<PageHeading>\""

    Examples:
      | product      | PageHeading  |
      | womens watch | Womens Watch |
      | Dress        | Dress        |

