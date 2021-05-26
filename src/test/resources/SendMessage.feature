Feature: Send Message

  Scenario Outline: User try to send message
    Given user is logged in application telegram
    When User click icon search
    And user select contact
    And user writes a "<message>"
    And user click icon send
    Then send message should be "<result>"

    Examples:
      |message      |result    |
      | ririn       | Success  |

