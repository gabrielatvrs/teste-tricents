## Desafio: Automação de testes utilizando Selenium e Cucumber 

Utilizando o site http://sampleapp.tricentis.com/101/app.php, fazer o fluxo completo de cadastro para simular a contratação de um seguro de veículo. 

### Tecnologias utilizadas:

**Java**: Linguagem de programação utilizada

**Junit**: Framework com suporte à criação de testes automatizados na linguagem de programação Java 

**Selenium**: Framework responsável por fazer a integração do código Java com a linguagem Gherkin (Cucumber), abrindo o browser e realizando os testes de comportamento

**Cucumber**: Framework que suporta o desenvolvimento orientado pelo comportamento (BDD). Seu analisador de idioma comum é chamado Gherkin.

**Maven**: Ferramenta de automação de compilação utilizada

### Arquitetura de desenvolvimento do projeto:

O projeto é baseado no padrão de desenvolvimento Page Object Model (POM)

### Caso de teste: Acessar o site da Tricents e preencher os formulários

- Preencher o formulário da aba “Enter Vehicle Data” e pressionar "Next" para ir para a próxima aba;

- Preencher o formulário da aba “Enter Insurant Data” e pressionar "Next" para ir para a próxima aba;

- Preencher o formulário da aba “Enter Product Data” e pressionar "Next" para ir para a próxima aba;

- Preencher o formulário da aba “Select Price Option” e pressionar "Next" para ir para a próxima aba;

- Preencher o formulário da aba “Send Quote” e pressionar "Send";

- Verificar a mensagem “Sending e-mail success!” na tela.

##### Todos os elementos são validados antes das ações serem executadas.  

### Como utilizar:

- Pré requisitos:

Instalar o Java: https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR

Intalar o JDK (Java Development Kit): https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html

- Clone do projeto: 
```bash
git clone https://github.com/gasatabi/teste-tricents.git
```

- Entrando na pasta do projeto: 
```bash
cd teste-selenium
```

- Configurando Selenium no computador:<br>
Fazer o download do Chrome Web Driver e adiconar o arquivo (descompactado) dentro da pasta "driver" na raíz do projeto<br>https://chromedriver.chromium.org/downloads<br>
<br>Exemplo:<br>

<ul>
```
cd driver
curl https://chromedriver.storage.googleapis.com/89.0.4389.23/chromedriver_linux64.zip
unzip chromedriver_linux64.zip
rm -rf chromedriver_linux64.zip
cd ../driver
```
</ul>

- Limpando e validando Maven (Unix):
```bash
./mvnw clean
```

- Limpando e validando Maven (Windows):
```bash
mvnw.cmd clean
```

- Executando teste no Unix:
```bash
./test.sh
```

- Executando teste no Windows:
```bash
test.bat
```