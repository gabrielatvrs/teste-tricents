# language: pt

Funcionalidade: Acessar o site da Tricents e preencher o formulario
Navegar no site da Tricents e simular o contrato de seguro de um veículo

Contexto: Navegar mo site Navegar no site da Tricents
Dado que estou no site da tricents

Cenario: Preencher o formulario da aba "Vehicle Data"
E estou na pagina enter vehicle data
E preencho o campo make
E preencho o campo model
E preencho o campo cylinder capacity
E preencho o campo engine performance
E preencho o campo date of manufacture
E preencho o campo number of seats
E preencho o campo right hand drive
E preencho o campo number of seats moto
E preencho o campo fuel type
E preencho o campo payload
E preencho o campo total weight
E preencho o campo list price
E preencho o campo license plate number
E preencho o campo annual mileage
Entao eu clico no botao next para ir para a aba Insurant Data

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
| -- E preencho o campo picture -- |
Entao eu clico no botao next para ir para a aba Product Data

Cenario: Preencher o formulario da aba "Product Data"
E estou na pagina enter product data
E preencho o campo start date
E preencho o campo insurance sum
E preencho o campo merit rating
E preencho o campo damage insurance
E preencho o campo optional products
E preencho o campo courtesy car
Entao eu clico no botao next para ir para a aba Select Price Option

Cenario: Preencher o formulario da aba "Select Price Option"
E estou na pagina select price option
E seleciono a opcao Silver
E clico no botao View Quote
Entao eu clico no botao next para ir para a aba Send Quote

Cenario: Preencher o formulario da aba "Send Quote"
E estou na pagina send quote
E preencho o campo e-mail
E preencho o campo phone
E preencho o campo username
E preencho o campo password
E preencho o campo confirm password
E preencho o campo comments
Entao eu clico no botao send para enviar o formulario
