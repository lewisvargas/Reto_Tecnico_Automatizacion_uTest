#Autor Lewis Vargas Florez
  @stories
  Feature: Utest Academy
    As a user, I want to learn how to make mobile applications in the Utest Academy with the mobile applications course
  @Scenario1
  Scenario: Search the Utest mobile apps course
    Given that Mari wants to learn mobile applications at the Utest Academy
    | strUser   | strPassword |
    | TuUsuario | TuClave     |
    When she search for the course of the Utest Academy
    | strCourse                           |
    | Introduccion a Aplicaciones Moviles |
    Then he finds the course called
    | strCourse                           |
    | Introduccion a Aplicaciones Moviles |