Feature: Search

  Scenario Outline: User try to search contact
    Given Open the application telegram and user is logged in
    When Click icon search
    And Type the "<contactName>" to be searched
    Then Search should be "<result>"

    Examples:
      |contactName      |result    |
      |Hendra danu      |Success   |
      |4893289          |Failed    |
      |@@@###           |Failed    |
      |                 |Failed    |

