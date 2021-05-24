Feature: Search

  Scenario Outline: User try to search contact
    Given User is logedin application telegram
    When Click icon search
    And Type the "<contactName>" to be searched
    Then Search should be "<result>"

    Examples:
      |contactName      |result    |
      | ririn           | Success  |

