# language: pt
@ignore

Funcionalidade: Acessar o site da Tricents e preencher o formulario
Navegar no site da Tricents e simular o contrato de seguro de um veículo

Contexto: Navegar no site da Tricents
Dado que estou na pagina send quote

Cenario: Preencher o formulario da aba "Send Quote"
E preencho o campo e-mail
E preencho o campo phone
E preencho o campo username
E preencho o campo password
E preencho o campo confirm password
Entao eu clico no botao send para enviar o formulario
E verifico a mensagem "Sending e-mail success!"