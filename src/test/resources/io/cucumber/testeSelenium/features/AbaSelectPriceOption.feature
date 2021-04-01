# language: pt
@ignore

Funcionalidade: Acessar o site da Tricents e preencher o formulario
Navegar no site da Tricents e simular o contrato de seguro de um veículo

Contexto: Navegar no site da Tricents
Dado que estou na pagina enter insurant data

Cenario: Preencher o formulario da aba "Select Price Option"
E estou na pagina select price option
E seleciono a opcao Silver
E clico no botao View Quote
Entao eu clico no botao next para ir para a aba Send Quote