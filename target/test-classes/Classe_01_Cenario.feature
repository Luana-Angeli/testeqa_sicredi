Feature: Simular Investimento PoupanÃ§a
  
  Com o proposito de Simular um Investimento na Poupança
  Como um Associado
  Eu gostaria de preencher o formulario de simulação
  E ver a tabela de resultado com mes e Valor
  
    
  Scenario: Simular valor de investimento por mes e valor
  	Objetivo do teste eh simular o valor da aplicao por mes com sucesso
    
    Given que seleciono o perfil 'Para Voce'
    And quero aplicar o valor de "100.00"
    And quero poupar todo mes o valor de "50.00"
    And quero poupar durante "12" meses
    When clico no botao "Simular"
    Then exibe a mensagem "Em "12" meses voce terah guardado" R$ 706
    And exibe a mensagem "Veja estas outras opcoes para você"
    | Tempo_meses | Valor |
    |	24					| 1.321 |
    | 36					| 1.946	|
    | 48    			| 2.581	|
    |	60					| 3.226 |		
    
    
    		