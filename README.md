![](https://img.shields.io/badge/java-v.1.8-blue.svg)
![](https://img.shields.io/badge/cucumber-v.0.0.1-yellow.svg)
![](https://img.shields.io/badge/selenium-v.3.141.59-green.svg)
![](https://img.shields.io/badge/maven-v.3.3-orange.svg)

# Time: 404 - O nome do grupo não existe!
Integrantes: <br>
<ul>
  <li>Elaine Moreira - https://github.com/Elainemor</li>
  <li>Kerolaine Gomes - https://github.com/kerollainy</li>
	<li>Manoela Paloma - https://github.com/Palinha07</li>
  <li>Regina Moura - https://github.com/ReginaMoura</li>
  <li>Victória Paiva - https://github.com/victoriardspaiva</li>
</ul>

# Descrição do desafio
### Criar uma aplicação Selenium com os seguintes casos de teste

### Caso de teste 1
Acessar o site da accenture e aceitar os cookies do LGPD<br>

<b>Cenário</b>: Aceitar o cookie LGPD<br>
dado que eu estou no site da accenture<br>
e aceito os termos LGPD<br>
Então deve fechar a caixa de informação<br>

<b>Cenário</b>: Configurações do cookie<br>
dado que eu estou no site da accenture<br>
e aceito os termos LGPD<br>
e clico em configurações de cookie<br>
Entao devo ver o item "Sua privacidade"<br>
E devo ver "Cookies estritamente necessarias"<br>
E devo ver "Cookies Analiticos de Primeira Parte"<br>
E devo ver "Cookies de Desempenho e Cookies Funcionais"<br>
E devo ver "Cookies de Publicidade e Redes Sociais"<br>

### Caso de teste 2
Acessar o site da accenture a mostrar a lista de serviços<br>

<b>Cenário</b>: listar serviços da Accenture<br>
dado que eu estou no site da accenture<br>
e clico no menu serviços<br>
Então devo ver os serviços abaixo<br>
- [x] Accenture Strategy
- [x] Application Services
- [x] Artificial Intelligence
- [x] Automation
- [x] Business Process Services
- [x] Change Management
- [x] Cloud
- [x] Customer Experience
- [x] Data & Analytics
- [x] Ecosystem Partners
- [x] Finance Consulting
- [x] Industry X
- [x] Infrastructure
- [x] Marketing
- [x] Mergers & Acquisitions (M&A)
- [x] Operating Models
- [x] Security
- [x] Supply Chain Management
- [x] Sustainability
- [x] Technology Consulting
- [x] Technology Innovation
- [x] Zero Based Budgeting (ZBB)

<b>Cenário</b>: Clicar no serviço cloud<br>
dado que eu estou no site da accenture<br>
e clico no menu serviços<br>
e clico no item do menu cloud<br>
Então devo encontrar o título "Serviços de Cloud"<br>

### Caso de teste 3
Acessar a lista de carreiras da accenture<br>

<b>Cenário</b>: Acessar o item de vagas<br>
Dado que eu estou no site da accenture<br>
Quando clico no menu carreiras<br>
E clico no item procurar por vagas<br>
E digito no campo de busca Desenvolvedor<br>
E clico no botao procurar<br>
Entao devo encontrar vagas para programadores<br>

### Caso de teste
Sobre a accenture<br>

<b>Cenário</b>: Ver as características da accenture<br>
dado que eu estou no site da accenture<br>
e clico no menu sobre a accenture<br>
e clico no item do menu sobre a accenture<br>
Então devo ver o destaque em "Nosso propósito"<br>

--------------------------------------------------------------------

## Tecnologias utilizadas
:heavy_check_mark: <b>Java</b><br>
Linguagem de programação para desenvolvimento da aplicação<br>

:heavy_check_mark: <b>Maven</b><br>
Gerenciador de dependências para o Java<br>

:heavy_check_mark: <b>Cucumber</b><br>
Framework responsável por traduzir uma linguagem humana em código Java<br>

:heavy_check_mark: <b>Selenium</b><br>
Framework responsável por fazer a integração do código Java com a linguagem Gherkin(Cucumber) abrindo o browser fazendo o teste de comportamento<br>

--------------------------------------------------------------------

## Como utilizar
### Pré requisitos
Instalar programas abaixo de acordo com seu sistema operacional.<br>
- Instalar o java:
https://www.java.com/pt-BR/download/ie_manual.jsp?locale=pt_BR
- Instalar jdk
https://www.oracle.com/br/java/technologies/javase/javase-jdk8-downloads.html
- Verificar se o JAVA_HOME está configurado em seu computador


- Clone do projeto
 ```bash
git clone https://github.com/victoriardspaiva/qa-projeto404
 ```

- Entrando na pasta do projeto
 ```bash
cd qa-projeto404
 ```

- Configurando Selenium em seu computador:
Fazer o download do Chrome Webdriver e colocar o arquivo descompactado dentro da pasta driver na raiz do projeto:<br>
https://chromedriver.chromium.org/downloads<br>

<b>Exemplo:</b><br>
 ```bash
cd driver
curl https://chromedriver.storage.googleapis.com/89.0.4389.23/chromedriver_linux64.zip
unzip chromedriver_linux64.zip
rm -rf chromedriver_linux64.zip
cd ../driver
 ```

- Limpando e validando maven Unix
 ```bash
./mvnw clean
 ```
 
- Limpando e validando maven Windows
 ```bash
mvnw.cmd clean
 ```

- Executando teste no Unix
 ```bash
./test.sh
 ```

- Executando teste no Windows
 ```bash
test.bat
 ```

--------------------------------------------------------------------
## Estrutura de arquivos

<br>
<pre>
├───.mvn
├───driver -- Este é o arquivo do selenium webdriver, substitua este arquivo com a versão da sua máquinajunit
├───src
│   └───test
│       ├───java
│       │   └───io
│       │       └───cucumber
│       │           └───grupo
│       │               ├───configuracao
│       |               |      └───Configuração.java   
|       |               ├───CasoDeTeste1Steps.java -- Teste dos Cookeis de privacidade 
|       |               ├───CasoDeTeste2Steps.java -- Teste listar serviços e Could
|       |               ├───CasoDeTeste3Steps.java -- Teste vagas de tecnologia
|       |               ├───CasoDeTeste4Steps.java -- Teste sobre a Accenture 
|       |               ├───CcompartihadoSteps.java -- Funções compartihadas
|       |               └───RunCucumberTest.java -- Execução do teste
|       └───resources        
│           └───io
│               └───cucumber
│                   └───grupo
|                       ├───CasoDeTeste1.feature -- Gherkin com os cenários dos Cookeis de privacidade
|                       ├───CasoDeTeste2.feature -- Gherkin com os cenários listar serviços e Could
|                       ├───CasoDeTeste3.feature -- Gherkin com os cenários vagas de tecnologia
|                       └───CasoDeTeste4.feature -- Gherkin com os cenários sobre a Accenture
|
├───test.bat -- Arquivo para rodar teste no Windows
└───test.sh -- Arquivo para rodar teste no Unix
</pre>
<br>

