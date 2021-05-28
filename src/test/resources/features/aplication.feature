#Language:en

Functionality: Acessar página

Scenario: Fazer login
    Given que estou na página home
    When faço login com usuario e senha
    And estou para o carrinho
    Then efetuo o pagamento