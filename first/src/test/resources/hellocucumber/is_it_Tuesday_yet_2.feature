Feature: Is it Friday yet?
  Everybody wants to know when it's Friday

  Scenario Outline: Today is or is not Tuesday
    Given today is "<day>"
    When I ask whether it's Tuesday yet
    Then I must be told "<answer>"

    Examples:

      | day            | answer |
      | Tuesday        | TGIF   |
      | Sunday         | Nope   |
      | anything else! | Nope   |

