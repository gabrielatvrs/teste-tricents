# language: pt
@ignore

Funcionalidade: Acessar o site da Tricents e preencher o formulario
Navegar no site da Tricents e simular o contrato de seguro de um veículo

Contexto: Navegar no site da Tricents
Dado que estou no site da tricents

Cenario: Preencher o formulario da aba "Insurant Data"
E estou na pagina enter insurant data
E preencho o campo name
E preencho o campo last name
E preencho o campo date of birth
E preencho o campo gender
E preencho o campo street address
E preencho o campo country
E preencho o campo zip code
E preencho o campo city
E preencho o campo occupation
E preencho o campo hobbies
E preencho o campo website
Entao eu clico no botao next para ir para a aba Product Data