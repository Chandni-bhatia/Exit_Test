#Author: your.email@your.domain.com

@TestScenario5
Feature: Interacting with Path Animations and Simple Transitions
 

  @TS5
  Scenario Outline: Path Animations and Simple Transitions
    Given Animation Page
    Then Click on <button1>
    When Click on Named Components radio button
    And  on the Multi-int radio button
    And Navigate back and scroll down
    Then Press on the <button2>
    And then on <button3> right after <button4>
    
    Examples: 
    |Seconds| button1       |      button2			|button3		|button4	|
    |   1   |Path Animations|Simple Transitions	| Scene 2   |Scene 4  |