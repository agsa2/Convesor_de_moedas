Conversor de Moedas

📖 Sobre o Projeto
Este é um projeto simples em Java para console que utiliza a ExchangeRate-API para realizar conversões de moedas em tempo real. O usuário pode escolher entre opções pré-definidas de conversão e ver o resultado diretamente no terminal.

✨ Funcionalidades
Menu Interativo: Interface de console amigável com um menu de opções para facilitar o uso.

Conversões Pré-definidas: 6 pares de moedas comuns prontos para conversão:

Dólar Americano (USD) ↔ Real Brasileiro (BRL)

Dólar Americano (USD) ↔ Peso Argentino (ARS)

Dólar Americano (USD) ↔ Euro (EUR)

Consulta em Tempo Real: As taxas de câmbio são obtidas em tempo real a cada consulta.

Tratamento de Erros: Validações básicas para garantir que a entrada do usuário seja um número e para lidar com possíveis erros de comunicação com a API.

🛠️ Pré-requisitos
Antes de começar, você vai precisar ter instalado em sua máquina:

Java Development Kit (JDK) - Versão 11 ou superior.

Uma IDE Java, como IntelliJ IDEA ou Eclipse.

A biblioteca Gson da Google para manipulação de JSON. Se estiver usando Maven ou Gradle, adicione a seguinte dependência:

Maven:

<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.10.1</version>
</dependency>

Gradle:

implementation 'com.google.code.gson:gson:2.10.1'

🚀 Como Executar
Obtenha uma Chave da API:

Acesse ExchangeRate-API e registre-se para obter uma chave de API gratuita.

Clone o Repositório:

git clone https://github.com/seu-usuario/seu-repositorio.git

Abra o Projeto:

Abra o projeto na sua IDE de preferência.

Execute a Classe Principal:

Encontre e execute o método main na classe principal/Main.java.

Siga as Instruções no Console:

O programa irá solicitar sua chave da API.

Depois, um menu com as opções de conversão será exibido. Basta digitar o número da opção desejada e o valor a ser convertido.

API Utilizada
ExchangeRate-API