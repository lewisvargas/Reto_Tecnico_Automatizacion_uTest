#Autor Lewis Vargas Florez
  @stories
  Feature: Utest Academy
    As a user, I want to learn how to make mobile applications in the Utest Academy with the mobile applications course
  @Scenario1
  Scenario: Search the Utest mobile apps course
    Given that Maria wants to learn mobile applications at the Utest Academy
    | strUser   | strPassword   |
    | <strUser> | <strPassword> |
    When she search for the course of the Utest Academy
    | strCourse   |
    | <strCourse> |
    Then she finds the course called
    | strCourse                           |
    | <strCourse> |