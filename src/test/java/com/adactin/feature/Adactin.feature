Feature: Testing Adactin Application  end to end process

@RegressionTest
Scenario Outline: Verify that user is able to login the application

Given user launch the appliction
When user enters the valid username "<username>" in the username field
And User enters the valid password "<password>" in the password field
And user is able to click the login button
Then User verify the hompage lands on to search hotel

Examples:

|username|password|
|AAA|111|
|BBB|222|
|Pavikumaresh|Pavikums@24|
