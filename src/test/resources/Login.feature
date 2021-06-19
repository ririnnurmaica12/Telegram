Feature: Login

  Scenario Outline: User try to login
    Given open the telegram application
    When Click button start message
    And Fill the "<phoneNumber>"
    And Click button next
    Then Login should be "<result>"


    Examples:
            |phoneNumber     |result    |
            |082139804022    |Success   |
            |kkjkjkjkjkjj    |Failed    |
            |0000000000000   |Failed    |
            |**#####         |Failed    |
            |                |Failed    |


