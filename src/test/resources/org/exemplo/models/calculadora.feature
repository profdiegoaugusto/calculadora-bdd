Feature: Calculadora
  Como usuário,
  Eu quero poder realizar operações matemáticas básicas
  Para que eu possa fazer meus cálculos diários.

  Scenario: Adição
    Given que o usuário deseja somar os números 3 e 5 na calculadora
    When o usuário somar os números
    Then o resultado exibido é 8

  Scenario Outline: Subtração
    Given que o usuário subtrair <numero1> e <numero2>
    When o usuário deseja subtrair os números
    Then o resultado da subtração é <saidaEsperada>

    Examples:
      | numero1 | numero2 | saidaEsperada |
      | 5.0     | 3.0     | 2.0           |
      | -10.0   | -4.0    | -6.0          |
      | -7.5    | 2.5     | -10.0         |

  Scenario: Multiplicação
    Given que o usuário deseja multiplicar os números 4 e 7 na calculadora
    When  o usuário multiplicar os números
    Then  o resultado da multiplicação é 28




