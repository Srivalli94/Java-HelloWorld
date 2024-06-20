Feature: Hello World
  Scenario: Print Hello World
    Given the application is started
    When I run the HelloWorld program
    Then I should see "Hello, World!" in the output
