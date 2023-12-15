Feature: Is it Friday?
  Scenario Outline: Is it Friday?
    Given today is "<day>"
    When I ask whether it's Friday yet
    Then I should be told "<answer>"
    Examples:
      | day            | answer |
      | Friday         | TGIF   |
      | Sunday         | No     |
      | anything else! | No     |
