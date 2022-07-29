#Author: your.email@your.domain.com

@TestScenario3
Feature: Interacting with Events in Animation Option
 

  @TS3
  Scenario Outline: Animation Events
    Given Animation Page
    Then Click on <button1>
    When Click on Add button
    And  on the new button to delete it and navigate back
    And Click on the <button2> button
    Then Press on the <button3> button
    And then on <button4> right after <Seconds>
    
    Examples: 
    |Seconds| button1                |button2|button3|button4|
    |   1   |Default Layout Animation|Events |Play   |Cancel |


