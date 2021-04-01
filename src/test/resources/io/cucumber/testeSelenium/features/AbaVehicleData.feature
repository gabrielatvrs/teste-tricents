# language: pt
@ignore

Funcionalidade: Acessar o site da Tricents e preencher o formulario
Navegar no site da Tricents e simular o contrato de seguro de um veículo

Contexto: Navegar no site da Tricents
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