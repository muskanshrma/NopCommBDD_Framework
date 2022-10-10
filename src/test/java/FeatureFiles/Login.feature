Feature: Login

    Scenario Outline: Successful Login with Valid Credentials
        Given User is on Login Page
        When User enter "<username>" and "<password>"
        And User click on login button
        Then User is on Inventory page
        Examples:
            | username                | password     |
            | standard_user           | secret_sauce |
#            | problem_user            | secret_sauce |
#            | performance_glitch_user | secret_sauce |

#    Scenario Outline: Login with InValid Credentials
#        Given User is on Login Page
#        When User enter "<username>" and "<password>"
#        And User click on login button
#        Then User is on Home page
#        Examples:
#            | username                 | password     |
#            | standard_user1           | secret_sauce |
#            | problem_user3            | secret_sauce |
#            | performance_glitch_user@ | secret_sauce |
#            | locked_out_user          | secret_sauce |