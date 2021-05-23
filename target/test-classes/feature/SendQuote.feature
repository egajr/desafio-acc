# language: pt

Funcionalidade: Solicitação de seguro de veículos
  Como um motorista
  Eu quero solicitar uma cotação de seguro
  Para obter o melhor valor a pagar

  Esquema do Cenario: Devo enviar solicitação de cotação de seguro com sucesso
    Dado que acesse o site para cotação de seguro de um "<veiculo>"
    Quando preencho os dados do "<veiculo>"
    E preencho os dados do segurado
    E preencho os dados do seguro para o "<veiculo>"
    E seleciono o tipo de seguro
    E preencho os dados de envio da cotação
    E clico no botão de enviar
    Então recebo a mensagem “Sending e-mail success!”

    Exemplos:
      | veiculo    |
      | automobile |
      | truck      |
      | motorcycle |
      | camper     |