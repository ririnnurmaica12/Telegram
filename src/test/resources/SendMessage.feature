Feature: Send Message

  Scenario Outline: User try to send message from feature search
    Given user is logged in application telegram
    When User click icon search
    And user select contact
    And user writes a "<message>"
    And user click icon send
    Then send message should be "<result>"

    Examples:
      |message      |result    |
      |ririn        |Success   |
      |w4242        |Success   |
      |##@$@$@      |Success   |
      |             |Failed    |


  Scenario Outline: User try to send message from feature add new message
    Given user is logged in application telegram
    When Click button add new message
    And Click icon search in contact page
    And Search "<contactName>"
    And Click contact name
    And user writes a "<textMessage>"
    And user click icon send
    Then send message should be "<result>"

    Examples:
      |textMessage           |contactName       |result    |
      |ririn hello           |Hendara danu      |Success   |
      |w4242                 |Hendara danu      |Success   |
      |##@$@$@               |Hendara danu      |Success   |
      |                      |Hendara danu      |Failed    |
      |adsdasaa              |12312SA           |Failed    |
      |                      |@@@%%%$$          |Failed    |
      |                      |                  |Failed    |
