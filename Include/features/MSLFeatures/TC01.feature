
Feature: Login
 
  Scenario Outline: Valid Login
  
    Given Get Group and TC data <GROUP> - <TC>
    When Launch MSL Application - 1
   
   

    Examples: 
      | GROUP | TC | 
      | MSL   | TC01 | 