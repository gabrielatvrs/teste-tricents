# language: pt
@ignore

Funcionalidade: Acessar o site da Tricents e preencher o formulario
Navegar no site da Tricents e simular o contrato de seguro de um veículo

Contexto: Navegar no site da Tricents
Dado que estou no site da tricents

Cenario: Preencher o formulario da aba "Product Data"
E estou na pagina enter product data
E preencho o campo start date
E preencho o campo insurance sum
E preencho o campo merit rating
E preencho o campo damage insurance
E preencho o campo optional products
E preencho o campo courtesy car
Entao eu clico no botao next para ir para a aba Select Price Option